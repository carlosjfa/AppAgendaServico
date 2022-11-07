<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de Procedimentos</title>
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
		<h2>Procedimento</h2>
		<form action="/procedimento/incluir" method="post">
			<div class="form-group">
				<label for="tipo">Tipo:</label> <input type="text"
					class="form-control" id="tipo" placeholder="Entre com o seu tipo"
					name="tipo">
			</div>
			<div class="form-group">
				<label for="preventivo">Preventivo:</label> <input type="text"
					class="form-control" id="preventivo" placeholder="Entre com o preventivo"
					name="preventivo">
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