package com.ssm.zxw.service.Impl;

import com.ssm.zxw.dao.StudentDao;
import com.ssm.zxw.entity.Student;
import com.ssm.zxw.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements IStudentService {


    @Resource
    private StudentDao studentDao;

    @Override
    public Student getStudent(int id) {
        System.out.println("【StudentServiceImpl -> getStudent】");
        return studentDao.getStudent(id);
    }
}
