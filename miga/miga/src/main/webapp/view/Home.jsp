<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<%@include file="Header.jsp" %>

<html xmlns:th="http://www.thymeleaf.org">
<!-- <html> -->
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="view/css/Home.css"/>
<title>Home</title>
</head>



<body>

<div id="menu">

<h3> Classement </h3>

<c:forEach  items="${reclamations}" var ="reclamation">
        <ul>
          <li>${reclamation.titre} : ${reclamation.nombre_vote}</li>  	
          
        </ul>
</c:forEach>


</div>
	
Welcome Home 

<div id="contenue">
<table border="1" class="reclamation">
        <tr>
          <th>Titre</th>
          <th>Description</th>
          <th> Voter </th>
        </tr>
        <form:form action="/Voter" modelAttribute= "Vote" method="post" >
        <c:forEach  items="${reclamations}" var ="reclamation">
        <tr>
          <td>${reclamation.titre} </td>  	
          <td>${reclamation.description} </td>
<%--           <td><button type="submit" name = "choix${reclamation.id}" ></button> --%>
			<td> ${reclamation.id}</td>
          <td><input type="checkbox" name="id_Reclamation" value = "${reclamation.id}" > </td>
        </tr>
        
        </c:forEach>
         <p><input type="submit" class="btn btn-success" value="Soumettre les votes"/></p>
        </form:form>
</table></br>

</div>

<!-- <a href="proposer"> Proposer une réclamation </a> -->



</body>
</html>