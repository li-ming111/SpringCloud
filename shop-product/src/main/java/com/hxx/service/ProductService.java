package com.hxx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxx.domain.TProduct;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description
 * Date 2026/3/9 18:33
 */
public interface ProductService extends IService<TProduct> {
    Page<TProduct> findPage(Page<TProduct> page);
}
