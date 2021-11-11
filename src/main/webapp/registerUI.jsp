<%--
  Created by IntelliJ IDEA.
  User: 79984
  Date: 2021/11/7
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>期刊管理系统</title>
    <link rel="stylesheet" type="text/css" href="CSS/registerUI.css">
</head>
<body>

<div id="main">

    <div id="head">
        <h1>期刊管理系统</h1>
    </div>



    <div id="base">
        <form action="${pageContext.request.contextPath}/registerServlet" method="post">
            <table >
                <tr><th colspan="2">注册界面</th></tr>
                <tr>
                    <td>用户名</td>
                    <td><input type="text" name="userName" placeholder="请输入用户名"/></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><input type="password" name="passWord" placeholder="请输入密码"/></td>
                </tr>
                <tr align="center">
                    <td colspan="2">

                        <input type="submit" id="upRegister" name="" value="注册"/>
                        <button type="button" id="upReturn" name="" value="" onclick="window.location.href='${pageContext.request.contextPath}/login'">返回</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>


</body>
</html>
