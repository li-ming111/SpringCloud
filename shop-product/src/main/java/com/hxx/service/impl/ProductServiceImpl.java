package com.hxx.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxx.domain.TProduct;
import com.hxx.mapper.ProductMapper;
import com.hxx.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description
 * Date 2026/3/9 18:34
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, TProduct> implements ProductService {
    @Override
    public Page<TProduct> findPage(Page<TProduct> page) {
        return baseMapper.selectPage(page,null);
    }
}
