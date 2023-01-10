<%--
  Created by IntelliJ IDEA.
  User: admin1
  Date: 10/01/23
  Time: 1:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String name = (String) request.getAttribute("name");
        Integer roll = (Integer) request.getAttribute("roll");
    %>
    <h2>This is our help page</h2>
    <h2>Student name is ${name} and roll no is <%=roll%></h2>
</body>
</html>
