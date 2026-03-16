package com.hxx.utils;

import lombok.Data;
import java.util.HashMap;
import java.util.Map;
@Data
public class R {

    private Boolean success;
    private String msg;
    private Integer code;
    private Map<String,Object> data = new HashMap<>();

    private R(){}

    public static R ok(){
        R r = new R();
        r.setSuccess(true);
        r.setCode(200);
        r.setMsg("成功");
        return r;
    }
    public static R error(){
        R r = new R();
        r.setSuccess(false);
        r.setCode(201);
        r.setMsg("失败");
        return r;
    }

    public R success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public R code(int code){
        this.setCode(code);
        return this;
    }

    public R msg(String msg){
        this.setMsg(msg);
        return this;
    }
    public R data(Map map){
        this.setData(map);
        return this;
    }

    public R data(String key,Object value){
        this.data.put(key,value);
        return this;
    }
}