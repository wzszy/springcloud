package com.itheima.hf.cloud;

import com.itheima.hf.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author NQ
 * @create 2019-05-23 14:36
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "HF-ITHEIMA-CLOUD-PROVIDER",configuration = MyRule.class)
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }


}
