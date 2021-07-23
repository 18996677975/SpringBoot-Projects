package com.bigdatayu.springboot.springboot7.web;

import com.bigdatayu.springboot.springboot7.entity.executionJobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private ExecutionJobsService executionJobsService;

    @RequestMapping(value = "abc")
    @ResponseBody
    public Object jobs(Integer execId) {
        executionJobs execution_jobs = executionJobsService.query
    }
}
