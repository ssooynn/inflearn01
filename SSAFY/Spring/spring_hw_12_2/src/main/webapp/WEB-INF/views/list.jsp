<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFY 사용자 관리</title>
<style>
</style>
</head>
<body>
	<h1>사용자 목록</h1>

	<%-- request 영역에 users로 등록된 자료를 반복문을 이용해 출력한다. --%>
	<c:forEach items="${users }" var="user" varStatus="vs">
		<form method="post" action="update" accept-charset="UTF-8">
			<table id="user-list">
			<c:if test="${vs.index eq 0 }" >
				<thead>
					<tr>
						<th>아이디</th>
						<th>비밀번호</th>
						<th>이름</th>
						<th>이메일</th>
						<th>나이</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
			</c:if>
				<tbody>
					<tr>
						<td><input type="text" name="id" id="id" value="${user.id }" /></td>
						<td><input type="password" name="password" id="password" /></td>
						<td><input type="text" name="name" id="name"
							value="${user.name }" /></td>
						<td><input type="email" name="email" id="email"
							value="${user.email }" /></td>
						<td><input type="number" name="age" id="age"
							value="${user.age }" /></td>
						<td><input type="submit" value="수정" /></td>
						<td><button type="button"
								onclick="location.href='./delete?id=${user.id}'">삭제</button></td>
					</tr>
				</tbody>
			</table>
		</form>
	</c:forEach>
	<a href="index">홈으로</a>
	<a href="regist">추가등록</a>
</body>
</html>