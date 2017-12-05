<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Restaurant Advisor Login</title>
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
	<h3>
	Welcome to the Online Restaurant Advisor Database System  
	</h3>
	<div class="inputform">
	<form:form method="POST" action="checkLogin" modelAttribute="customer">
	     <table>
	        <tr>
	            <td>Username</td>
	            <td><form:input path="Email" class="mytext300"/></td>
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
	<h4>First time users, sign in <a href="newSignIn">here</a>.</h4>

</body>
</html>
