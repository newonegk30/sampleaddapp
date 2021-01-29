package com.sampleadd;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication(scanBasePackages = { "com.sampleadd" })
public class SampleAddAppl {

	public static void main(String[] args) {
		SpringApplication.run(SampleAddAppl.class, args);
	}
}
