package com.pluralsight.NorthwindTradersAPIAndSql.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping(path = "/",method = RequestMethod.GET)
    public String welcome(@RequestParam(defaultValue = "World")String Country){
        return "Hello "+ Country+","+ " welcome to the API";
    }
}
