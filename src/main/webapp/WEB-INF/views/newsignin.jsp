<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Restaurant Advisor New Customer Signup</title>
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
		.mytext100 {
 				width: 100px;
		}
		.mytext200 {
 				width: 200px;
		}	
		.mytext50 {
 				width: 50px;
		}					
	</style>
</head>
<body>
	<h3>
	Welcome to the Online Restaurant Advisor Database System  
	</h3>
	<div class="inputform">
	<form:form method="POST" action="addCustomer" modelAttribute="customer">
	     <table>
	     	<tr>
	            <td>First Name</td>
	            <td><form:input path="FName" class="mytext300"/></td>
	        </tr>
	        <tr>
	            <td>Last Name</td>
	            <td><form:input path="LName" class="mytext300"/></td>
	        </tr>
	        <tr>
	            <td>Email</td>
	            <td><form:input path="Email" class="mytext300"/></td>
	        </tr>
	        <tr>
	            <td>Street No.</td>
	            <td><form:input path="StreetNo" class="mytext50"/></td>
	        </tr>
	        <tr>
	            <td>Street</td>
	            <td><form:input path="Street" class="mytext300"/></td>
	        </tr>	        	        
	        <tr>
	            <td>City</td>
	            <td><form:input path="City" class="mytext200"/></td>
	        </tr>	        
	        <tr>
	            <td>State</td>
	            <td><form:input path="State" class="mytext100"/></td>
	        </tr>
	        <tr>
	            <td>Zip</td>
	            <td><form:input path="Zip" class="mytext50"/></td>
	        </tr>	        	        
	        <tr>
	            <td>Phone</td>
	            <td><form:input path="Phone" class="mytext100"/></td>
	        </tr>
	        <tr>
	            <td>Password</td>
	            <td><form:input path="Password" type="password" class="mytext300"/></td>
	        </tr>
	        <tr><td/></tr>
	        <tr>
	            <td></td>
	            <td><input type="submit" value="Submit"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="Clear"/></td>
	        </tr>
	    </table>
	</form:form>
	</div>

</body>
</html>
