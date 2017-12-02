package com.cn.ssm.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cn.ssm.entity.Student;
import com.google.gson.Gson;

public class IStudentDaoTest extends BaseTest {
	
	@Autowired
	private IStudentDao studentDao;

	@Test
	public void testFindAll() {
		List<Student> students = studentDao.findAll();
		if (!students.isEmpty()) {
			System.out.println(new Gson().toJson(students));
		}
	}

}
