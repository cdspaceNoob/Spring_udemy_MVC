<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>input_data</h1>
	
	<form:form action="input_pro" modelAttribute="dataBean1" method="post">
	
		data1 : <form:input path="data1" type="text"/><br>
	
	</form:form>
	
<%-- 	<form action="input_pro" method="post">
		data1: <input type="text" name="data1"><br>
		<spring:hasBindErrors name="dataBean1">
			<c:if test = "${errors.hasFieldErrors('data1')}" >
				${errors.getFieldError('data1').defaultMessage }<br>
				${errors.getFieldError('data1').codes[0] }<br>
				<spring:message code="${errors.getFieldError('data1').codes[0] }"/>
			</c:if>
		</spring:hasBindErrors>
		<br>
		data2: <input type="text" name="data2">
		<spring:hasBindErrors name="dataBean1"><br>
			<c:if test = "${errors.hasFieldErrors('data2')}" >
				${errors.getFieldError('data2').defaultMessage }<br>
				${errors.getFieldError('data2').codes[0] }<br>
				<spring:message code="${errors.getFieldError('data2').codes[0] }"/>
			</c:if>	
		</spring:hasBindErrors>
		<br><button type="submit">확인</button>
	</form> --%>
</body>
</html>