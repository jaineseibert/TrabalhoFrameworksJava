<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alimentos do cardapio</title>
</head>
<body>

	<a href="/alimentocardapio/novo">Adicionar Alimento à Cardapio</a>

	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Cardápio</th>
				<th>Alimento</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${alimentoCardapios}" var="alimentoCardapio">
				<tr>
					<td><a
						href="/alimentocardapio/visualizar/${alimentoCardapio.codigo}">${alimentoCardapio.codigo}</a></td>
					<td>${alimentoCardapio.cardapio.nome}</td>
					<td>${alimentoCardapio.alimento.nome}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<button>
		<a href="../../">Voltar ao menu</a>
	</button>
</body>
</html>








