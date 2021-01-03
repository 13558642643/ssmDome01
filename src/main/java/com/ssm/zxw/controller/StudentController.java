package com.ssm.zxw.controller;

import com.ssm.zxw.entity.Student;
import com.ssm.zxw.service.IStudentService;
import com.ssm.zxw.utils.BaseResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：mmzs
 * @date ：Created in 2021/1/3 15:08
 * @description：学生类的controller
 * @modified By：
 * @version: 1.0$
 */
@RestController
@RequestMapping( "/student" )
public class StudentController {

    @Autowired
    private IStudentService iStudentService;

    @ResponseBody
    @RequestMapping(value = "/getStudentById",produces = {"application/json;charset=UTF-8"})
    public Object getStudentById(HttpServletRequest request, HttpServletResponse response){
        int id =  Integer.parseInt(request.getParameter("id"));
        System.out.println("接受参数："+id);
        Student student = iStudentService.getStudent(id);
        return BaseResponseVO.success(student);
    }

    /**
     * 插入数据并返回ID
     * @param request
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addStudent",produces = {"application/json;charset=UTF-8"})
    public Object addStudent(HttpServletRequest request, HttpServletResponse response){

        String name = request.getParameter("name");
        Student student = new Student();
        student.setName(name);
        int num = iStudentService.addStudent(student);
        System.out.println("插入数据并返回ID****"+student.getId());
        return BaseResponseVO.success(student.getId());
    }

    @ResponseBody
    @RequestMapping(value = "/addStudentName",produces = {"application/json;charset=UTF-8"})
    public Object addStudentName(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        System.out.println("接受参数："+name);
        int num = iStudentService.addStudentName(name);
        System.out.println("num"+num);

        return BaseResponseVO.success(num);
    }

}
