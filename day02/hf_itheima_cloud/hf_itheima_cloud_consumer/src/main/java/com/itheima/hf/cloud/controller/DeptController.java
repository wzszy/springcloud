package com.itheima.hf.cloud.controller;

import com.itheima.hf.cloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author NQ
 * @create 2019-05-23 14:37
 */
@RestController
public class DeptController {

    @Autowired
    RestTemplate restTemplate;

    // http://localhost:8001/dept/list
    /**
     * 1 硬编码  （IP   端口 ）
     * 2 如果环境发送变更， 维护难度很大
     * 3 请求URL会变化， cloud 也是基于 接口调用
     * 4 项目越复杂， 系统调用就会更复杂
      */
    private static final String REST_URL_PREFIX = "http://HF-ITHEIMA-CLOUD-PROVIDER";


    @GetMapping(value = "/dept/list")
    public List<Dept> findAll() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
    }


    @PostMapping(value = "/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @GetMapping("/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/discovery",Object.class);
    }


}
