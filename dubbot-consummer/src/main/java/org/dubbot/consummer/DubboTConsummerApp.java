package org.dubbot.consummer;

import org.dubbot.consummer.dubbo.TangoServiceConsummerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
public class DubboTConsummerApp {
    public static final Logger LOGGER = LoggerFactory.getLogger(DubboTConsummerApp.class);

    public static void main(String[] args) {
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ConfigurableApplicationContext run = SpringApplication.run(DubboTConsummerApp.class, args);
        TangoServiceConsummerImpl rsc = run.getBean(TangoServiceConsummerImpl.class);
        for (int i = 0; i < 10; i++) {
            LOGGER.info("result -----> "+rsc.getDetailFromRedis("811841438978"+i));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
    }

}
