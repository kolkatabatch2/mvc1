package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/home2")
public class IndexController3 {
  @RequestMapping(value = "/fetch/{id}", method = RequestMethod.GET)
  String getDynamicUriValue(@PathVariable String id){
    System.out.println("ID is "+id);
    return "Dynamic URI parameter fetched"; 
  } 
  @RequestMapping(value = "/fetch/{id:[a-z]+}/{name}", method = RequestMethod.GET)
    String getDynamicUriValueRegex(@PathVariable("name") String name){
    System.out.println("Name is "+name);
    return "Dynamic URI parameter fetched using regex"; 
  } 
}
