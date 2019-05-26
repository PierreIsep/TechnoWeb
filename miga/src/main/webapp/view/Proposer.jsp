<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="Header.jsp" %>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
<meta charset="ISO-8859-1">
<title>Proposer reclamation</title>
</head>
<body>

<h2> Proposer une réclamation</h2>

<form:form action="/Ajouter_Reclamation" modelAttribute= "Reclamation" method="post">
    
    <fieldset>
    <div>
        <label for="titre">Titre :</label>
        <textarea id="titre" name="titre"></textarea>
    </div>
    <div>
        <label for="description">Description :</label>
        <textarea id="description" name="description"></textarea>
    </div>
    <input type="submit" value="Ajouter Reclamation" class="sansLabel" />
    
    </fieldset>
    
</form:form>

</body>
</html>
