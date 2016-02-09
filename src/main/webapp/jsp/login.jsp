<%--
  Created by IntelliJ IDEA.
  User: Rafał
  Date: 2016-02-07
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Spring Security Example </title>
</head>
<body>
<div th:if=${param.error}>
    Invalid username and password.
</div>
<div th:if=${param.logout}>
    You have been logged out.
</div>
<form th:action="@{/login}" method="POST">
    <div><label> User Name : <input type="text" name="j_username"/> </label></div>
    <div><label> Password: <input type="password" name="j_password"/> </label></div>
    <div><input type="submit" value="Sign In"/></div>
</form>
</body>
</html>
