package com.ssafy.hw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//프록시 설정 <aop:aspectj-autoproxy></aop:aspectj-autoproxy>를 대체한다.
@EnableAspectJAutoProxy
//mybatis의 매퍼 스캔: <mybatis:scan base-package="com.ssafy.hw.model.repo"/>를 대체한다.
@MapperScan(basePackages = "com.ssafy.hw.model.repo")
public class HwFrameworkSpring12Application {

	public static void main(String[] args) {
		SpringApplication.run(HwFrameworkSpring12Application.class, args);
	}

}
