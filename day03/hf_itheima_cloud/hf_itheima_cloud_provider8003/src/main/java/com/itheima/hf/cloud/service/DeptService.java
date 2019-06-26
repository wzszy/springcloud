package com.itheima.hf.cloud.service;

import com.itheima.hf.cloud.mapper.DeptMapper;
import com.itheima.hf.cloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author NQ
 * @create 2019-05-23 11:54
 */
@Service
public class DeptService {

    @Autowired
    DeptMapper deptMapper;

    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }

    public Dept get(Long id) {
        return deptMapper.findById(id);
    }

    public List<Dept> list() {
        return deptMapper.findAll();
    }
}
