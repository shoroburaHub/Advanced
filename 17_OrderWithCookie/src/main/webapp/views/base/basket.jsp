<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10.12.2016
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>basket</title>
    <link rel="stylesheet" href="/css/popup.css">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
</head>
<body>

<c:forEach var="book" items="${books}">
    ${book.title}
    <a href="deleteFromOrder/${book.id}">delete From Cookie</a>
    <div class="popup" onclick="myFunction()">get order
        <div class="popuptext" id="myPopup">
            <a href="registration">registration</a>
            <sec:authorize access="isAuthenticated()">
                <br>
                <a href="loginpage">login</a>
            </sec:authorize>
        </div>
    </div>
    <br>
</c:forEach>

<script src="/js/popup.js"></script>
</body>
</html>
