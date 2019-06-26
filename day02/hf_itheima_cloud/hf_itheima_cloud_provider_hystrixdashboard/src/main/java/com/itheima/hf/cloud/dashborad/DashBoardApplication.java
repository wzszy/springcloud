package com.itheima.hf.cloud.dashborad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author NQ
 * @create 2019-05-25 16:50
 */
@SpringBootApplication
@EnableHystrixDashboard   // 开启 健康监测 仪表盘
public class DashBoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(DashBoardApplication.class,args);
    }
}