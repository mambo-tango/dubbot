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
        for (int i = 1; i <= 100; i++) {
//            int param =  (int) (Math.random() * 2) +1;
            int param =1;
            rsc.getDetailFromRedis(param);
            rsc.helloTango2(param);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
    }

}
