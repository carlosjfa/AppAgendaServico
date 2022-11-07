<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de Serviços</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h3>Serviços: ${listagem.size()}</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Código</th>
					<th>Preço</th>
					<th>Data</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="s" items="${listagem}">
					<tr>
						<td>${s.id}</td>
						<td>${s.codigo}</td>
						<td>${s.preco}</td>
						<td>${s.data}</td>
						<td><a href="/servico/${s.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>