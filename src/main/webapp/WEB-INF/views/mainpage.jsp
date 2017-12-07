<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Restaurant Advisor System</title>
</head>
<body>
<h2>Welcome to Restaurant Advisor ${customer.getFName()}!</h2>
<div class="tab">
	<button class="tablinks">Home</button>
	<a href="/app/restaurantList"><button class="tablinks" >Restaurants</button></a>
	<a href="/app/review"><button class="tablinks">Reviews</button></a>
	<button class="tablinks">Orders</button>
	<a href="/app"><button class="tablinks">Logout</button></a>
</div>

</body>
</html>