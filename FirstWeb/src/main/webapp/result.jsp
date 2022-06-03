<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
   out.println(" JSP is loading");

%>
<h3>The last added person is</h3>
<ul>
   <li> Sno: ${person.sno} </li>
   <li> Name :${person.name} </li>
   <li> City: ${person.city} </li>
</ul>
<h3>The data available in people list so far</h3>
<table>
    <thead> 
    <tr>
         <th>Sno </th>
         <th>Name </th>
         <th>City </th>
     </tr>
    </thead>
    <c:forEach items="${plist}" var="x">
         <tr>
             <td> ${x.sno} </td>
             <td> ${x.name} </td>
             <td> ${x.city} </td>
         </tr>
    </c:forEach>
</table>
</body>
</html>