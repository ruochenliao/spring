package com.alibaba.asset.web;

import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages={"com.alibaba.asset"})
public class Application {
    public static void main(String[] args){
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
    }
}
