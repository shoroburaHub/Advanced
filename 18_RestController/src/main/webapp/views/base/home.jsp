<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags"
           prefix="sec" %>


<input type="text" id="liveSearch">

<div id="allBooks">
    <c:forEach var="book" items="${books}">
        ${book.title} ${book.pages}<br>
    </c:forEach>
</div>

<input type="hidden" name="csrf_name"
       value="${_csrf.parameterName}"/>
<input type="hidden" name="csrf_value"
       value="${_csrf.token}"/>


<div id="fb-root"></div>
<script>(function (d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s);
    js.id = id;
    js.src = "//connect.facebook.net/uk_UA/sdk.js#xfbml=1&version=v2.8&appId=231499727271728";
    fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>


<div class="fb-share-button" data-href="http://hdkinoshka.net/22401-national-geographic.-mars-6-7-8-seriya.html"
     data-layout="button" data-size="large" data-mobile-iframe="true"><a class="fb-xfbml-parse-ignore" target="_blank"
                                                                         href="https://www.facebook.com/sharer/sharer.php?u=http%3A%2F%2Fhdkinoshka.net%2F22401-national-geographic.-mars-6-7-8-seriya.html&amp;src=sdkpreparse">????????</a>
</div>


<script>

    document.getElementById('liveSearch').oninput = function () {

        var liveSearch = document.getElementById('liveSearch').value;


//        console.log(liveSearch);


        $.ajax({
            url: 'liveSearchBooks?' + $('input[name=csrf_name]').val() + "=" + $('input[name=csrf_value]').val(),
            method: 'POST',
            contentType: 'application/json; charset=UTF-8',
            dataType: 'json',
            data: liveSearch,
            success: function (res) {

                var all = '';


                for (var i = 0; i < res.length; i++) {


                    all += res[i].title + ' ' + res[i].pages + '<br>';


                }

                document.getElementById('allBooks').innerHTML = all;

            }

        })


    }

</script>




