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
    <title>管理中心</title>
    <link rel="stylesheet" type="text/css" href="CSS/adminCenter.css">
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
    <script>
        $(document).ready(function () {
            //用户名文本框绑定失去焦点事件

            $("#checkUser").click(function () {
                $.ajax({
                    url: "aShowUserServlet",
                    type: "post",
                    dataType: "text",
                    success: function (data) {
                        $("#content").html(data);
                    }
                })
            })

            $("#checkJournal").click(function () {
                $.ajax({
                    url: "aShowJournalServlet",
                    type: "post",
                    dataType: "text",
                    success: function (data) {
                        $("#content").html(data);
                    }
                })
            })


            $("#addUserInfo").click(function () {
                $.ajax({
                    url: "aSAddUserInfoServlet",
                    type: "post",
                    dataType: "text",
                    success: function (data) {
                        $("#content").html(data);
                    }
                })
            })

            $("#addJournal").click(function () {
                $.ajax({
                    url: "aSAddJournalServlet",
                    type: "post",
                    dataType: "text",
                    success: function (data) {
                        $("#content").html(data);
                    }
                })
            })


            $("#statistics").click(function () {
                $.ajax({
                    url: "aStatisticsServlet",
                    type: "post",
                    dataType: "text",
                    success: function (data) {
                        $("#content").html(data);
                    }
                })
            })





        })
    </script>


</head>
<body>

<div id="main">
    <div id="head">
        <h1>管理中心</h1>
    </div>

    <div id="base">
        <div id="nav" >
            <table border="0" cellspacing="1" cellpadding="5">
                <tr>
                    <td><button id="checkUser" type="button">用户信息查询</button></td>
                </tr>

                <tr>
                    <td><button id="checkJournal" type="button">报刊信息查询</button></td>
                </tr>

                <tr>
                    <td><button id="addUserInfo" type="button">用户信息管理</button></td>
                </tr>

                <tr>
                    <td><button id="addJournal" type="button">报刊信息管理</button></td>
                </tr>

                <tr>
                    <td><button id="statistics" type="button">统计信息管理</button></td>
                </tr>

                <tr>
                    <td><button id="logout" type="button" onclick="window.location.href='${pageContext.request.contextPath}/logoutServlet'">退出登录账户</button></td>
                </tr>
            </table>
        </div>

        <div id="content">
            <!-- JSP预备！！！哈哈哈！！！ -->

        </div>


    </div>

</div>

</body>
</html>
