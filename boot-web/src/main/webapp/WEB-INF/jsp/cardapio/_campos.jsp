<%@ taglib prefix="form" 
		uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="nome"> Descri��o: </label>
<input type="text" name="nome" id="nome" value="${cardapio.nome}">
<form:errors path="cardapio.nome"/>
		
		
		
		
		
		
		
	