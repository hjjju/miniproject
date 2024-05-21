package com.hnworks.miniProject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@MapperScan(basePackages ={"com.hnworks.miniProject.domain.menu.mapper"})
@ServletComponentScan
@SpringBootApplication
public class MiniProjectApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectApplication.class, args);
	}

}
