package com.din;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringbootMongoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongoApplication.class, args);
	}

 
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) { 
		return builder.sources(SpringApplication.class);
	}
	

}

//swagger implementation, restful, mongodb,  ....done
// used lombok, 
// tomcat server change to wildfly
// alada port ta tomcat dia server run kore war file daw...then project run thakbe
//internationalization applied
// security applied auth2,basic....
// restful chara kaj kora ai project dia...
// mysql, postgresql, oracle , mongodb


//sts, netbean, eclipse,intellij idea
// thymeleaf applied
// api doc generate kora...**
//http://localhost:8081/swagger-ui.html#/

