<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h1>results</h1>
    
    <fieldset>
    	<legend>Submitted Info</legend>
    	<p>Name: <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <c:out value="${name}"/></p>
    	<p>Dojo Location: <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <c:out value="${location}"/></p>
    	<p>Favorite Language: <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <c:out value="${language}"/></p>
    	<p>Comment: <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <c:out value="${comment}"/></p>
    
    
    
    </fieldset>
    
    
    
    
    
    
    
    
    
    
  
</body>
</html>