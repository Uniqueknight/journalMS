<%--
  Created by IntelliJ IDEA.
  User: 79984
  Date: 2021/11/11
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="" method="" >
    <table border="" cellspacing="" cellpadding="" border="2">
        <tr>
            <td>用户名</td>
            <td><input type="text" id="userName" value="${userInfo.userName}" /></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="text" id="passWord" value="${userInfo.passWord}" /></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" id="sex" value="${userInfo.sex}" /></td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td><input type="text" id="email" value="${userInfo.email}" /></td>
        </tr>
        <tr>
            <td>手机号码</td>
            <td><input type="text" id="phone" value="${userInfo.phone}" /></td>
        </tr>
        <tr>
            <td>城市</td>
            <td><input type="text" id="city" value="${userInfo.city}" /></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" id="age" value="${userInfo.age}" /></td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <input type="submit" id="submit" name="submit" value="提交" />
                <button type="button">返回</button>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
