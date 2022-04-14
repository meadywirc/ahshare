package com.epsoft.ahshare.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epsoft.ahshare.dao.Ab02DaoImpl;
import com.epsoft.ahshare.dao.IAb02Dao;
import com.epsoft.ahshare.service.Ab02Service;

@Configuration
public class ShareConfig {
	@Bean
	public Ab02Service ab02Server() {
		Ab02Service ab02Server = new Ab02Service();
//		IAb02Dao iab02Dao = new Ab02DaoImpl();
//		ab02Server.setIab02Dao(iab02Dao);
		return ab02Server;
	}
}
