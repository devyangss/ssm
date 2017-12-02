package com.cn.ssm.dao;

import java.util.List;

import com.cn.ssm.entity.Student;

public interface IStudentDao {

	public List<Student> findAll();
}
