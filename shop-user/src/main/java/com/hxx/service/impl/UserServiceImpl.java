package com.hxx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxx.domain.TUser;
import com.hxx.mapper.UserMapper;
import com.hxx.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description 1
 * Date 2026/3/9 17:52
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, TUser> implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public Page<TUser> getUserList(Page<TUser> page, String username) {
        return userMapper.selectPage(page, new LambdaQueryWrapper<TUser>()
                .like(username!=null,TUser::getUsername, username));
    }
    @Override
    public Page<TUser> getUserList1(int current, int size) {
        return userMapper.selectPage(new Page<TUser>(current,size),null);
    }
}
