package com.mypack.SBT1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;  
@RestController
@RequestMapping("/api/v1/") //api call address
@CrossOrigin(origins = "http://localhost:8080")
public class HelloWorld  
{  
@RequestMapping("/test1")  //http://localhost:8080/api/v1/test1
public String hello()   
{  
return "Hello javamyexample2345";  
}  
@RequestMapping(value="/test2", method=RequestMethod.POST)//http://localhost:8080/test2?id=1
public String hello2(@RequestParam("id") String id)   
{  
return "Hello java "+id;  
} 
@RequestMapping(value="/test3/{id}", method=RequestMethod.POST)//http://localhost:8080/test3/1
public String hello3(@PathVariable String id)   
{  
return "Hello my java "+id;  
} 

}  