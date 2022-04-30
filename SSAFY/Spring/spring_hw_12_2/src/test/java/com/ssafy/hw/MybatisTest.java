package com.ssafy.hw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.ssafy.hw.dto.User;
import com.ssafy.hw.model.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {

	@Autowired
	DataSource ds;

	@Autowired
	SqlSessionFactory factory;

	@Test

	public void testMybatisSet() {
		assertNotNull(ds);
		assertNotNull(factory);

	}

	@Autowired
	UserService service;

	User user = new User("ssafy", "1234", "김싸피", "ssafy@ssafy.com", 27);
	User user2 = new User("ssafy2", "1234", "박싸피", "ssafy2@ssafy.com", 28);

	@Test
	public void dmlTest() {
		// 사용자 2명 추가
		service.insert(user);
		service.insert(user2);
		
		// 전체 조회후 크기 2개인지 확인
		List<User> list = service.selectAll();
		assertEquals(2, list.size());
		
		// 사용자 정보 변경
		user.setAge(30);
		service.update(user);
		System.out.println(service.searchById("ssafy").toString());
		
		// 사용자 삭제
		service.delete("ssafy");
		System.out.println(service.selectAll().size());
		
		// 박싸피라는 이름이 들어간 사용자를 모두 검색해본다.
		list = service.searchByName("박싸피");
		System.out.println(list.size());
		assertEquals(1, list.size());

	}

}
