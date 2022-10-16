package com.example.demo.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("*/users").setViewName("admin");
        registry.addViewController("*/home").setViewName("");
        registry.addViewController("").setViewName("");
        registry.addViewController("*/login").setViewName("login");
    }
}
