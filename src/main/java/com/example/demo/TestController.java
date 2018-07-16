package com.example.demo;


import com.fasterxml.jackson.databind.node.POJONode;
import com.google.gson.Gson;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @ResponseBody
    @RequestMapping("/v2/test")
    public String test(){
        TestPojo test = new TestPojo();
        test.id = "1256";
        test.name = "Kaustav";
        test.age = 25;
        Gson gson = new Gson();
        return gson.toJson(test);
    }
}
