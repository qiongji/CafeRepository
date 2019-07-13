package com.zzzy.config.interceptor;

import com.zzzy.entity.Employee;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    //这个方法是在访问接口之前执行的，我们只需要在这里写验证登录状态的业务逻辑，就可以在用户调用指定接口之前验证登录状态了
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception{
       boolean flag=true;
        String basePath = request.getContextPath();
        String path = request.getRequestURI();
        //每一个项目对于登陆的实现逻辑都有所区别，我这里使用最简单的Session提取User来验证登陆。
        HttpSession session = request.getSession();
        //这里的O_employee是登陆时放入session的
        Employee employee = (Employee) session.getAttribute("employee");
        //如果session中没有employee，表示没登陆
        if (null==employee  ||employee.equals("")){
            //这个方法返回false表示忽略当前请求，如果一个用户调用了需要登陆才能使用的接口，如果他没有登陆这里会直接忽略掉
            //当然你可以利用response给用户返回一些提示信息，告诉他没登陆
           // log.info("尚未登录，跳转到登录界面");
            System.out.println("没有登录");
            System.out.println(request.getContextPath()+"/tologin");
            response.sendRedirect(request.getContextPath()+"/tologin");
            flag=false;
        }else {
            flag= true;    //如果session里有employee，表示该用户已经登陆，放行，用户即可继续调用自己需要的接口
        }
        return flag;

    }









    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }




}
