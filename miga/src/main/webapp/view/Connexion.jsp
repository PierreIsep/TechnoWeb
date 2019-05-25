<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@include file="Header.jsp" %> 

<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="view/css/Connexion.css"/>
<title>Connexion</title>
</head>
<body>



	<form th:action="@{&/Connexion}" th:object = "${Identifiant}" method="post">
            
            <fieldset>
                <legend>Connexion</legend>
                
				
                <label for="identifiant">Identifiant <span class="requis">*</span></label>
                <input type="text" id="identifiant" name="identifiant" value="" />
                <br />

                <label for="mdp">Mot de passe <span class="requis">*</span></label>
                <input type="password" id="mdp" name="mdp" value="" />
                <br />

               
                <input type="submit" value="Connexion" class="sansLabel" />
                <br />
                
            </fieldset>
        </form>

</body>
</html>