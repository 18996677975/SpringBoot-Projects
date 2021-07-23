package com.bigdatayu.springboot.springboot7.mapper;

import com.bigdatayu.springboot.springboot7.entity.executionJobs;

public interface executionJobsMapper {
    int insert(executionJobs record);

    int insertSelective(executionJobs record);
}