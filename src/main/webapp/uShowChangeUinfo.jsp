<%--
  Created by IntelliJ IDEA.
  User: 79984
  Date: 2021/11/13
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
</head>
<body>

<%--修改页面视图--%>


<form action="${pageContext.request.contextPath}/uChangeUinfoServlet" method="post" >
    <table border="" cellspacing="" cellpadding="" border="2">
        <tr>
            <td>用户名</td>
            <td>${userInfo.userName}<input type="hidden" name="userName" id="userName" value="${userInfo.userName}" /></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="text" name="passWord" id="passWord" value="${userInfo.passWord}" /></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" name="sex" id="sex" value="${userInfo.sex}" /></td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td><input type="text" name="email" id="email" value="${userInfo.email}" /></td>
        </tr>
        <tr>
            <td>手机号码</td>
            <td><input type="text" name="phone" id="phone" value="${userInfo.phone}" /></td>
        </tr>
        <tr>
            <td>城市</td>
            <td><input type="text" name="city" id="city" value="${userInfo.city}" /></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age" id="age" value="${userInfo.age}" /></td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <input type="submit" id="submit" name="submit" value="提交" />
            </td>
        </tr>
    </table>
</form>





</body>
</html>
