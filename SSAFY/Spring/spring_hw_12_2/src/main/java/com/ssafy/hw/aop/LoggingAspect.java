package com.ssafy.hw.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	private static Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	/**
	 * 메서드 정상 결과 반환이후에 동작해야 한다.
	 * point cut의 구성은 아래와 같다.
	 * 리턴 타입: * 이므로 모든 리턴 타입에 대해 적용된다.
	 * 클래스명: com.ssafy.ws.model 패키지로 시작하고 .. 이므로 하위의 모든 경로, 클래스에 적용된다.
	 * 메서드명: insert 이므로 insert 라는 이름을 가진 메서드에 적용된다.
	 * 파라미터:.. 이므로 파라미터의 개수, 타입에 상관없이 적용된다.
	 * @param jp JoinPoint를 통해 joinpoint의 다양한 정보에 접근할 수 있다.
	 */
	@AfterReturning(value = "execution(* com.ssafy.hw.model.repo..*.insert(..))")
	public void logInsert(JoinPoint jp) {
		logger.debug("사용자 정보 삽입 성공!! 전달 파라미터:{}",Arrays.toString(jp.getArgs()));
	}
	
	@AfterReturning(value = "execution(* com.ssafy.hw.model.repo..*.selectAll())")
	public void logSelectAll() {
		logger.debug("사용자 정보 모두 찾기 성공!!");
	}
}
