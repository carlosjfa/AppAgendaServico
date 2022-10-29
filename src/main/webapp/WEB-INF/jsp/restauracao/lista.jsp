<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de Restaurações</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container mt-3">
		<h3>Restaurações: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Código do Dente</th>
					<th>Material Utilizado</th>
					<th>Anos de Garantia</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="r" items="${listagem}">
					<tr>
						<td>${r.id}</td>
						<td>${r.codDente}</td>
						<td>${r.materialUtilizado}</td>
						<td>${r.anosGarantia}</td>
						<td><a href="/restauracao/${r.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>