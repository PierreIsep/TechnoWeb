<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Connexion</title>
</head>
<body>

<form th:action="@{&/Connexion}" th:object = "${Identifiant}" method="post">
            
            <fieldset>
                <legend>Connexion</legend>
                

                <label for="identifiant">Identifiant <span class="requis">*</span></label>
                <input type="text" id="identifiant" name="identifiant" value="" size="20" maxlength="60" />
                <br />

                <label for="mdp">Mot de passe : <span class="requis">*</span></label>
                <input type="password" id="mdp" name="mdp" value="" size="20" maxlength="60" />
                <br />

               
                <input type="submit" value="Connexion" class="sansLabel" />
                <br />
                
            </fieldset>
        </form>
</body>
</html>