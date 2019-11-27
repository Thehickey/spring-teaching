<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 清淡欢颜
  Date: 2019/9/29
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <th>编号</th>
            <th>工资</th>
            <th>性别</th>
            <th>名称</th>
            <th>部门编号</th>
        </tr>
        <c:forEach var="emp" items="${employeeList}">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.salary}</td>
                <td>${emp.gender}</td>
                <td>${emp.username}</td>
                <td>${emp.deptId}</td>
            </tr>
        </c:forEach>
    </table>
    <form action="/select">
        工资：<input name="salary" type="text" value="${salary}">
        名称：<input name="username" type="text" value="${username}">
        <input type="submit" value="查询">
    </form>
</body>
</html>
