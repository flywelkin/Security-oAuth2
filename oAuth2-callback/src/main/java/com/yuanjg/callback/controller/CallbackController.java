package com.yuanjg.callback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class CallbackController {

    @GetMapping("/callback")
    public void callback(String code){
        System.out.println(code);
    }
}
