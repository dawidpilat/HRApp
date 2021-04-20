<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>HRApp</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/styles.css" type="text/css" rel="stylesheet">
</head>

<body>

<%@ include file="/WEB-INF/segments/header.jspf" %>


<main>
    <c:forEach var="data" items="${requestScope.datas}">


        <table>
            <thead>
            <tr> <th> Dane personalne
            <tbody>
            <tr> <th> Imię               <td><c:out value="${data.name}"/>
            <tr> <th> Nazwisko           <td><c:out value="${data.surname}"/>
            <tr> <th> Nazwa użytkownika  <td><c:out value="${data.username}"/>
            <tr> <th> Adres zamieszkania <td><c:out value="${data.address}"/>
            <tr> <th> Email              <td><c:out value="${data.email}"/>
            <tr> <th> Stan cywilny       <td><c:out value="${data.marital_status}"/>

        </table>


    </c:forEach>
</main>

<%@ include file="/WEB-INF/segments/footer.jspf" %>

<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="resources/js/bootstrap.js"></script>
</body>
</html>