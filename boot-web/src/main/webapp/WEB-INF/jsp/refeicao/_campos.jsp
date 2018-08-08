<%@ taglib prefix="form" 
		uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="nome"> Descrição: </label>
<input type="text" name="nome" id="nome" value="${refeicao.nome}">
<form:errors path="refeicao.nome"/>

<label for="cardapio"> Cardápio </label>
<select id="cardapio" name="cardapio.codigo">
	<option></option>
	<c:forEach items="${cardapios}" var="cardapio">
		<c:set var="selecionado" value=""/>
		<c:if test="${cardapio.codigo eq refeicao.cardapio.codigo}">
			<c:set var="selecionado" value="selected"/>
		</c:if>
		<option value="${cardapio.codigo}" ${selecionado}>${cardapio.nome}</option>
	</c:forEach>
</select>
		
		
		
		
		
		
		
	