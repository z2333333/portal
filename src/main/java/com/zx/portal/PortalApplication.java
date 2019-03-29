package com.zx.portal;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import dubbo.service.UserConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubboConfiguration
@ComponentScan(basePackages = {"dubbo.service"})
public class PortalApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(PortalApplication.class, args);

        UserConsumerService userConsumerService = run.getBean(UserConsumerService.class);
        userConsumerService.test();
    }

}
