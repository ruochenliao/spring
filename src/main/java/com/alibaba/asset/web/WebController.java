package com.alibaba.asset.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class WebController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){
        return "this is home";
    }
}
