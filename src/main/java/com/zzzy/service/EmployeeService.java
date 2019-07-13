package com.zzzy.service;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 16786
 * @Date 2019-07-12 18:16
 */
@Mapper
public interface EmployeeService {
    List<Map<String,Object>> LoginEmp(@Param("eTelephone") String eTelephone, @Param("ePassword") String ePassword);
}
