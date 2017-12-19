package com.xandme.springbootquickstart.googleapi.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
//import com.google.gson.Gson;
//import com.google.common.reflect.TypeToken;
//import java.lang.reclect.Type;



@Component
public class GoogleApiService {

    public String getdocuments() {

        //Object obj = parser.parse(resp);
       // JSONObject jsonObject = (JSONObject) obj;

        //Response res = get("/service/example");
        RestTemplate restTemplate = new RestTemplate();

        String jsonInString =  restTemplate.getForObject("https://www.googleapis.com/books/v1/volumes?q=python&maxResults=3", String.class);
      //  JsonElement root = new JsonParser().parse(jsonString);

        //ObjectMapper objectMapper = new ObjectMapper();
       // java.util.Map<String, Object> jsonMap = objectMapper.readValue(jsonInString   , java.util.HashMap.class);

        return jsonInString;

    }

}
