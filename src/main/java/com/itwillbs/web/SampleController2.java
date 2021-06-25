package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {
	
	private static final Logger logger
	     = LoggerFactory.getLogger(SampleController2.class);
	
	
	
	
	// http://localhost:8088/web/doB
	@RequestMapping(value = "/doB")
	public String doB(){
		logger.info("doB() 메서드 호출");
		
		return "";
	}
	
	
	//http://localhost:8088/web/doB1 호출되는 doB.jsp 페이지 생성
	@RequestMapping("doB1")
	public String doB1() {
		
		logger.info("doB1() 메서드 호출");
		logger.info("String 타입리턴 -> 리턴결과.jsp 페이지 호출");		
		
		return "doB";
	}
	
	//String 타입으로 리턴하는 동작
	// => 리턴문자열.jsp 페이지 호출
	
	
	
//	@RequestMapping(value = "/doB2")
//	public String doB2() {
//		
//		logger.info("doB2() 메서드 호출");
//		
//		return "redirect:doB";    // doB2 호출된 후에 doB가 호출 됨
//	}
	
	
	
	//http://localhost:8088/web/doB2
	//http://localhost:8088/web/doB2?msg=test
	//http://localhost:8088/web/doB2?txt=test
	//http://localhost:8088/web/doB2?txt=test&msg=1234
	//http://localhost:8088/web/doB2?txt=1000&msg=1234
	@RequestMapping(value = "/doB2")
	public String doB2(@ModelAttribute("msg") String msg,
			           @ModelAttribute("txt") int value) {
		
		//msg = "test";(x)
		logger.info("doB2() 메서드 호출");
		logger.info("result.jsp 페이지로 이동");	
		logger.info("view 페이지로 전달할 정보 : "+msg);
		
		return "result";
	}
	
	
	
	
	
	
	
	
	
	

}
