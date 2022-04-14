package com.epsoft.share;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.epsoft.ahshare.AhshareApplication;
import com.epsoft.ahshare.entity.Student;
import com.epsoft.ahshare.service.Ab02Service;

@SpringBootTest(classes = AhshareApplication.class)
public class ShareTest {

//	@Autowired
//	private Ab02Server ab02Server;
//	
//	@Test
//	public void myTest() {
//		ab02Server.getAb02();
//	}
//
//	@Autowired
//	ApplicationContext appcontext;

	@Autowired
	Ab02Service ab02Server;
	
	@Test
	public void ShareTest() {
//		Ab02Service ab02Server = (Ab02Service)appcontext.getBean("ab02Server");
//		ab02Server.getAb02();
		Student student = ab02Server.getAb02(0);
		System.out.println(student.getName());
//		System.out.println(1/0);
//		System.out.println(ab02Server+"=============");
	}
		
}
