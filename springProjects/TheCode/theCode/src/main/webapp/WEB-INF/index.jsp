<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h1>What is the Code?!</h1>
    
    <form method="POST" action="/errors">
	    <label>Code: <input type="text" name="content"></label>
	    <button>Try Code</button>
	</form>
	
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <c:out value="${errors}"/>
</body>
</html>