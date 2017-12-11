<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create a new Order</title>

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
	<div>
		<h1>${Restaurant.getRName() } Menu</h1>
	</div>
	
	<div class="tab">
		<button class="tablinks">Home</button>
		<a href="/app/restaurantList"><button class="tablinks" >Restaurants</button></a>
		<a href="/app/restaurantReviewList"><button class="tablinks">Reviews</button></a>
		<a href="/app/restaurantOrderList"><button class="tablinks">Orders</button></a>
		<a href="/app"><button class="tablinks">Logout</button></a>
	</div>
	<br>
	
	<div class="inputform">
	<form:form method="POST" action="MakeOrder" modelAttribute="Order">
	     <table>
	     	<tr>
	     		<td><h2>Quantity</h2></td>
	     		<td><form:input path="Qty" class="mytext300"/></td>
	     	</tr>
	        <tr>
	            <td><h2>Option</h2></td>
	            <td><form:input path="FoodName" class="mytext300"/></td>
	        </tr>
	        <tr><td/></tr>
	        <tr>
	            <td><h2>Email</h2></td>
	            <td><form:input path="CustEmail" class="mytext300"/></td>
	        </tr>
	        
	        <tr><td/></tr>
	        <tr>
	            <td><h2>Delivery Choice</h2></td>
	            <td><form:input path="DeliveryType" class="mytext300"/></td>
	        </tr><tr>
	            <td></td>
	            <td><input type="submit" value="Submit"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="Clear"/></td>
	        </tr>
	    </table>
	</form:form>
	</div>
	
	<br>
	<c:forEach var="m" items="${MenuItems}">
		   <c:out value="${ m.getFoodName()}"/></h2>
		   <c:out value="${m.getPrice()}"/><h2>
	</c:forEach>
	
	

</body>
</html>