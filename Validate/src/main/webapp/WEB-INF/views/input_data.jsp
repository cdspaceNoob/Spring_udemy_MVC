<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!-- if문 사용을 위해 jstl core 사용. -->
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- custom tag 사용을 위해 tags 사용. -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>input_data</h1>
	<form action='input_pro' method='post'>
		data1 : <input type='text' name='data1'/>
		<spring:hasBindErrors name="dataBean1">
			<c:if test="${errors.hasFieldErrors('data1') }">
				${errors.getFieldError('data1').defaultMessage }<br/>
			</c:if>
		</spring:hasBindErrors>
		data2 : <input type='text' name='data2'/>
		<spring:hasBindErrors name="dataBean1">
			<c:if test="${errors.hasFieldErrors('data2') }">
				${errors.getFieldError('data2').defaultMessage }<br/>
			</c:if>
		</spring:hasBindErrors>
		<button type='submit'>확인</button>
	</form>
</body>
</html>