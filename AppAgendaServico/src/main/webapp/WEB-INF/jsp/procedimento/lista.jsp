<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de Procedimentos</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h3>Procedimentos: ${listagem.size()}</h3>
<h4><a href="/procedimento">Novo Procedimento</a></h4>
		<table class="table table-striped">

			<thead>
				<tr>
					<th>ID</th>
					<th>Tipo</th>
					<th>Preventivo</th>
					<th>Diagnóstico</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="p" items="${listagem}">
					<tr>
						<td>${p.id}</td>
						<td>${p.tipo}</td>
						<td>${p.preventivo}</td>
						<td>${p.diagnostico}</td>
						<td><a href="/procedimento/${p.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>