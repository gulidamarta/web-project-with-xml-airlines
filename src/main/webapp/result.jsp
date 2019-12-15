<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: marta
  Date: 14.12.2019
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>
    <h1>
        Available Brands
    </h1>
        <%List result= (List) request.getAttribute("brands");
        Iterator it = result.iterator();
        System.out.println("<br>We have <br><br>");
        while(it.hasNext()){
            System.out.println(it.next()+"<br>");
        }%>
</body>
</html>