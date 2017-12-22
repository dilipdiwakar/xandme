package com.xandme.springbootquickstart.googleapi.service;


import com.xandme.springbootquickstart.googleapi.model.Example;
import com.xandme.springbootquickstart.googleapi.model.RetailPrice;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.*;

@Component
public class GoogleApiService {

    public List<String>  getBooks(String search,String maxResults  , String OrderBy) {

        System.out.println("Before :" + search +":"+maxResults+":"+OrderBy);

        StringBuilder searchParam=new StringBuilder();
        if (search !=null)
            searchParam.append("q=").append(search);

        StringBuilder maxDisplayResults=new StringBuilder();
        if (maxResults !=null && !"".equals(maxResults))
            maxDisplayResults.append("&maxResults=").append(maxResults);

        RestTemplate restTemplate = new RestTemplate();

        System.out.println("URL = https://www.googleapis.com/books/v1/volumes?" +searchParam+maxDisplayResults);
        String jsonInString =  restTemplate.getForObject("https://www.googleapis.com/books/v1/volumes?" +searchParam+maxDisplayResults, String.class);
        ;
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        Example model = null;
        try {
            model = mapper.readValue(jsonInString, Example.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(model);
        File file = new File("/Users/dselvaraj/Documents/sample.csv");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("Id", "Kind", "Title","SubTitle","RatingsCount","MaturityRating","PageCount","PublishedDate","AverageRating","Price"));
            for (int i=0;i< model.getItems().size();i++) {
                String id = model.getItems().get(i).getId();
                String kind= model.getItems().get(i).getKind();
                String title= model.getItems().get(i).getVolumeInfo().getTitle();
                String subTitle= model.getItems().get(i).getVolumeInfo().getSubtitle();
                int ratingCount= model.getItems().get(i).getVolumeInfo().getRatingsCount();
                String maturityRating= model.getItems().get(i).getVolumeInfo().getMaturityRating();
                int pageCount = model.getItems().get(i).getVolumeInfo().getPageCount();
                String publishedDate = model.getItems().get(i).getVolumeInfo().getPublishedDate();
                int averageRating= model.getItems().get(i).getVolumeInfo().getAverageRating();

                double price=0;
                RetailPrice retailPrice = model.getItems().get(i).getSaleInfo().getRetailPrice();
                if (retailPrice != null){
                    price= model.getItems().get(i).getSaleInfo().getRetailPrice().getAmount();
                }
                else
                    price=0;
                csvPrinter.printRecord(id,kind,title,subTitle,ratingCount,maturityRating,pageCount,publishedDate,averageRating,price);
            }
            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }



        CSVParser csvParser = null;
        try {
         BufferedReader reader = new BufferedReader(new FileReader(file));
         CSVFormat csvFormat = CSVFormat.RFC4180.withHeader("Id,Kind,Title,SubTitle,RatingsCount,MaturityRating,PageCount,PublishedDate,AverageRating,Price".split(","));
          csvParser = new CSVParser(reader, csvFormat);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<CSVRecord> records=null;
        try {
            records = csvParser.getRecords();
            System.out.println("record size :"+ records.size());
           // System.out.println("Printing :" +records.get(1).get("Title"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String sortParam = OrderBy;
        if ( sortParam.equals("PublishedDate") ||sortParam.equals("MaturityRating") ) {
            stringSortList(records, sortParam);
        }
        if ( sortParam.equals("RatingCount") ||sortParam.equals("PageCount") ||sortParam.equals("AverageRating")||sortParam.equals("Price")) {
            numericSortList(records, sortParam);
        }


        List<String> resultedString = new ArrayList<String>();
        for (CSVRecord record : records){
            String formattedString =format(record);
            if (!formattedString.equals(""))
                    resultedString.add(formattedString);
        }
        return resultedString;

    }

    private String format(CSVRecord c) {
        StringBuilder sb = new StringBuilder();
        if (!"Id".equals(c.get("Id"))) {

            sb.append(c.get("Id"))
                    .append(":")
                    .append(c.get("Kind"))
                    .append(":")
                    .append(c.get("Title"))
                    .append(":")
                    .append(c.get("SubTitle"))
                    .append(":")
                    .append(c.get("RatingsCount"))
                    .append(":")
                    .append(c.get("MaturityRating"))
                    .append(":")
                    .append(c.get("AverageRating"))
                    .append(":")
                    .append(c.get("Price"));
        }


        return sb.toString();
    }

    private void stringSortList(List<CSVRecord> records, String sortParam) {

            Collections.sort(records, new Comparator<CSVRecord>() {
                @Override
                public int compare(CSVRecord o1, CSVRecord o2) {
                    return o1.get(sortParam).compareTo(o2.get(sortParam));
                }
            });
    }

    private void numericSortList(List<CSVRecord> records, String sortParam) {

        Collections.sort(records, new Comparator<CSVRecord>() {
            @Override
            public int compare(CSVRecord o1, CSVRecord o2) {
                return o1.get(sortParam).compareTo(o2.get(sortParam));
            }
        });
    }
}
