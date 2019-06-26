package com.itheima.hf.cloud.api.dept;

import com.itheima.hf.cloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author NQ
 * @create 2019-05-25 16:37
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientServiceApi> {

    @Override
    public DeptClientServiceApi create(Throwable throwable) {
        return new DeptClientServiceApi() {

            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                System.out.println("DeptClientServiceFallbackFactory  熔断回调方法被调用.....");
                return new Dept().setDname("处理异常， 请稍后重试").setDeptno(-1L);
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
