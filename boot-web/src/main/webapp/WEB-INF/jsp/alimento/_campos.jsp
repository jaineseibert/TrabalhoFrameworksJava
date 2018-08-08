<%@ taglib prefix="form" 
		uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="nome"> Descrição: </label>
<input type="text" name="nome" id="nome" value="${alimento.nome}">
<form:errors path="alimento.nome"/>
		
		
		
		
		
		
		
	