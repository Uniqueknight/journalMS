<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 79984
  Date: 2021/11/13
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table cellpadding="5px" border="2">
    <th>用户名</th>
    <th>密码</th>
    <th>性别</th>
    <th>邮箱</th>
    <th>手机号码</th>
    <th>城市</th>
    <th>年龄</th>
    <th>操作</th>

    <c:forEach var="userInfo" items="${userList}">
    <tr>
        <td>${userInfo.userName}</td>
        <td>${userInfo.passWord}</td>
        <td>${userInfo.sex}</td>
        <td>${userInfo.email}</td>
        <td>${userInfo.phone}</td>
        <td>${userInfo.city}</td>
        <td>${userInfo.age}</td>
        <td><a href="<%=request.getContextPath()%>/aDeleteUserServlet?userName=${userInfo.userName}">删除用户</a></td>
    </tr>
    </c:forEach>
</table>



</body>
</html>
