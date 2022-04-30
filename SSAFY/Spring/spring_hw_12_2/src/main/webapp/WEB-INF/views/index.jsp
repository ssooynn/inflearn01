<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFY 사용자 관리</title>
</head>
<body>
	<div class="container">
		<h1>사용자 관리</h1>
		<form action="search" method="get">
			<input type="text" name="name" placeholder="이름을 입력해주세요.">
			<input type="submit" value="검색">
		</form>
		<hr>
		<ul>
			<li><a href="./regist">사용자 등록</a>
			<li><a href="./list">사용자 목록</a>
		</ul>
	</div>
</body>
</html>