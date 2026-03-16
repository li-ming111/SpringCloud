package com.hxx;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description
 * Date 2026/3/9 19:07
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(OrderApplication.class, args);
    }
}
