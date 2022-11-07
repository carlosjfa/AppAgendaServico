<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de Consultas</title>
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
		<h2>Consulta</h2>
		<form action="/consulta/incluir" method="post">
			<div class="form-group">
				<label for="data">Data:</label> <input type="text"
					class="form-control" id="data" placeholder="Entre com a sua data"
					name="data">
			</div>
			<div class="form-group">
				<label for="convenio">Convênio</label> <input type="text"
					class="form-control" id="convenio" placeholder="Entre com o seu convênio"
					name="convenio">
			</div>
			<div class="form-group">
				<label for="primeiraVez">Primeira Vez:</label> <input type="text"
					class="form-control" id="primairaVez" placeholder="Entre com a sua primeira vez"
					name="primairaVez">
			</div>
			<div class="form-group">
				<label for="retorno">Retorno:</label> <input type="text"
					class="form-control" id="retorno" placeholder="Entre com o seu retorno"
					name="retorno">
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>