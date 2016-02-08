<%--
  Created by IntelliJ IDEA.
  User: Rafał
  Date: 2016-02-06
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>userData</title>
</head>
<body>
<br/>
<c:forEach var="element" items="${collection}">
    User ${element}<br />
</c:forEach>
</body>
</html>
