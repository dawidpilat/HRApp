<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>HRApp - Dodaj nowe treści</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/styles.css" type="text/css" rel="stylesheet">
</head>

<body>

<%@ include file="/WEB-INF/segments/header.jspf" %>

<div class="container">
    <div class="col-md-8 col-md-offset-2">
        <form class="form-signin" method="post" action="${pageContext.request.contextPath}/new-data">
            <h2 class="form-signin-heading">Dodaj nowego użytkownika</h2>


            <input name="name" type="text" class="form-control" placeholder="Imię"
                   required autofocus />
            <input name="surname" type="text" class="form-control" placeholder="Nazwisko"
                   required autofocus />
            <input name="username" type="text" class="form-control" placeholder="Login"
                   required autofocus />
            <input name="address" type="text" class="form-control" placeholder="Adres"
                   required autofocus />
            <input name="email" type="text" class="form-control" placeholder="E-mail"
                   required autofocus />
            <input name="marital_status" type="text" class="form-control" placeholder="Adres zamieszkania"
                   required autofocus />

            <input class="btn btn-lg btn-primary btn-block" type="submit"
                   value="Dodaj!" />
        </form>
    </div>
</div>

<%@ include file="/WEB-INF/segments/footer.jspf" %>

<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="resources/js/bootstrap.js"></script>
</body>
</html>