<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test4</h1>
	<form:form modelAttribute="test_user2" action="result">	<!-- Controller에서 ModelAttribute로 정한 이름으로 들어온다. -->
		이름: <form:input path="user_name"/><br/>
		아이디: <form:input path="user_id"/><br/>
		비밀번호: <form:password path="user_pw" showPassword="true"/><br/>		<!-- showPassword 속성을 쓰지 않으면 비밀번호 정보가 노출되지 않는다. -->
		우편번호: <form:input path="user_postcode"/><br/>	
		주소1: <form:input path="user_address1"/><br/>
		주소2: <form:input path="user_address2"/><br/>
		<button type="submit">확인</button>
	</form:form>
</body>
</html>