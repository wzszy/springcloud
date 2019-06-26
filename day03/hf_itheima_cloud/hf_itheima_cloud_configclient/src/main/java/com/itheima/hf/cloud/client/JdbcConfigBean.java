package com.itheima.hf.cloud.client;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author NQ
 * @create 2019-05-27 15:04
 */
@Component//加入到Spring容器
@Data
@RefreshScope // 更新
public class JdbcConfigBean {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.driverClassName}")
    private String driverClassName;

}
