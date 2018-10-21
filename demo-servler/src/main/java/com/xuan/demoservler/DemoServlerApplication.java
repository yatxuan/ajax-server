package com.xuan.demoservler;

import com.xuan.demoservler.utils.Crosfilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoServlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServlerApplication.class, args);
    }

   /* @Bean
    public FilterRegistrationBean registrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean();

        bean.addUrlPatterns("/*");
        bean.setFilter(new Crosfilter());

        return bean;
    }*/
}
