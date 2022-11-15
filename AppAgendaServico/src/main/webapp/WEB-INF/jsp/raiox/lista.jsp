<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de Raios X</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />
	
	<div class="container mt-3">
		<h3>Raios X: ${listagem.size()}</h3>
		<h4><a href="/raiox">Novo RaioX</a></h4>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Tipo</th>
					<th>Dentista Responsável</th>
					<th>Diagnóstico</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="r" items="${listagem}">
					<tr>
						<td>${r.id}</td>
						<td>${r.tipo}</td>
						<td>${r.dentistaResponsavel}</td>
						<td>${r.diagnostico}</td>
						<td><a href="/raiox/${r.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>