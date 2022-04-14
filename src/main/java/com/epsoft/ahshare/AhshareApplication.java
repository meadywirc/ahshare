package com.epsoft.ahshare;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@MapperScan("com.epsoft.ahshare.mapper")
@ComponentScan
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class AhshareApplication {
	public static void main(String[] args) {
		SpringApplication.run(AhshareApplication.class, args);
	}

}
