package com.bigdatayu.springboot.springboot4.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Value("${my.name}")
    private String myname;

    @Value("${my.age}")
    private int myage;

    @Value("${wife}")
    private String mywife;

    @RequestMapping(value = "test")
    @ResponseBody
    public String say() {
        return "Hello" + myname + mywife + myage;
    }
}
