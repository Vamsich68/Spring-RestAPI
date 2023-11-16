package com.SpringApi.RestApi.Services;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class Starter {
    @GetMapping(path="/hello-world")
    public  String Helloworldclass(){
        return "vamsi";
    }

}
