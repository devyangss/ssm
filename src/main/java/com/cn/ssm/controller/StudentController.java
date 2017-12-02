package com.cn.ssm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cn.ssm.entity.Student;
import com.cn.ssm.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	private Logger Logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IStudentService studentService;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public String all(ModelMap model) {
		Logger.debug("requesting");
		List<Student> students = studentService.getAll();
		model.addAttribute("students", students);
		
		return "student/all";
	}
	
}
