<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<sec:authentication property="name" />


<form:form action="logout" method="post">
	<button>logout</button>
</form:form>


<br>
<a href="loginpage">login</a>
<br>
<a href="registration" id="link3">registration</a>
<br>




<a href="admin">admin page</a>








<%-- <form:form modelAttribute="user" action="addBookToUser" method="post">
	<form:input path="name"/>
	<form:input path="email"/>
	<form:input path="password"/>
	<form:select path="books" items="${books}" itemLabel="title" itemValue="id">
	</form:select>
	<button>save</button>
</form:form> --%>




<br>
<br>
<br>


<c:forEach var="book" items="${books}">
		${book.title} ${book.pages}
		<br>
</c:forEach>
