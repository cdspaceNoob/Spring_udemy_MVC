<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test3</h1>
	<h3>requestScope.data1: ${requestScope.data1 }</h3>
	<h3>requestScope.data1: ${requestScope.data2 }</h3>
	<h3>data1: ${data1 }</h3>
	<h3>data2: ${data2 }</h3>
	<h3>param.data1: ${param.data1 }</h3>
	<h3>param.data2: ${param.data2 }</h3>
	param.은 안나와야 한다. 
	쿼리스트링으로 보내는 값을 받는 객체이기 때문이다.
</body>
</html>