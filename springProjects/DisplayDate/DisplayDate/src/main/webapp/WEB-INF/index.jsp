<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <title>Document</title>
</head>
<body>
    <h1>Hello There</h1>
    <fieldset>
    	<legend> Check out the date</legend>
    	<form:form method="POST" action="/date">
    	<input type="submit" value="Date"/>
    	</form:form>
    	<legend> Check out the time</legend>
    	<form:form method="POST" action="/time">
    	<input type="submit" value="Time"/>
    	</form:form>
    </fieldset>
</body>
</html>