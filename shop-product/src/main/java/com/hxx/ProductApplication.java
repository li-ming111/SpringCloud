package com.hxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description
 * Date 2026/3/9 18:30
 */
@SpringBootApplication
@MapperScan("com.hxx.mapper")
@EnableDiscoveryClient
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}