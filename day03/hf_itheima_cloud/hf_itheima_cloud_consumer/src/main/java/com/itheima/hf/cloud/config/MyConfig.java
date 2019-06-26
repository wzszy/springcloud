package com.itheima.hf.cloud.config;

import com.itheima.hf.rule.MyRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author NQ
 * @create 2019-05-23 14:38
 */
@Configuration
public class MyConfig {


    @Bean
//    @ConditionalOnMissingBean(RestTemplate.class)
    @LoadBalanced  // 负载均衡的工具类
    public RestTemplate restTemplate() {
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }


    @Bean
    public IRule myRule(){
        return new MyRule();
    }
}
