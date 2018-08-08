<%@ taglib prefix="form" 
		uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="cardapio"> Cardápio </label>
<select id="cardapio" name="cardapio.codigo">
	<option></option>
	<c:forEach items="${cardapios}" var="cardapio">
		<c:set var="selecionado" value=""/>
		<c:if test="${cardapio.codigo eq alimentoCardapio.cardapio.codigo}">
			<c:set var="selecionado" value="selected"/>
		</c:if>
		<option value="${cardapio.codigo}" ${selecionado}>${cardapio.nome}</option>
	</c:forEach>
</select>

<label for="alimento"> Alimento </label>
<select id="alimento" name="alimento.codigo">
	<option></option>
	<c:forEach items="${alimentos}" var="alimento">
		<c:set var="selecionado" value=""/>
		<c:if test="${alimento.codigo eq alimentoCardapio.alimento.codigo}">
			<c:set var="selecionado" value="selected"/>
		</c:if>
		<option value="${alimento.codigo}" ${selecionado}>${alimento.nome}</option>
	</c:forEach>
</select>
		
		
		
		
		
		
		
	