<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar vínculo</title>
</head>
<body>

	<form action="/alimentocardapio/alterar" method="post">
		<input type="hidden" name="codigo" value="${alimentoCardapio.codigo}">
		<c:import url="_campos.jsp"/>
		
		<button type="submit">Salvar</button>
		
		<a href="/alimentocardapio/listar">Cancelar</a>
		<a href="/alimentocardapio/deletar/${alimentoCardapio.codigo}">Deletar</a>
	</form>
</body>
</html>