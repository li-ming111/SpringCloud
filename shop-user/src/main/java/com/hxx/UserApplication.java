package com.hxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description 1
 * Date 2026/3/9 17:41
 */
@SpringBootApplication
@MapperScan("com.hxx.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
