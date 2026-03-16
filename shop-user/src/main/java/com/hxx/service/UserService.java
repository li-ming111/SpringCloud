package com.hxx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxx.domain.TUser;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description 1
 * Date 2026/3/9 17:50
 */
public interface UserService extends IService<TUser> {
    Page<TUser> getUserList(Page<TUser> page, String username);
    Page<TUser> getUserList1(int current,int size);
}
