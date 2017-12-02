package com.cn.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.ssm.dao.IStudentDao;
import com.cn.ssm.entity.Student;
import com.cn.ssm.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao studentDao;
	
	public List<Student> getAll() {
		return studentDao.findAll();
	}

}
