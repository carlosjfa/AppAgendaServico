<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de Consultas</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container mt-3">
		<h3>Consultas: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Data</th>
					<th>Convênio</th>
					<th>Primeira Vez</th>
					<th>Retorno</th>
					<th>Paciente</th>
					<th>Serviços</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="c" items="${listagem}">
					<tr>
						<td>${c.id}</td>
						<td>${c.data}</td>
						<td>${c.convenio}</td>
						<td>${c.primeiraVez}</td>
						<td>${c.retorno}</td>
						<td>${c.paciente.nome}</td>
						<td>${c.servicos.size()}</td>
						<td><a href="/consulta/${c.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>