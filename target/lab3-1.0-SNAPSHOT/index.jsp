<%--
  Created by IntelliJ IDEA.
  User: marta
  Date: 15.12.2019
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/controller" method="post">
    <input type="hidden" name="command" value="common_register"/>
    <input type="submit" value="stewards">
</form>
<form action="${pageContext.request.contextPath}/controller" method="post">
    <input type="hidden" name="command" value="get_pilots"/>
    <input type="submit" value="pilots">
</form>
<form action="${pageContext.request.contextPath}/controller" method="post">
    <input type="hidden" name="command" value="get_aircrafts"/>
    <input type="submit" value="aircrafts">
</form>
</body>
</html>
