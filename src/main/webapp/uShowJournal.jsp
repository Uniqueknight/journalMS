<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: 79984
  Date: 2021/11/11
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table cellpadding="5px" border="2">
    <th>期刊名</th>
    <th>期刊号</th>
    <th>期刊种类</th>
    <th>价格</th>
    <th>出版年份</th>
    <th>所属刊物</th>
    <th>操作</th>
    <c:forEach var="journal" items="${journalList}">
        <tr>
            <td>${journal.jourName}</td>
            <td>${journal.jourNum}</td>
            <td>${journal.jourType}</td>
            <td>${journal.jourPrice}</td>
            <td>${journal.jourYear}</td>
            <td>${journal.jourPart}</td>
            <td><a href="<%=request.getContextPath()%>/uDeleteJournalServlet?jourName=${journal.jourName}">退订</a></td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
