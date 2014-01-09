<%-- 
    Document   : temp1
    Created on : 9 Jan, 2014, 10:21:29 AM
    Author     : sanket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <h2>Spring MVC Multiple Row Form Submit example</h2>
        <form:form method="post" action="save.htm" modelAttribute="profileForm">
            <table>
                <tr>
                    <th>username</th>
                    <th>password</th>
                    <!--                    <th>Lastname</th>
                                        <th>Email</th>
                                        <th>Phone</th>-->
                </tr>
                <c:forEach items="${profileForm.profiles}" var="profile" varStatus="status">
                    <tr>
                        <!--<td align="center">${status.count}</td>-->
                       <td><input name="profiles[${status.index}].userName" value="${profile.userName}"/></td>
                       <td><input name="profiles[${status.index}].password" value="${profile.password}"/></td>
<!--                         <td><input name="contacts[${status.index}].email" value="${contact.email}"/></td>
                        <td><input name="contacts[${status.index}].phone" value="${contact.phone}"/></td> -->
                    </tr>
                </c:forEach>
            </table>	
            <br/>
            <input type="submit"  />

        </form:form>


    </body>
</html>
