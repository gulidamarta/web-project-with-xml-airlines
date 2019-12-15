<%--
  Created by IntelliJ IDEA.
  User: marta
  Date: 15.12.2019
  Time: 12:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Stewards</title>
</head>
<body>
<table>
    <c:forEach items="${stewards}" var="steward">
        <tr>
            <td><c:out value="${steward.id}"/></td>
            <td>${steward.name}</td>
            <td>${steward.lastName}</td>
            <td>${steward.workExperience}</td>
            <td>${steward.jobDescribtion}</td>
            <td>${steward.salary}</td>
        </tr>
    </c:forEach>
</table>

<nav>
    <ul>
        <c:if test="${currentPage != 1}">
            <li><a href="stewards?recordsPerPage=${recordsPerPage}&currentPage=${currentPage-1}">Previous</a></li>
        </c:if>

        <c:forEach begin="1" end="${noOfPages}" var="i">
            <c:choose>
                <c:when test="${currentPage eq i}">
                    <li><a>${i} <span>(current)</span></a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="stewards?recordsPerPage=${recordsPerPage}&currentPage=${i}">${i}</a>
                    </li>
                </c:otherwise>
            </c:choose>
        </c:forEach>

        <c:if test="${currentPage lt noOfPages}">
            <li><a href="stewards?recordsPerPage=${recordsPerPage}&currentPage=${currentPage+1}">Next</a>
            </li>
        </c:if>
    </ul>
</nav>

</body>
</html>
