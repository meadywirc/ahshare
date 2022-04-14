package com.epsoft.ahshare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsoft.ahshare.entity.Student;
//import com.epsoft.ahshare.dao.IAb02Dao;
import com.epsoft.ahshare.mapper.StudentMapper;

@Service
public class Ab02Service {
	
	
//	private IAb02Dao iab02Dao;

//	public IAb02Dao getIab02Dao() {
//		return iab02Dao;
//	}
//
//	public void setIab02Dao(IAb02Dao iab02Dao) {
//		this.iab02Dao = iab02Dao;
//	}	
//	public void getAb02() {
//		this.iab02Dao.getAb02();
//	}
	@Autowired
	StudentMapper studentmapper;
	
	
	public Student getAb02(int id) {
		return studentmapper.queryByNO(id);
	}
	
}
