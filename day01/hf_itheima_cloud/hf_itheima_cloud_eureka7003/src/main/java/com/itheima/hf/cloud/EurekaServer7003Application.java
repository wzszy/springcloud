package com.itheima.hf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author NQ
 * @create 2019-05-23 15:34
 */
@SpringBootApplication
@EnableEurekaServer   // 开启 EurekaServer 支持
public class EurekaServer7003Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003Application.class, args);
    }

}
