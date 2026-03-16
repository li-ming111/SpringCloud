package com.hxx.domain;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@Data
@TableName("t_product")
public class TProduct {
    @TableId(type = IdType.AUTO)
    private Integer pid;//主键
    private String pname;//商品名称
    private Double price;//商品价格
    private Integer stock;//库存
}