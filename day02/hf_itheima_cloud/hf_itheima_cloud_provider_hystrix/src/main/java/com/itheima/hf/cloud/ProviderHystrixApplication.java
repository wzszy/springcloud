package com.itheima.hf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author NQ
 * @create 2019-05-23 11:50
 */
@SpringBootApplication
@EnableEurekaClient   // Eureka client
//@EnableCircuitBreaker   //对hystrixR熔断机制的支持
@EnableHystrix
public class ProviderHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrixApplication.class, args);
    }

}
