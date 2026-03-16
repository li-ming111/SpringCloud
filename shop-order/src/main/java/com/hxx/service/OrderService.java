package com.hxx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxx.domain.TOrder;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description
 * Date 2026/3/9 19:09
 */
public interface OrderService extends IService<TOrder> {
    Page<TOrder> getOrderList(Page<TOrder> page);
}
