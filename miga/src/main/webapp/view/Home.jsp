<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!-- <html xmlns:th="http://www.thymeleaf.org"> -->
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>


	
Welcome Home
	

	
<table border="1">
        <tr>
          <th>First Name</th>
          <th>Last Name</th>
        </tr>
        <c:forEach  items="${reclamations}" var ="reclamation">
        <tr>
          <td>${reclamation.titre}</td>
          <td>${reclamation.description}</td>
        </tr>
        </c:forEach>
      </table>



</body>
</html>
