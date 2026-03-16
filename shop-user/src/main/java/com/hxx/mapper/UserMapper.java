package com.hxx.mapper;

/**
 * @author siming
 * @version 1.0
 * Project SIM-SSM
 * Description 1
 * Date 2026/3/9 17:50
 */
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hxx.domain.TUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<TUser> {}
