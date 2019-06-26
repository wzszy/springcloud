package com.itheima.hf.cloud.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestConfigController {

    @Autowired
    JdbcConfigBean jdbcConfigBean;

    @GetMapping("config")
    public String jdbcConfigBean() {
        return jdbcConfigBean.toString();
    }
}