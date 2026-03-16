package com.hxx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hxx.domain.TOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description
 * Date 2026/3/9 19:08
 */
@Mapper
public interface OrderMapper extends BaseMapper<TOrder> {
}
