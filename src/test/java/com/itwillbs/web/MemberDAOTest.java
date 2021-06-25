package com.itwillbs.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.persistence.MemberDAO;
import com.itwillbs.persistence.MemberDAOImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}
		)
public class MemberDAOTest {
	
	
	// DAO 객체 생성 (의존관계)
	// private MemberDAO mDAO = new MemberDAOImpl(); (강한결합x)

	// 의존주입
	@Inject
	private MemberDAO mDAO;
	
	
	
	//DAO 객체 주입 확인
	@Test
	public void testDAO() {
		System.out.println("DAO : "+mDAO);
	}
	
	// DAO 객체 메서드 호출(시간정보 가져오는 메서드)
	@Test
	public void testGetTime() {
		System.out.println("Model-Action페이지");
		
		System.out.println("시간정보 " + mDAO.getTime() );
		
		System.out.println("-----------------------------------------");		
	}
	
	
	// DAO객체안에 회원가입하는 메서드호출
	//@Test
	public void testInsertMember() {
		System.out.println("회원가입 메서드 동작");
		System.out.println("DAO-insertMember() 메서드 호출");
		
		MemberVO vo = new MemberVO();
		vo.setUserid("jin");
		vo.setUserpw("1234");
		vo.setUsername("김석진");
		vo.setUseremail("admin@itwillbs.co.kr");
		
		mDAO.insertMember(vo);
		
		System.out.println("Test 성공~!");
		
	}
	

}
