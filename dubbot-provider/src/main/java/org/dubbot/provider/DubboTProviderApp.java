package org.dubbot.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
public class DubboTProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(DubboTProviderApp.class, args);
    }

}
