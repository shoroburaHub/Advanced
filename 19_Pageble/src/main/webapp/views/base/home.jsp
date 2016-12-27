<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags"
           prefix="sec" %>

home
<br>


<c:forEach var="book" items="${books.content}">
    ${book.title} <br>
</c:forEach>
<br>
<br>
<br>


<br>

<c:set var="currentPage" value="${books.number}"/>
<c:set var="totalPages" value="${totalPages-1}"/>


<c:if test="${currentPage != 0}">
    <a href="/pageable/${books.number-1}/5">previous</a>
</c:if>


<c:forTokens var="page" items="${pages}" delims="-">
    <a href="/pageable/${page}/5">${page}</a>
</c:forTokens>


<c:if test="${currentPage < totalPages}">
    <a href="/pageable/${books.number+1}/5">next</a>
</c:if>



