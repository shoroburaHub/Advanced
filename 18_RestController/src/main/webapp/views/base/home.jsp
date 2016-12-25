<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags"
           prefix="sec" %>

<c:forEach var="book" items="${books}">
    ${book.title} ${book.id}
   
    <c:forEach var="pic" items="${book.bookImages}">
        <img src="${pic.path}" alt="" height="100px" width="100px">
    </c:forEach>
    
    <br>

</c:forEach>
<br>
<br>
<br>
<br>


<sec:authentication property="name"/>

<input type="text" id="title">
<input type="number" id="pages">

<button id="save">save Book</button>

<input type="hidden" name="csrf_name"
       value="${_csrf.parameterName}"/>
<input type="hidden" name="csrf_value"
       value="${_csrf.token}"/>

<script>

    document.getElementById('save').onclick = function () {


        var book = {
            title : document.getElementById('title').value,
            pages : document.getElementById('pages').value
        }

        console.log(book);

        $.ajax({

            url: 'addBook?' + $('input[name=csrf_name]').val() + "=" + $('input[name=csrf_value]').val(),
            method: 'POST',
            contentType: 'application/json; charset=UTF-8',
            dataType: 'json',
            data: JSON.stringify(book),
            success : function (res) {

                console.log(res);

            }


        })




    }

</script>