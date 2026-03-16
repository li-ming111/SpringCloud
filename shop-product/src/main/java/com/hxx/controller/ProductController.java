package com.hxx.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hxx.domain.TProduct;
import com.hxx.service.ProductService;
import com.hxx.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description
 * Date 2026/3/9 18:35
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    // Feign远程的
    @GetMapping("/show")
    public String show(){
        return "返回商品模块的信息";
    }

    @GetMapping("/show1")
    public String show1(@RequestParam String name,@RequestParam String age){
        return "返回商品模块的信息---"+name+"---"+age;
    }

    @GetMapping("/show2")
    public String show2(@PathVariable String age){
        return "返回商品模块的信息---"+age;
    }

    @PostMapping("/save")
    public R save(@RequestBody TProduct product) {
        return productService.save(product) ? R.ok() : R.error();
    }
    @PostMapping("/list")
    public R list(@RequestBody Page page) {
        return R.ok().data("list", productService.findPage(page));
    }
    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable Long id) {
        return productService.removeById(id) ? R.ok() : R.error();
    }

}
