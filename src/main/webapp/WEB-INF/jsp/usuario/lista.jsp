<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de Usuários</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />
	
	<div class="container mt-3">
		<h3>Usuários: ${listagem.size()}</h3>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Email</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="u" items="${listagem}">
					<tr>
						<td>${u.id}</td>
						<td>${u.nome}</td>
						<td>${u.email}</td>
						<td>${u.senha}</td>
						<td><a href="/usuario/${u.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>