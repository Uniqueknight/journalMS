<%--
  Created by IntelliJ IDEA.
  User: 79984
  Date: 2021/11/5
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>期刊管理系统</title>
    <link rel="stylesheet" href="CSS/index.css">
</head>
<body>

<div class="main">
    <div class="head">
        期刊管理系统
    </div>

    <div class="base">

        <form action="${pageContext.request.contextPath}/FFF" method="post">
            <table border="" cellspacing="" cellpadding="">
                <tr>
                    <td>用户名</td>
                    <td><input type="text" name="userName" /></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><input type="password" name="passWord" /></td>
                </tr>


                <tr>
                    <td>用户类型</td>
                    <td>
                        <input type="radio" name="account"  value="user" />用户
                        <input type="radio" name="account"  value="admin" />管理员
                    </td>
                </tr>

                <tr  align="center">
                    <td colspan="2" >
                        <input type="button"  name="注册" value="注册" onclick=""/>
                        <input type="submit"  name="登录" value="登录" />
                    </td>
                </tr>
            </table>
        </form>




    </div>

</div>

</body>
</html>

