package com.bigdatayu.springboot.springboot6.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    public ModelAndView say(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello, Spring Boot!");
        mv.setViewName("say");
        return mv;
    }
}
