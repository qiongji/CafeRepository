package com.zzzy.config;

import com.zzzy.config.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class WebConfigurer  implements WebMvcConfigurer {
    //将loginInterceptor注入到webconfigurer中
    @Resource
    private LoginInterceptor loginInterceptor;

    //这个方法是用来配置静态资源的，html，js,css等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //registry.addResourceHandler("/assets/**");
    }
    //这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    @Override
    public void  addInterceptors(InterceptorRegistry registry){
        // addPathPatterns("/**") 表示拦截所有的请求，
        // excludePathPatterns("/login", "/register") 表示除了登陆与注册之外，因为登陆注册不需要登陆也可以访问
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/login", "/register","/tologin","/assets/css/**","/assets/fonts/**","/assets/img/**","/assets/js/**");

    }







}
