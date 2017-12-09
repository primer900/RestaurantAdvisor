<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create a new Order</title>
</head>
<body>
	<div>
		<h1>${Restaurant.getRName() } Menu</h1>
	</div>
	<c:forEach var="m" items="${MenuItems}">
		   <c:out value="${ m.getFoodName()}"/></h3>
		   <c:out value="${m.getPrice()}"/><h3>
	</c:forEach>
	
	<!-- 
		<h1>Review </h1>
	<div class="inputform">
	<form:form method="POST" action="NewOrder" modelAttribute="order">
	     <table>
	     	<tr>
	     		<td><h2></h2></td>
	     		<td><form:input path="RestID" class="mytext300"/></td>
	     	</tr>
	        <tr>
	            <td><h2>Title</h2></td>
	            <td><form:input path="ReviewTitle" class="mytext300"/></td>
	        </tr>
	        <tr>
	            <td><h2>Description</h2></td>
	            <td><form:input path="ReviewDescr" class="mytext300"/></td>
	        </tr>
	        
	        <tr>
	        	<td><h2>Customer Email</h2></td>
	        	<td><form:input path="custEmail" class="mytext300"/></td>
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
		
	 -->

</body>
</html>