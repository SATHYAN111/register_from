<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Add Employee</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: maroon;">
			<div>
				<a href="<%=request.getContextPath()%>/" class="navbar-brand"> Add Employee </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/employee-list"
					class="navbar-brand">Employee List</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				

				
					 <h2>Add New Employee</h2>
				
<form:form action="create-employee" method="post" modelAttribute="employee">
							<div class="form-group">
								<label>Employee Name<font color="red"> *</font></label> <input
									class="form-control" required="required" name="empName" type="text"></div>
							
							<div class="form-group">
								<label>Email<font color="red"> *</font></label> <input
									class="form-control" required="required" name="email" type="text"></div>
									
								
									<div class="form-group">
								<label> Phone Number<font color="red"> *</font></label> <input
									class="form-control" required="required" name="phoneNumber" type="number"></div>
								
									<div class="form-group">
								<label>Address<font color="red"> *</font></label> <input
									class="form-control" required="required" name="address" type="text"></div>
							<center><button  type="submit" class="btn btn-success">Save</button></center>
							
						</form:form>
			
			</div>
		</div>
	</div>
</body>
</html>