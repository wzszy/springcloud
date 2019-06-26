package com.itheima.hf.cloud.controller;

import com.itheima.hf.cloud.api.dept.DeptClientServiceApi;
import com.itheima.hf.cloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author NQ
 * @create 2019-05-23 14:37
 */
@RestController
@RequestMapping("feign")
public class DeptController {

    @Autowired
    DeptClientServiceApi deptClientServiceApi;  // feign 通过ribbon实现当前接口代理对象


    @PostMapping(value = "/dept/add")
    public boolean add(Dept dept) {
        return deptClientServiceApi.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientServiceApi.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list() {
        return deptClientServiceApi.list();
    }


}
