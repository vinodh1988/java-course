<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

     <s:form action="store.do" modelAttribute="project" method="post">
  <table cellspacing=0 cellpadding=0 >
     <thead>
         <tr><th colspan="3" align="center"> Person Form</th></tr>
     </thead>
     <tbody>
         <tr>
             <td>Sno</td>
             <td><s:input path="projectno"/></td>
         </tr>
          <tr>
             <td>Name</td>
             <td><s:input path="title"/></td>
             
         </tr>
          <tr>
             <td>Description</td>
             <td><s:input path="description"/></td>
          </tr>
         <tr>
             <td colspan="3" align="Center">
                 <input type="submit" value="Store Project">
             </td>
         </tr>
     </tbody>
  </table>
  </s:form>

</body>
</html>