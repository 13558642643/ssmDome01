package com.ssm.zxw.controller;

import com.alibaba.fastjson.JSONObject;
import com.ssm.zxw.utils.BaseResponseVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : ZXW
 * @version : 1.0
 * @date : 2020-12-28 14:44
 * @Description :
 */
@RestController
@RequestMapping( "/test" )
public class TestController {
    @ResponseBody
    @RequestMapping(value = "/getJson",produces = "application/json;charset=UTF-8")
    public Object getJson(){
        System.out.println("是是是");
        Map<String,Object> map = new HashMap<>();
        map.put("zz",123);
        map.put("sdf",21423);
        JSONObject json = new JSONObject(map);
        System.out.println(json.toJSONString());
        return json.toJSONString();
    }

    @ResponseBody
    @RequestMapping(value = "/testResponse",produces = {"application/json;charset=GB2312"})
    public Object testResponse(){

        Map<String,Object> map = new HashMap<>();
        map.put("zz",123);
        map.put("阿萨德",21423);

        return BaseResponseVO.success(map);
    }
}
