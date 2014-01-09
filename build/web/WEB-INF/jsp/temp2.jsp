<%-- 
    Document   : temp2
    Created on : 9 Jan, 2014, 10:32:11 AM
    Author     : sanket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <h2>Show Contacts</h2>
<table width="50%">
	<tr>
		<th>username</th>
		<th>password</th>
<!--		<th>Email</th>
		<th>Phone</th>-->
	</tr>
	<c:forEach items="${profileForm.profiles}" var="profile" varStatus="status">
		<tr>
			<td>${profile.userName}</td>
			<td>${profile.password}</td>
<!--			<td>${contact.email}</td>
			<td>${contact.phone}</td>-->
		</tr>
	</c:forEach>
</table>
        
    </body>
</html>
