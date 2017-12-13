<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Restaurants to Review</title>
</head>
<body>
<body>
<h1>Restaurant List:</h1>

<div class="tab">
	<a href="/app/getLogin"><button class="tablinks">Home</button></a>
	<a href="/app/restaurantList"><button class="tablinks" >Restaurants</button></a>
	<a href="/app/restaurantReviewList"><button class="tablinks">Reviews</button></a>
	<a href="/app/restaurantOrderList"><button class="tablinks">Orders</button></a>
	<a href="/app"><button class="tablinks">Logout</button></a>
</div>

<c:forEach var="r" items="${rlist}">
   <a href="/app/restaurantReview?restID=${r.getRestID() }"><c:out value="${r.getRName()}"/><h3></a>
</c:forEach>

<br>

<c:forEach var="review" items="${reviewList}">
	<p><c:out value="${review.getReviewTitle()}"></c:out></p>
</c:forEach>
</body>
</html>