<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="test1?data1=100&data2=200&data3=300&data3=400">test1 경로에 get 요청하기</a>
<hr>
	<form action="test2" method="post">
		data1 : <input type="text" name="data1"/>
		data2 : <input type="text" name="data2"/>
		data3 : <input type="checkbox" name="data3" value="100"/>
				<input type="checkbox" name="data3" value="200"/>
				<button type="submit">send</button>
	</form>
		<hr>
	<a href="test3?data1=100&data2=200&data3=300&data4=400">test3 경로에 get 요청하기</a><br/>
		<hr>
	<a href="test4/100/200/300/400">test4 경로에 REST API 방식의 get 요청하기</a>
		<hr>
	<a href="test5?data1=100&data2=200&data3=300&data3=400">test5 경로에 get 요청하기</a>
		<hr>
	<a href="test6?data1=100&data2=200&data3=300&data3=400">test6 경로에 get 요청하기</a>
		<hr>
	<a href="test7?data1=100">test7 경로에 get 요청하기</a>
		<hr>
	<h1>Hello Spring MVC JAVA!</h1>
	<img src="image/image.jpeg"/>
</body>
</html>