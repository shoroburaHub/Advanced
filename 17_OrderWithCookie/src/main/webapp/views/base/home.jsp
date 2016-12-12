<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<script src="/js/jquery-3.1.1.min.js"></script>


<a href="sale">sale</a>

<a href="basket">basket</a>

<sec:authentication property="name" />

<sec:authorize access="isAuthenticated()">

	<form:form action="logout" method="post">
		<button>logout</button>
	</form:form>
</sec:authorize>

<sec:authorize access="!isAuthenticated()">

	<a href="loginpage">login</a>
	<a href="registration">registration</a>
</sec:authorize>


<sec:authorize access="hasRole('ROLE_ADMIN')">

	<a href="admin">admin page</a>

</sec:authorize>

<sec:authorize access="isAuthenticated()">
	<a href="profile">profile</a>
</sec:authorize>

<br>
<br>
<br>


<c:forEach var="book" items="${books}">
		${book.title} ${book.pages}
	<a href="buyBook/${book.id}">buy</a>
	<br>
</c:forEach>

<br>

<div class="myDiv" id="content">text</div>


<script>

//	$('#save').click(function () {
//
//	})

	document.getElementById('content').onclick =function () {

//		console.log(document.getElementById('content').innerHTML);

//		document.getElementById('content').innerHTML = 'lalalalalal';

		document.getElementById('content').style.backgroundColor = 'aqua';
		document.getElementById('content').style.width = 100+'px';
		document.getElementById('content').style.height = 100+'px';

		var newDiv = document.createElement('div');

		newDiv.style.backgroundColor = 'red';
		newDiv.innerHTML = 'newDiv';

		document.body.appendChild(newDiv);

	}





//	document.querySelector('.myDiv').onclick = function () {
//		alert('some')
//	}




//	var some = document.getElementsByTagName('div')[0];
//
//	some.onclick = function () {
//		alert('some')
//		console.log(some);
//	}



</script>






