package com.itheima.hf.cloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * Lombok 自动生成  get/set 构造 toString等
 * @author NQ
 * @create 2019-05-23 11:27
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)  // 链式调用
public class Dept {

    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库


    public Dept(String dname){
        super();
        this.dname = dname;
    }
}
