package com.bigdatayu.springboot.springboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    @ResponseBody
    public String say() {
        return "say: Hello SpringBoot !";
    }


    @RequestMapping(value = "/mapvalue")
    @ResponseBody
    public Map<String, Object> mapvalue() {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("message", "Spring Boot Project");

        return retMap;
    }
}
