package com.ssm.zxw.service;

import com.ssm.zxw.entity.Student;

public interface IStudentService {
    Student getStudent(int id);

    int addStudentName(String name);

    int addStudent(Student stu);
}
