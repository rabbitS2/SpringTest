package com.itwillbs.web;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// @RunWith(SpringJUnit4ClassRunner.class)
// => 테스트 코드를 실행할때 스프링으로 처리되록 설정

//@ContextConfiguration(
//		locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}
//		)
// => 테스트시 필요한 설정을 지정 (root-context.xml)



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}
		)
public class DataSourceTest {
	
	// 디비 연결 -> 디비객체 필요 => 디비객체를 의존하고있다.
	// => 의존 주입(DI)
	// @Inject : 이미생성된 객체를 주입하는 어노테이션
	
	@Inject
	private DataSource ds;
	
	// 테스트 동작은 반드시 메서드위에서 @Test 사용해야만 실행가능
	//@Test
	public void testDS() throws Exception{
		System.out.println("DataSource 객체 생성여부 확인 메서드");
		System.out.println(ds);		
	}
	
	
	@Test
	public void testCon() throws Exception{
		System.out.println("DB연결 메서드");
		
		Connection con = ds.getConnection();
		System.out.println("디비 연결 성공 : "+con);
		
	}
	
	
	
	
	

}







