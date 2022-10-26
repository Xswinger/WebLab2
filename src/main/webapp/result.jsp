<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Лабораторная работа №2</title>
    <link rel="stylesheet" type="text/css" href="resources/style.css">
</head>
<body>
<div id="header" class="main_field">
        <span id="header_text">
            Аллаяров Игорь, P32121, Вариант №1101
        </span>
</div>
<div id="wrapper" class="main_field">
    <h2 class="center">Таблица параметров</h2>
    <table id="result_table" rules="all">
        <thead>
        <th>Значение X</th>
        <th>Значение Y</th>
        <th>Значение R</th>
        </thead>
        <tbody>
<%--            <c:set scope="session" var="row" value="RequestData"/>--%>
<%--            <c:set var="area" value="row.area"/>--%>
<%--            <c:set var="x" value="area.x"/>--%>
<%--            <c:set var="y" value="area.y"/>--%>
<%--            <c:set var="r" value="area.r"/>--%>
<%--            <c:set var="currentTime" value="row.currentTime"/>--%>
<%--            <c:set var="executionTime" value="row.executionTime"/>--%>
<%--            <c:set var="result" value="row.result"/>--%>
<%--            <c:forEach var="row" items="${hitTable}">--%>
<%--                <tr class='columns'>--%>
<%--                    <td><c:out value="${x}" /></td>--%>
<%--                    <td><c:out value="${y}"/></td>--%>
<%--                    <td><c:out value="${r}"/></td>--%>
<%--                    <td><c:out value="${currentTime}"/></td>--%>
<%--                    <td><c:out value="${executionTime}"/></td>--%>
<%--                    <td><c:out value="${result}"/></td>--%>
<%--                </tr>--%>
<%--            </c:forEach>--%>
        </tbody>
    </table>
    <form id="forms" class="center" action="http://localhost:8080/Weblab2/index.jsp">
        <button>Вернуться на главную страницу</button>
    </form>
</div>
</body>
</html>
