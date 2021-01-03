package com.ssm.zxw.dao;

import com.ssm.zxw.entity.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentDao {
    Student getStudent(@Param("id") int id);

    int addStudentName(@Param("name") String name);

    int addStudent(@Param("stu") Student stu);
}
