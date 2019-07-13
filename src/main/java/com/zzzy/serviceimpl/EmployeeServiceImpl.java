package com.zzzy.serviceimpl;

import com.zzzy.idao.IEmployeeDao;
import com.zzzy.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 16786
 * @Date 2019-07-12 18:17
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    private IEmployeeDao dao;

    @Override
    public List<Map<String, Object>> LoginEmp(String eTelephone, String ePassword) {
        return dao.LoginEmp(eTelephone,ePassword);
    }
}
