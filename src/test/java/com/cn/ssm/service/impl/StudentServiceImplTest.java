package com.cn.ssm.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cn.ssm.dao.BaseTest;
import com.cn.ssm.entity.Student;
import com.cn.ssm.service.IStudentService;
import com.google.gson.Gson;

public class StudentServiceImplTest extends BaseTest {

	@Autowired
	private IStudentService studentService;
	
	
	@Test
	public void testGetAll() {
		List<Student> students = studentService.getAll();
		System.out.println(new Gson().toJson(students));
	}

}
