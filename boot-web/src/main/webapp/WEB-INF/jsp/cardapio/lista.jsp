<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de cardápios</title>
</head>
<body>

	<a href="/cardapio/novo">Novo Cardapio</a>

	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Descrição</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${cardapios}" var="cardapio">
				<tr>
					<td><a href="/cardapio/visualizar/${cardapio.codigo}">${cardapio.codigo}</a></td>
					<td>${cardapio.nome}</td>
				</tr>
			</c:forEach>
			<button>
				<a href="../../">Voltar ao menu</a>
			</button>
		</tbody>
	</table>

</body>
</html>








