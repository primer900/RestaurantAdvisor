<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Restaurant Advisor System</title>
</head>
<body>
<h2>Welcome to this page ${customer.getFName()}!</h2>
<div class="tab">
	<button class="tablinks">Home</button>
	<button class="tablinks" onclick="restaurant.jsp">Restaurants</button>
	<button class="tablinks">Reviews</button>
	<button class="tablinks">Orders</button>
	<a href="/app"><button class="tablinks">Logout</button></a>
</div>

<h4>To transfer control to a view using a new controller file, click <a href="/app/restaurantList">here</a>.</h4>
</body>
</html>