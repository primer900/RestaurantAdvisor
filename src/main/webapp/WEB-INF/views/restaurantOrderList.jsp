<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Restaurants in Your Area</title>
</head>
<body>
<body>
<h1>Restaurant List:</h1>
<c:forEach var="r" items="${rlist}">
   <a href="/app/restaurantMenuOrder?restID=${r.getRestID() }"><c:out value="${r.getRName()}"/><h3></a>
</c:forEach>
</body>
</html>