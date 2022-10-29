<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de Pacientes</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container mt-3">
		<h3>Pacientes: ${listagem.size()}</h3>

		<table class="table table-striped">

			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Data de Nascimento</th>
					<th>Endereço</th>
					<th>Telefone</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="p" items="${listagem}">
					<tr>
						<td>${p.id}</td>
						<td>${p.nome}</td>
						<td>${p.dataNascimento}</td>
						<td>${p.endereco}</td>
						<td>${p.telefone}</td>
						<td><a href="/paciente/${p.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>