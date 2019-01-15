package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nick
 */
@RestController
public class TestContrller {

    @GetMapping("/test")
    public String Test(String str){
        String str1 = "123321";
        return str;
    }

}
