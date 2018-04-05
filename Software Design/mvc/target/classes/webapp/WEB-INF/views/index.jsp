<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
    <title>To do lists</title>
</head>
<body>
    <h3>To do lists</h3>
    <table>
        <c:forEach var="list" items="${lists}">
        <tr>
            <td>${list.getId()}</td>
            <td>${list.getName()}</td>
        </tr>
        </c:forEach>
    </table>

    <h3>Add new list</h3>
    <form:form modelAttribute="newList" method="POST" action="/add-list">
        <form:label path="name">Name:</form:label></td>
        <form:input path="name"/>
        <input type="submit" value="add">
    </form:form>
</body>
</html>