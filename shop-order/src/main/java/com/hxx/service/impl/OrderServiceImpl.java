package com.hxx.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxx.domain.TOrder;
import com.hxx.mapper.OrderMapper;
import com.hxx.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description
 * Date 2026/3/9 19:09
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, TOrder>
        implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Page<TOrder> getOrderList(Page<TOrder> page) {
        return orderMapper.selectPage(page, null);
    }
}
