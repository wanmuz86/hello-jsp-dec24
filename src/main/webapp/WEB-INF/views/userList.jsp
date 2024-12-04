<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
<title>User List</title>
</head>
<body>
<h2>User List</h2>
<c:if test="${not empty userList.users}">
<table>
<tr>
<th>Name</th>
<th>Email</th>
<th>Phone</th>
</tr>
<!-- For each user : userList.users -->
<c:forEach var="user" items="${userList.users}">
<tr>
<td><c:out value="${user.name}"/></td>
<td><c:out value="${user.email} "/></td>
<td><c:out value="${user.phone} "/></td>
</tr>
</c:forEach>
</table>
</c:if>
<c:if test="${empty userList.users}">
<p>No user available at the moment.</p>
</c:if>
</body>
</html>