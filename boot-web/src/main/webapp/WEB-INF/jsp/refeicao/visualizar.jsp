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

	<form action="/refeicao/alterar" method="post">
		<input type="hidden" name="codigo" value="${refeicao.codigo}">
		<c:import url="_campos.jsp"/>
		
		<button type="submit">Salvar</button>
		
		<a href="/refeicao/listar">Cancelar</a>
		<a href="/refeicao/deletar/${refeicao.codigo}">Deletar</a>
	</form>
</body>
</html>