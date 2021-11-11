<%--
  Created by IntelliJ IDEA.
  User: 79984
  Date: 2021/11/9
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<table >
    <tr><th colspan="2">注册界面</th></tr>
    <tr>
        <td>${pageContext.session}</td>
        <td><input type="text" name="userName" placeholder="请输入用户名"/></td>
    </tr>
    <tr>
        <td>${sessionScope.account}</td>
        <td>QNMD</td>
        <td><input type="password" name="passWord" placeholder="请输入密码"/></td>
    </tr>
    <tr align="center">
        <td colspan="2">

            <input type="submit" id="upRegister" name="" value="注册"/>
            <button type="button" id="upReturn" name="" value="" onclick="window.location.href='${pageContext.request.contextPath}/login'">返回</button>
        </td>
    </tr>
</table>
