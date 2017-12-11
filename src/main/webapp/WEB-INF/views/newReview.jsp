<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Review Restaurant</title>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<style>
		h1,h3,h4 {
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
	<h1>Review </h1>
	
	<div class="tab">
		<a href="/app/getLogin"><button class="tablinks">Home</button></a>
		<a href="/app/restaurantList"><button class="tablinks" >Restaurants</button></a>
		<a href="/app/review"><button class="tablinks">Reviews</button></a>
		<a href="/app/restaurantOrderList"><button class="tablinks">Orders</button></a>
		<a href="/app"><button class="tablinks">Logout</button></a>
	</div>
	
	<div class="inputform">
	<form:form method="POST" action="InsertReview" modelAttribute="review">
	     <table>
	        <tr>
	            <td><h2>Title</h2></td>
	            <td><form:input path="ReviewTitle" class="mytext300"/></td>
	        </tr>
	        <tr>
	            <td><h2>Description</h2></td>
	            <td><form:input path="ReviewDescr" class="mytext300"/></td>
	        </tr>
	        
	        <tr>
	        	<td><h2>Rating</h2></td>
	        	<td><form:input path="Rating" class="mytext300"/><td/></tr>
	        <tr>
	            <td></td>
	            <td><input type="submit" value="Submit"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="Clear"/></td>
	        </tr>
	    </table>
	</form:form>
	</div>
</body>
</html>