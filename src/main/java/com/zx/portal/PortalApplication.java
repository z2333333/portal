package com.zx.portal;

import com.zx.portal.service.UserConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PortalApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(PortalApplication.class, args);

        UserConsumerService userConsumerService = run.getBean(UserConsumerService.class);
        userConsumerService.test();
    }

}
