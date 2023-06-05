<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
		<title>Employee Page</title>
	</head>
		<body>
		<!--Hey ${name} !! Welcome to login page.-->
		<div>Hey ${name}, Welcome to Employee Records</div>
		<hr>
		<div><h1>Your Todos are:</h1></div>
		<div class ="container">
		<table class = "table">
		<thread>
			<tr>
			<th>ID</th>
			<th>Employee Name</th>
			<th>Address</th>
			<th>Age</th>
			
			<th>Delete</th>
			<th>Update</th>
			</tr>
		</thread>
		
		
		<tbody>
		
			<c:forEach items = "${employees}" var = "employees">
				<tr>
					<td>${employees.id}</td>
					<td>${employees.name}</td>
					<td>${employees.address}</td>
					<td>${employees.age}</td>					
					<td><a href="delete-employee?id=${employees.id}" class="btn btn-warning">Delete</a></td>
					<td><a href="update-employee?id=${employees.id}" class="btn btn-success">Update</a></td>
				</tr>
			</c:forEach>
		</tbody>
		</table>
		</div>		
		<script src ="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src ="/webjars/jquery/3.6.0/jquery.min.js"></script>

		<a href = "add-employees" class="btn btn-success">Add Todos</a>
		
		</body>
</html>