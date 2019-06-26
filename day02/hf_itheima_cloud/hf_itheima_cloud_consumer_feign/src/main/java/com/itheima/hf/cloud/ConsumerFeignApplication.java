package com.itheima.hf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author NQ
 * @create 2019-05-23 14:36
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients  // 开启 feign的 支持  basePackages
public class ConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApplication.class, args);
    }


}
