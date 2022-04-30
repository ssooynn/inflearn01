package com.ssafy.hw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.ssafy.hw.model.repo.UserRepo;
import com.ssafy.hw.model.service.UserService;
import com.ssafy.hw.model.service.UserServiceImpl;

//Spring과 연동하기위해  SpringRunner를 사용한다.
@RunWith(SpringRunner.class)
//설정 파일의 위치를 지정한다.
@SpringBootTest
public class BeanCreationTest {
	
	@Autowired
	UserRepo repo;
	@Autowired
	UserService service;
	@Autowired
	DataSource ds;
	
	// UserRepo, UserService 가 잘 생성되었는지 테스트 한다.
	@Test
	public void testBeanCreation() {
		assertNotNull(repo);
		assertNotNull(service);
	}
	
	// context에서 직접 얻어온 UserRepo와 UserService가 가지는 UserRepo가 동일한지 테스트한다.
	@Test
	public void testSingleTon() {
		assertEquals(repo , ((UserServiceImpl)service).getUserRepo());
	}
	
	// DataSource객체가 잘 생성되었는지 테스트한다.
	@Test
	public void testDataSource() {
		assertNotNull(ds);
	}

}
