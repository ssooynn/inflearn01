package com.ssafy.hw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.ssafy.hw.dto.User;
import com.ssafy.hw.model.service.UserService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AopTest{	
	
	// 서비스 빈 가져오기, 어노테이션을 통해 설정파일을 불러왔으므로 어노테이션 기반 빈 사용
	@Autowired
	UserService service;

	@Test
	public void testAOP() {
		service.insert(new User("ssafy", "1234", "김싸피" , "ssafy@ssafy.com", 27));
		service.selectAll();
	}
}

