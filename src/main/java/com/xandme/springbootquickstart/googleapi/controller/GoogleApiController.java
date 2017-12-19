package com.xandme.springbootquickstart.googleapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.xandme.springbootquickstart.googleapi.service.GoogleApiService;
@RestController
@RequestMapping("api/")
public class GoogleApiController {

    @Autowired
    GoogleApiService googleApiService;

    @RequestMapping(value="hello" , method =RequestMethod.GET)
    public String Hellomethod() {
        return googleApiService.getdocuments();
    }

    @RequestMapping(value="hello/{id}" , method =RequestMethod.GET)
    public String Helloonemethod(@PathVariable String id) {
        return googleApiService.getdocuments();
    }
}
