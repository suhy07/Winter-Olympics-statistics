package com.demo.springboot.controller;

import com.demo.springboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.net.URLEncoder;

@RestController
@RequestMapping("/api")  //再加一层路径
public class HelloController {

    @Autowired
    HelloService helloService;

    @ResponseBody
    @RequestMapping("/hello/{name}/{age}")  //控制路径
    public String hello(@PathVariable("age") String name, @PathVariable("name") int age) {  // hello?name=3
        return "hello "+ name+" your age is"+age;
    }

    @ResponseBody
    @RequestMapping("/service")
    public String helloService() {
        return helloService.sayHello();
    }

    @ResponseBody
    @GetMapping("/json")
    public String export() throws IOException {
         String filename = "./springboot/data/data/schedule/0202.json";
         String s;
         StringBuffer stringBuffer = new StringBuffer("");
         BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
         while((s=bufferedReader.readLine()) != null) {
             stringBuffer.append(s);
         }
         bufferedReader.close();
         return stringBuffer.toString();
    }
}


