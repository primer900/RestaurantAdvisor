<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Restaurant Advisor System</title>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<style>
		h3,h4 {
			text-align: center;
		}
		.inputform {
			    width: 315px;
    			margin: 0 auto;
		}
		.mytext300 {
 				width: 230px;
		}
	</style>
	
</head>
<body>
<h2>Welcome to Restaurant Advisor ${customer.getFName()}!</h2>
<div class="tab">
	<button class="tablinks">Home</button>
	<a href="/app/restaurantList"><button class="tablinks" >Restaurants</button></a>
	<a href="/app/review"><button class="tablinks">Reviews</button></a>
	<a href="/app/restaurantOrderList"><button class="tablinks">Orders</button></a>
	<a href="/app"><button class="tablinks">Logout</button></a>
</div>

<div class="inputform">
	<form:form method="GET" action="SearchRestaurant" modelAttribute="restaurant">
	     <p><form:input path="RName" class="mytext300"/></p>
	     <input type="submit" value="Search"/>
	</form:form>
</div>

</body>
</html>