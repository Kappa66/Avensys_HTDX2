<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<html>
	<head>
		<link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
		<title>${action} Employee Page</title>
	</head>
	<body>
		<div class="container">
		<h1>${action} Employee Details</h1>
		<form:form method="post" modelAttribute ="employee">
			Name:<form:input type="text" path="name" required="required"/>
			<form:errors path="name" cssClass="text-warning"/><br><br>
			Address: <form:input type="text" path="address" required="required"/>
			<form:errors path="address" cssClass="text-warning"/><br><br>
			Age: <form:input type="text" path="age" required="required"/>
						 <form:errors path="age" cssClass="text-warning"/><br><br>
			<form:input type="hidden" path="id"/>			
			<input type="submit" class="btn btn-success">
		</form:form>
		</div>
	<script src = "/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src = "/webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>