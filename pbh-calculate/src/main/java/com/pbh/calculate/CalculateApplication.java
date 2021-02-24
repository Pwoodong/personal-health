package com.pbh.calculate;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author liaoyj
 * @date 2020-10-21
 **/
@EnableDubbo
@MapperScan(basePackages = "com.pbh.calculate.mapper")
@SpringBootApplication
public class CalculateApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculateApplication.class, args);
    }

}
