<%--
  Created by IntelliJ IDEA.
  User: 79984
  Date: 2021/11/11
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <td>用户名</td>
        <td>${userInfo.userName}</td>
    </tr>
    <tr>
        <td>密码</td>
        <td>${userInfo.passWord}</td>
    </tr>
    <tr>
        <td>性别</td>
        <td>${userInfo.sex}</td>
    </tr>
    <tr>
        <td>邮箱</td>
        <td>${userInfo.email}</td>
    </tr>
    <tr>
        <td>手机号</td>
        <td>${userInfo.phone}</td>
    </tr>
    <tr>
        <td>城市</td>
        <td>${userInfo.city}</td>
    </tr>
    <tr>
        <td>年龄</td>
        <td>${userInfo.age}</td>
    </tr>
    <tr>
        <td colspan="2"><a href="uChangeUser.jsp.jsp">修改</a></td>
    </tr>
</table>


</body>
</html>
