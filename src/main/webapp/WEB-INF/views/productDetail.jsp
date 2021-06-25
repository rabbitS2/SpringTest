<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WEB-INFO/views/productDetail.jsp</h1>
	
	컨트롤러에서 전달된 객체 정보<br>
	<h2>${test }</h2>
	
	<hr>
	
	<h2>상품 객체 </h2>
	<h3>${vo }</h3>
	
	<h3>상품명: ${vo.name }</h3>
	<h3>가격: ${vo.price }</h3>
	
	<hr>
	
	<h1> 전달되는 속성의 key값이 없을경우 클래스명의 첫글자만 소문자로 변경</h1>
	<h2>${productVO }</h2>
	<h2>상품명: ${productVO.name }</h2>
	<h2>가격: ${productVO.price }</h2>
	

</body>
</html>