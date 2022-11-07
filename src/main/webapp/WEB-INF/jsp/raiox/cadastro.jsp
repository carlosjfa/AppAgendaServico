<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de Raios X</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Raio X</h2>
		<form action="/raiox/incluir" method="post">
			<div class="form-group">
				<label for="tipo">Tipo:</label> <input type="text"
					class="form-control" id="tipo" placeholder="Entre com o seu tipo"
					name="tipo">
			</div>
			<div class="form-group">
				<label for="dentista-responsavel">Dentista Responsável:</label> <input type="text"
					class="form-control" id="dentistaResponsavel" placeholder="Entre com o seu dentista responsável"
					name="dentistaResponsavel">
			</div>
			<div class="form-group">
				<label for="diagnistico">Diagnóstico:</label> <input type="text"
					class="form-control" id="diagnostico" placeholder="Entre com o sue diagnóstico"
					name="diagnostico">
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>