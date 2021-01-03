package com.ssm.zxw.controller;

import com.alibaba.fastjson.JSONObject;
import com.ssm.zxw.entity.Student;
import com.ssm.zxw.service.IStudentService;
import com.ssm.zxw.utils.BaseResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

    @Autowired
    private IStudentService iStudentService;

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
    @RequestMapping(value = "/testResponse",produces = {"application/json;charset=UTF-8"})
    public Object testResponse(){
        System.out.println("a撒旦撒");
        Map<String,Object> map = new HashMap<>();
        map.put("zz",123);
        map.put("阿萨德",21423);

        return BaseResponseVO.success(map);
    }

    @ResponseBody
    @RequestMapping(value = "/getStudent",produces = {"application/json;charset=UTF-8"})
    public Object getStudent(){

        Student student = iStudentService.getStudent(1);

        return BaseResponseVO.success(student);
    }


    @ResponseBody
    @RequestMapping(value = "/getStudentById",produces = {"application/json;charset=UTF-8"})
    public Object getStudentById(HttpServletRequest request, HttpServletResponse response){
        int id =  Integer.parseInt(request.getParameter("id"));
        System.out.println("接受参数："+id);
        Student student = iStudentService.getStudent(id);
        return BaseResponseVO.success(student);
    }
}
