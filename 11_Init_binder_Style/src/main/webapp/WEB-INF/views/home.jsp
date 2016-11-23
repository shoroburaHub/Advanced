<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/home.css">
</head>
<body>

	<div>
		<a href="newAuthor">add author</a>
		<br>
		<a href="newBook">add book</a>
		<br>
		<a href="newUser">add user</a>
		<br>
		<a href="newCountry">add country</a>
		<br>
		<a href="newCity">add city</a>
		
	</div>

	<br>	
	<br>	
	<br>	

	<c:forEach var="book" items="${books}">
		${book.title}
		<br>
	</c:forEach>



</body>
</html>
