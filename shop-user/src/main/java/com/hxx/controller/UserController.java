package com.hxx.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hxx.service.UserService;
import com.hxx.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description 1
 * Date 2026/3/9 17:54
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/page")
    public R getUserPage(Page page) {
        return R.ok().data("list", userService.getUserList(page,null).getRecords());
    }
    @GetMapping("/page1/{current}/{size}")
    public R getUserPage1(@PathVariable int current, @PathVariable int size) {
        return R.ok().data("list", userService.getUserList1(current,size).getRecords());
    }
    @GetMapping("/list")
    public R getUserList() {
        return R.ok().data("list", userService.list());
    }
}