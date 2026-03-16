package com.hxx.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description
 * Date 2026/3/11 18:31
 */
@FeignClient("service-product")
public interface FeignProduct {

    @GetMapping("/product/show")
    public String show();

    @GetMapping("/product/show1/{name}/{age}")
    public String show1(@RequestParam String name,@RequestParam String age);

    @GetMapping("/product/show2/{age}")
    public String show2(@PathVariable String age);
}
