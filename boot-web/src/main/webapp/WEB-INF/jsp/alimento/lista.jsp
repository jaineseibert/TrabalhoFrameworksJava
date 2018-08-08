<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Alimentos</title>
</head>
<body>

	<a href="/alimento/novo">Novo Alimento</a>

	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Descrição</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${alimentos}" var="alimento">
				<tr>
					<td><a href="/alimento/visualizar/${alimento.codigo}">${alimento.codigo}</a></td>
					<td>${alimento.nome}</td>
				</tr>
			</c:forEach>
			<button>
				<a href="../../">Voltar ao menu</a>
			</button>
		</tbody>
	</table>

</body>
</html>








