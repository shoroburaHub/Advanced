<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags"
           prefix="sec" %>


<c:forEach var="book" items="${book}">

    ${book.title} <div id="buy" onclick="buy(${book.id})">buy</div>


</c:forEach>

<script>


    function buy(index) {

        $.ajax({




        })

    }


</script>