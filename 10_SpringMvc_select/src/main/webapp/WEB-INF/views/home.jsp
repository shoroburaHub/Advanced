<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	home
	<br>
	<a href="newAuthor">add author</a>
	<br>
	<a href="newBook">add book</a>
	<br>
	<a href="newUser">add user</a>

	<form action="addBooksToUser" method="post">
		<select name="bookId" multiple="multiple">
			<c:forEach var="user" items="${users}">
				<option value="${book.id }">${user.username}</option>
			</c:forEach>
		</select>
		<select name="userId">
			<c:forEach var="book" items="${books}">
				<option value="${user.id}">${book.title}</option>
			</c:forEach>
		</select>
		<button>save</button>
	</form>


</body>
</html>
