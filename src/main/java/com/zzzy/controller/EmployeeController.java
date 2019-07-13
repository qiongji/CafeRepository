package com.zzzy.controller;

import com.zzzy.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 16786
 * @Date 2019-07-12 18:18
 */
@Controller
@RequestMapping("front")
public class EmployeeController {
    @Resource
    private EmployeeService service;


    @RequestMapping("login")
    public String LoginEmp(HttpSession session,String eTelephone,String ePassword){
        List<Map<String,Object>> emps=service.LoginEmp(eTelephone,ePassword);
        if (emps.size()>0){
            session.setAttribute("emps",emps);
            System.out.println(1);
            return "1";
        }else{
            System.out.println(0);
            return "0";
        }

    }

    @RequestMapping("show")
    public String Show(){
        return "show";
    }


    
}
