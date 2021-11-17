<%--
  Created by IntelliJ IDEA.
  User: 79984
  Date: 2021/11/13
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/aAddUserServlet" method="" >
    <table border="" cellspacing="" cellpadding="" border="2">
        <tr>
            <td>用户名</td>
            <td><input type="text" name="userName" id="userName" value="" /></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="text" name="passWord" id="passWord" value="" /></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" name="sex" id="sex" value="" /></td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td><input type="text" name="email" id="email" value="" /></td>
        </tr>
        <tr>
            <td>手机号码</td>
            <td><input type="text" name="phone" id="phone" value="" /></td>
        </tr>
        <tr>
            <td>城市</td>
            <td><input type="text" name="city" id="city" value="" /></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age" id="age" value="" /></td>
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
