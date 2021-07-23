package com.bigdatayu.springboot.springboot7.service.impl;

import com.bigdatayu.springboot.springboot7.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private test aMapper;

    @Override
    public test queryTestById(Integer id) {
        return aMapper.selectByPrimaryKey(id);
    }
}
