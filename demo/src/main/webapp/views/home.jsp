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
   <h5>Projects</h5>
   <c:forEach items="${projects}" var="x">
     <div style="border: 2px solid black; background-color: lightblue; padding: 30px; width: 600px; height: 100px;">
         <h3>${x.title}</h3>
         <h6>${x.description}</h6>
     </div>
   </c:forEach>
</body>
</html>