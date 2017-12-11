<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="tab">
		<a href="/app/getLogin"><button class="tablinks">Home</button></a>
		<a href="/app/restaurantList"><button class="tablinks" >Restaurants</button></a>
		<a href="/app/restaurantReviewList"><button class="tablinks">Reviews</button></a>
		<a href="/app/restaurantOrderList"><button class="tablinks">Orders</button></a>
		<a href="/app"><button class="tablinks">Logout</button></a>
	</div>

	<p>${ restaurant.getRName()}</p>
	<p>${ restaurant.getPhone()}</p>
	<p>${ restaurant.getDiningType()}</p>
	<p>$ ${restaurant.getPriceRange() }</p>
	<p>${restaurant.getDeliveryFlag() }</p>
</body>
</html>