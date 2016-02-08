<%--
  Created by IntelliJ IDEA.
  User: Rafał
  Date: 2016-01-31
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl">
<head>
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge,chrome=1"/>
    <title>dsf</title>
</head>
<body>

komunikat:<strong>${msg}</strong>
<br/>
Register HTML
<br/>
<form action="/register" method="post">
    <%--@declare id="name"--%><%--@declare id="surname"--%>

    <label for="username">username</label>
    <input id="username" name="username">
    <br/> <br/>
    <label for="password">password</label>
    <input id="password" name="password" type="password">
    <br/> <br/>
     <label for="name">name</label>
     <input id="name" name="name">
    <br/> <br/>
     <label for="surname">surname</label>
     <input id="surname" name="surname">

<button type="submit">Send </button>
</form>

<%--<br/>--%>
<%--Register JS--%>
<%--<>--%>
    <%--<label for="username2">username</label>--%>
    <%--<input id="username2" name="username2">--%>

    <%--<label for="password2">password</label>--%>
    <%--<input id="password2" name="password2" type="password">--%>
    <%--<button id="send-button">Send</button>--%>
    <br/>
<form action="http://localhost:8081/users" method="get">
    <input type="submit" value="All users"
           name="submit" id="frm1_submit" />
</form>

</body>
</html>
