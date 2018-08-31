package com.tigerye.process.portal;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages={"com.tigerye"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class
		, DataSourceTransactionManagerAutoConfiguration.class
		, MybatisAutoConfiguration.class

})
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ImportResource(locations = "classpath:lion-annotation.xml")
public class ProcessPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessPortalApplication.class, args);
	}
}
