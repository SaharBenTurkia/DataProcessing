package com.sbenturkia.dataprocessing;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaRepositories("com.sbenturkia.dataprocessing.repository")
public class DataProcessingApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(DataProcessingApplication.class, args);
	}
	
  @Override
	public void run(String... args) throws Exception {
	/*	JobParameters jobParameters = new JobParametersBuilder().addString("source", "Spring Boot").toJobParameters();
		jobLauncher.run(accountKeeperJob, jobParameters);*/
	}

}
