package com.jiu.collect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 * @author liaoyj
 * @date 2020-10-21
 **/
@ComponentScan(basePackages = "com.jiu.*")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CollectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollectApplication.class, args);
    }

}
