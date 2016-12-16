<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags"
           prefix="sec" %>


<input type="hidden" name="csrf_name"
       value="${_csrf.parameterName}"/>
<input type="hidden" name="csrf_value"
       value="${_csrf.token}"/>

<%--<select name=""  id="countryId">
    <c:forEach var="country" items="${countries}">
        <option value="${country.id}">${country.name}</option>
    </c:forEach>
</select>--%>

<c:forEach var="country" items="${countries}">
    <input class="some" name="some" type="checkbox" value="${country.id}" id="check">${country.name}
</c:forEach>

<button id="choose">get</button>

<script>


    $('#choose').click(function () {

        var all = document.querySelectorAll('.some');

        for(var i = 0; i < all.length; i++){

            if(all[i].checked){
                console.log(all[i].value);
            }

        }

    })





   /*document.getElementById('countryId').onchange = function () {
       console.log(document.getElementById('countryId').value);

       var i = document.getElementById('countryId').value;

       $.ajax({

           url: 'getCities?' + $('input[name=csrf_name]').val() + "=" + $('input[name=csrf_value]').val(),
           method: 'POST',
           contentType: 'application/json; charset=UTF-8',
           dataType: 'json',
           data: i,
           success : function (res) {

               console.log(res);

               var allCitiesByCountryId = document.createElement('select');

               for (var i = 0; i < res.length; i++){

                   var city = document.createElement('option');
                   city.text = res[i].name;

                   allCitiesByCountryId.add(city);

               }

               document.body.appendChild(allCitiesByCountryId);


           }


       })






   }



*/









</script>
