package com.my.sts;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@MapperScan("com.my.sts.model")
public class Sts13Application {

	public static void main(String[] args) {
		SpringApplication.run(Sts13Application.class, args);
	}

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource;
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://60d383ce8cf3:3306/xe");
		dataSource.setUsername("scott");
		dataSource.setPassword("tiger");
		return dataSource;
	}

}
