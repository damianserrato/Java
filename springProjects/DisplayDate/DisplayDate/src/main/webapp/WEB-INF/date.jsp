<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <title>Date</title>
</head>
<body>
    <h1><%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <c:out value="${dojoName}"/></h1>
    
    <form:form method="POST" action="/">
    	<input type="submit" value="Home"/>
    	</form:form>
</body>
</html>