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
   <h1>Home page is loaded.....</h1>
   <h3><u>Developers</u></h3>
   <ul>
   <c:forEach items="${names}" var="x">
     <li>${x}</li>
   </c:forEach>
   </ul>
</body>
</html>