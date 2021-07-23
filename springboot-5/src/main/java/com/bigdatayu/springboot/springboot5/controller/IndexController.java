package com.bigdatayu.springboot.springboot5.controller;

import com.bigdatayu.springboot.springboot5.entity.My;
import com.bigdatayu.springboot.springboot5.entity.Wife;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @Autowired
    private My my;

    @Autowired
    private Wife wife;

    @RequestMapping(value = "say")
    @ResponseBody
    public String say() {
        return "my.name=" + my.getName() + "=========my.age=" + my.getAge() + "\nwife.name=" + wife.getName() + "=========wife.age=" + wife.getAge();
    }
}
