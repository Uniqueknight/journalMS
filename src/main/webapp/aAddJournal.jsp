<%--
  Created by IntelliJ IDEA.
  User: 79984
  Date: 2021/11/13
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form action="${pageContext.request.contextPath}/aAddjournalServlet" method="" >
    <table border="" cellspacing="" cellpadding="" border="2">
        <tr>
            <td>期刊名</td>
            <td><input type="text"  id="jourName" name="jourName" value="" /></td>
        </tr>
        <tr>
            <td>期刊号</td>
            <td><input type="text" id="jourNum" name="jourNum" value="" /></td>
        </tr>
        <tr>
            <td>期刊种类</td>
            <td><input type="text" id="jourType" name="jourType"  value="" /></td>
        </tr>
        <tr>
            <td>价格</td>
            <td><input type="text" id="jourPrice" name="jourPrice"  value="" /></td>
        </tr>
        <tr>
            <td>出版年份</td>
            <td><input type="text" id="jourYear" name="jourYear"  value="" /></td>
        </tr>
        <tr>
            <td>所属刊物</td>
            <td><input type="text" id="jourPart" name="jourPart"  value="" /></td>
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
