package com.hxx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hxx.domain.TProduct;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description
 * Date 2026/3/9 18:32
 */
@Mapper
public interface ProductMapper extends BaseMapper<TProduct> {}