<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1</h1>
	<form:form action="result" modelAttribute="dataBean1">
		<form:select path="a1">	<!-- 이렇게 해두면 dataBean1의 a1의 value와 정확히 일치하는 value를 가진 option이 선택된 채로 select 박스가 생성된다.(selected="selected" 자동 생성)-->
			<form:option value="data1">항목1</form:option>
			<form:option value="data2">항목2</form:option>
			<form:option value="data3">항목3</form:option>
		</form:select>
		<hr>
		<form:select path="a2">	<!-- 마찬가지로 a2의 value와 정확히 일치하는 value를 가진 option이 선택된 채로 생성된다. -->
			<form:options items="${requestScope.data_list1 }"/>
		</form:select>
		<hr>
		<form:select path="a3">
			<form:options items="${requestScope.data_list2 }"/>
		</form:select>
		<hr>
		<form:select path="a4">
			<form:options items="${requestScope.data_list3 }" itemLabel="key" itemValue="value"/>
		</form:select>
		<hr>
		<form:checkbox path="a5" value="data1"/>항목1		<!-- DataBean1의 a1의 value와 정확히 일치하는 value를 가진 checkbox라면 선택된 채로 생성. -->
		<form:checkbox path="a5" value="data2"/>항목2
		<form:checkbox path="a5" value="data3"/>항목3
		<hr>
		<form:checkboxes items="${requestScope.data_list1 }" path="a6"/>
		<hr>
		<form:checkboxes items="${requestScope.data_list2 }" path="a7"/>
		<hr>
		<form:checkboxes items="${requestScope.data_list3 }" path="a8" itemLabel="key" itemValue="value"/>	<!-- ArrayList일 떄는 key value를 정해줘야 한다. -->
		<hr>
		<form:radiobutton path="a9" value="data1"/>항목1
		<form:radiobutton path="a9" value="data2"/>항목2
		<form:radiobutton path="a9" value="data3"/>항목3
		<hr>
		<form:radiobuttons path="a10" items="${requestScope.data_list1 }"/>
		<hr>
		<form:radiobuttons path="a11" items="${requestScope.data_list3 }" itemLabel="key" itemValue="value"/>
	</form:form>
</body>
</html>