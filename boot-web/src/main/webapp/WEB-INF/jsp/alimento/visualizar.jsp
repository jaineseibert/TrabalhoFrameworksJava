<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar alimento</title>
</head>
<body>

	<form action="/alimento/alterar" method="post">
		<input type="hidden" name="codigo" value="${alimento.codigo}">
		<c:import url="_campos.jsp"/>
		
		<button type="submit">Salvar</button>
		
		<a href="/alimento/listar">Cancelar</a>
		<a href="/alimento/deletar/${alimento.codigo}">Deletar</a>
	</form>
</body>
</html>