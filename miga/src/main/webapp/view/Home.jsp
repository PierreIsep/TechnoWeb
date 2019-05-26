<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<!-- <html> -->
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
          <th> Voter </th>
        </tr>
        <form:form action="/Voter" modelAttribute= "Reclamation" method="post" >
        <c:forEach  items="${reclamations}" var ="reclamation">
        <tr>
          <td>${reclamation.titre} </td>  	
          <td>${reclamation.description} </td>
          <td><button type="submit" name = "choix${reclamation.id}" ></button>
<%--           <td><input type="checkbox" name="choix${reclamation.id}" th:value = "${reclamations}" > </td> --%>
        </tr>
        
        </c:forEach>
        <p><input type="submit" class="btn btn-success" value="Soumettre les votes"/></p>
        </form:form>
</table>

<a href="proposer"> Proposer une réclamation </a>



</body>
</html>
