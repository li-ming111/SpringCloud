package com.hxx.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hxx.domain.TOrder;
import com.hxx.service.FeignProduct;
import com.hxx.service.OrderService;
import com.hxx.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description
 * Date 2026/3/9 19:12
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService service;

    @Autowired
    private FeignProduct feignProduct;

    @GetMapping("/find1")
    public String find1(){
        return feignProduct.show();
    }

    @GetMapping("/find2")
    public String find2(@RequestParam String name,@RequestParam String age){
        return feignProduct.show1(name,age);
    }

    @GetMapping("/find3")
    public String find3(@PathVariable String age){
        return feignProduct.show2(age);
    }
  
    @PostMapping("/save")
    public R save(@RequestBody TOrder order){
        service.save(order);
        return R.ok();
    }
    @GetMapping("/page")
    public R find(Page page){
        service.getOrderList(page);
        return R.ok().data("list", page.getRecords()).data("total", page.getTotal());
    }
}