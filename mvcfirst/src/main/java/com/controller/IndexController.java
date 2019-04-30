package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/home")
public class IndexController {
  
	/* http://localhost:5555/mvcfirst/home/id?id=5 */
  @RequestMapping(value = "/id") 
  String getIdByValue(@RequestParam("id") String personId){
    System.out.println("ID is "+personId);
    return "Get ID from query string of URL with value element";
  }
  
  /* http://localhost:5555/mvcfirst/home/personId?personId=5 */
  
  @RequestMapping(value = "/personId") 
  String getId(@RequestParam String personId){
    System.out.println("ID is "+personId); 
    return "Get ID from query string of URL without value element"; 
  }
}

