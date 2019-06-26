package com.itheima.hf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author NQ
 * @create 2019-05-23 11:50
 */
@SpringBootApplication
@EnableEurekaClient   // Eureka client
public class ProviderApplication8002 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication8002.class, args);
    }

}
