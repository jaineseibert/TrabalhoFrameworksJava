<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de refeições</title>
</head>
<body>

	<a href="/refeicao/novo">Nova refeicao></a>

	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Descricao</th>
				<th>Cardapio</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${refeicoes}" var="refeicao">
				<tr>
					<td><a
						href="/refeicao/visualizar/${refeicao.codigo}">${refeicao.codigo}</a></td>
					<td>${refeicao.nome}</td>
					<td>${refeicao.cardapio.nome}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<button>
		<a href="../../">Voltar ao menu</a>
	</button>
</body>
</html>








