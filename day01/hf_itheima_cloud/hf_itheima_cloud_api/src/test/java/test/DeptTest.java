package test;

import com.itheima.hf.cloud.pojo.Dept;

/**
 * @author NQ
 * @create 2019-05-23 11:35
 */
public class DeptTest {

    public static void main(String[] args) {

        Dept dept = new Dept().setDname("合肥");

//        dept.setDname("合肥");
//        dept.setDeptno(1L);
////        dept.setDb_source();

        System.out.println(dept);
    }
}
