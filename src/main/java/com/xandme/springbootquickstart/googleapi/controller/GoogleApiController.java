package com.xandme.springbootquickstart.googleapi.controller;

import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.xandme.springbootquickstart.googleapi.service.GoogleApiService;

import java.util.List;

@RestController
@RequestMapping("api/")
public class GoogleApiController {

    @Autowired
    GoogleApiService googleApiService;

    @RequestMapping(value="{book}/{maxResults}/{orderBy}" , method =RequestMethod.GET)
    public List<String>  getInfoOnBooks(@PathVariable String book,@PathVariable String maxResults,@PathVariable String orderBy) {
        return googleApiService.getBooks(book,maxResults,orderBy);
    }

    @RequestMapping(value="{book}/{maxResults}" , method =RequestMethod.GET)
    public List<String>  getInfoOnBooksMaxResults(@PathVariable String book,@PathVariable String maxResults) {
        return googleApiService.getBooks(book,maxResults,"");
    }

    @RequestMapping(value="{book}" , method =RequestMethod.GET)
    public List<String>  getInfoOnBooks(@PathVariable String book) {
        return googleApiService.getBooks(book,"","");
    }


}
