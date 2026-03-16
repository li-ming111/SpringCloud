package com.hxx.domain;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@Data
@TableName("t_order")
public class TOrder {

    @TableId(type = IdType.AUTO)
    private Integer oid;//订单id
    private Integer uid;//用户id
    private String username;//用户名
    private Integer pid;//商品id
    private String pname;//商品名称
    private Double price;//商品单价
    private Integer number;//购买数量
}