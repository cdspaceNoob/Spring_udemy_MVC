<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Result1.jsp</h1>
	<h3>RequestScope.data1 = ${requestScope.data1 }</h3> <!-- 결과가 출력된다. -->
	<h3>Request.data1 = ${request.data1 }</h3>
	<h3>param.data1 = ${param.data1 }</h3>
	<h3>data1 = ${data1 }</h3>	<!-- 결과가 출력된다.  -->
</body>
</html>