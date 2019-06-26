package com.itheima.hf.cloud.mapper;

import com.itheima.hf.cloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author NQ
 * @create 2019-05-23 11:51
 */
@Mapper
public interface DeptMapper {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
