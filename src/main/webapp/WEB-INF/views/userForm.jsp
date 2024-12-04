<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<title>Add new User Page</title>
<style>
	.error {
		color:red;
	}
</style>
</head>
<body>
	<h2>Add new user</h2>
	<form:form modelAttribute="user" action="/submitForm" method="post">
	
<label for="name">Name</label>
<form:input path="name" id="name"/>
<form:errors path="name" cssClass="error"/>
	<br/>
	<label for="email">Email</label>
	<form:input path="email" id="email"/>
	<form:errors path="email" cssClass="error"/>
	<br/>
	<label for="phone">Phone</label>
	<form:input path="phone" id="phone"/>
	<form:errors path="phone" cssClass="error"/>
	<input type="submit" value="Submit"/>
</form:form>
</body>
</html>