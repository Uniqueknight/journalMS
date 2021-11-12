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
    <title>用户中心</title>
    <link rel="stylesheet" type="text/css" href="CSS/userCenter.css">
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
    </script>
    <script>
        $(document).ready(function () {
            //用户名文本框绑定失去焦点事件

            $("#checkUInfo").click(function (){
                alert("qnmd");
                $.ajax({
                    url:"uCheckUInfoServlet",
                    type:"post",
                    dataType:"text",
                    success:function (data){
                        $("#content").html(data);
                    }
                })
            })

            <%--$("#checkUInfo").click(function (){--%>
            <%--    alert("qnmd");--%>
            <%--    // $.ajax({--%>
            <%--    //     url: "uCheckUInfoServlet",--%>
            <%--    //     type: "post",--%>
            <%--    //     success:function (data){--%>
            <%--    //         $("#content").html(data);--%>
            <%--    //     }--%>
            <%--    // })--%>
            <%--})--%>

            <%--$("#checkJournal").click(function (){--%>
            <%--    // alert("qnmd");--%>
            <%--    $.ajax({--%>
            <%--        url: "uCheckJournalServlet",--%>
            <%--        type: "post",--%>
            <%--        success:function (data){--%>
            <%--            $("#content").html(data);--%>
            <%--        }--%>
            <%--    })--%>
            <%--})--%>

            <%--$("#changeUInfo").click(function (){--%>
            <%--    // alert("qnmd");--%>
            <%--    $.ajax({--%>
            <%--        url: "uChangeUInfo",--%>
            <%--        type: "post",--%>
            <%--        data:{username:${sessionScope.userName}},--%>
            <%--        success:function (data){--%>
            <%--            alert(${sessionScope.userName})--%>
            <%--            $("#content").html(data);--%>
            <%--        }--%>
            <%--    })--%>
            <%--})--%>

            <%--$("#changeJournal").click(function (){--%>
            <%--    // alert("qnmd");--%>
            <%--    $.ajax({--%>
            <%--        url: "uChangeJournalServlet",--%>
            <%--        type: "post",--%>
            <%--        success:function (data){--%>
            <%--            $("#content").html(data);--%>
            <%--        }--%>
            <%--    })--%>
            <%--})--%>

            <%--$("#deleteJournal").click(function (){--%>
            <%--    // alert("qnmd");--%>
            <%--    $.ajax({--%>
            <%--        url: "uDeleteJournalServlet",--%>
            <%--        type: "post",--%>
            <%--        success:function (data){--%>
            <%--            $("#content").html(data);--%>
            <%--        }--%>
            <%--    })--%>
            <%--})--%>


        });



    </script>
</head>
<body>

<div id="main">
    <div id="head">
        <h1>用户中心</h1>
    </div>

    <div id="base">
        <div id="nav">
            <table border="0" cellspacing="1" cellpadding="5">
                <tr>
                    <td><button id="checkUInfo" type="button">个人信息</button></td>
                </tr>

                <tr>
                    <td><button id="checkJournal" type="button">订阅信息</button></td>
                </tr>

                <tr>
                    <td><button id="changeUInfo" type="button">修改信息</button></td>
                </tr>

                <tr>
                    <td><button id="changeJournal" type="button">订阅报刊</button></td>
                </tr>

                <tr>
                    <td><button id="deleteJournal" type="button">撤销订阅</button></td>
                </tr>
            </table>
        </div>

        <div id="content">
            <!-- JSP预备！！！呼呼呼！！！ -->

        </div>


    </div>

</div>


</body>
</html>

