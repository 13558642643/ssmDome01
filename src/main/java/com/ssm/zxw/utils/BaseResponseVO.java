package com.ssm.zxw.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * @author : ZXW
 * @version : 1.0
 * @date : 2020-12-29 9:45
 * @Description :
 */
public class BaseResponseVO<T> {
    private  Integer code;  //业务编码
    private String msg;     //异常信息
    private T data;         //业务数据返回



    //成功返回  无参数
    public static String success() {
        BaseResponseVO baseResponseVO = new BaseResponseVO();
        baseResponseVO.setCode(200);
        baseResponseVO.setMsg("成功");
        return  JSONObject.toJSONString(baseResponseVO);
    }

    //成功返回  有参数
    public static<T> String success(T data) {
        BaseResponseVO baseResponseVO = new BaseResponseVO();
        baseResponseVO.setCode(200);
        baseResponseVO.setMsg("成功");
        baseResponseVO.setData(data);
        String str = JSONObject.toJSONString(baseResponseVO);

        return  str;
    }

    //业务异常
    public static<T> String error(int code,String msg) {
        BaseResponseVO baseResponseVO = new BaseResponseVO();
        baseResponseVO.setCode(code);
        baseResponseVO.setMsg(msg);
        return  JSONObject.toJSONString(baseResponseVO);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private BaseResponseVO() {

    }
}
