<%@ page import="com.example.journalMS.domain.user" %>
<%@ page import="com.example.journalMS.domain.userInfo" %><%--
  Created by IntelliJ IDEA.
  User: 79984
  Date: 2021/11/11
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String usr = String.valueOf(request.getAttribute("info"));
        response.getWriter().println(usr);
    %>
</body>
</html>
