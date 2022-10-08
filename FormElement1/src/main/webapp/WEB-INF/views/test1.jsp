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
	<h1>test1</h1>
	<form:form modelAttribute="dataBean1" action="result">
	<form:hidden path="a1"/>	<!-- dataBean1에서 a1이라는 키의 value를 input 태그의 value로 설정하고, id와 name은 a1으로 설정한다. -->
	text: <form:input path="a2"/><br/>
	password: <form:password path="a3" showPassword="true"/><br/>
	textarea: <form:textarea path="a4"/><br/>
		<form:button disabled="true">확인</form:button>
	</form:form>
	
</body>
</html>