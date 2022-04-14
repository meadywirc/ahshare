package com.epsoft.ahshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.epsoft.ahshare.entity.Student;
import com.epsoft.ahshare.service.Ab02Service;

@Controller
public class HelloWordController {

	@Autowired
	Student student;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	@ResponseBody
	@RequestMapping("helloword/{id}")
	public void helloWord() {
		System.out.println(student);
		
//		return Ab02Service.getAb02(1);
	}
}
