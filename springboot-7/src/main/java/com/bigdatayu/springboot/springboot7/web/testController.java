package com.bigdatayu.springboot.springboot7.web;

import com.bigdatayu.springboot.springboot7.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public Object test(Integer id) {
        test a = testService.queryTestById(id);
        return a;
    }
}
