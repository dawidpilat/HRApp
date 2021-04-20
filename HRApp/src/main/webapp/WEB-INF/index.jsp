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




<div class="container">
    <h2>Lista</h2>
    <div class=" vertical-menu a" >

        <a href="${pageContext.request.contextPath}/personal-data-view" class="list-group-item list-group-item-action .list-group-item-success">Dane personalne</a>
        <a href="${pageContext.request.contextPath}/new-data" class="list-group-item list-group-item-action">Dodaj</a>
    </div>
</div>


<%@ include file="/WEB-INF/segments/footer.jspf" %>

<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="resources/js/bootstrap.js"></script>
</body>
</html>