package com.itheima.hf.cloud.controller;

import com.itheima.hf.cloud.pojo.Dept;
import com.itheima.hf.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author NQ
 * @create 2019-05-23 11:55
 */
@RestController
public class DeptController {

    @Autowired
    DeptService deptService;

    @PostMapping(value="/dept/add")
    public boolean add(@RequestBody Dept dept)  {
        return deptService.add(dept);
    }

    @GetMapping(value="/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)  {
        return deptService.get(id);
    }

    @GetMapping(value="/dept/list")
    public List<Dept> list()  {
        return deptService.list();
    }


    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/provider/discovery")
    public Object discovery(){
        // 从 Eureka server中获取 所有的服务的列表
        List<String> list = discoveryClient.getServices();
        System.out.println(list);
        List<ServiceInstance> insList = discoveryClient.getInstances("HF-ITHEIMA-CLOUD-PROVIDER");
        for (ServiceInstance si:insList) {
            System.out.println(si.getHost() +"," + si.getServiceId() +"," +si.getPort() +"," +si.getUri() +"," +si.getMetadata());
        }
        return this.discoveryClient;
    }
}
