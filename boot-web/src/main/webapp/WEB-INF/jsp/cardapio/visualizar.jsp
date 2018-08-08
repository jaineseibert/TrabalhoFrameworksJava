<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar cardápio</title>
</head>
<body>

	<form action="/cardapio/alterar" method="post">
		<input type="hidden" name="codigo" value="${cardapio.codigo}">
		<c:import url="_campos.jsp"/>
		
		<button type="submit">Salvar</button>
		
		<a href="/cardapio/listar">Cancelar</a>
		<a href="/cardapio/deletar/${cardapio.codigo}">Deletar</a>
	</form>
</body>
</html>