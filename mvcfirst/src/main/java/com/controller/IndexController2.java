package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class IndexController2 {
 
@RequestMapping(value={"", "/page", "page*","/view","*/msg"})
  String indexMultipleMapping(){
    return "Hello from index multiple mapping.";
  }
}

