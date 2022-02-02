package com.santhosh.scheduler.config;

import javax.sql.DataSource;

import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = JobRunrConfiguration.class)
public class JobRunrConfiguration {

	@Bean
	public DataSource dataSource() {
		PGSimpleDataSource dataSource = new PGSimpleDataSource();
		dataSource.setURL("jdbc:postgresql://localhost:5432/jobrunr");
		dataSource.setUser("postgres");
		dataSource.setPassword("postgres");
		// dataSource.setCurrentSchema("jobrunr");
		return dataSource;
	}

}
