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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Serviço</h2>
		<form action="/servico/incluir" method="post">
			<div class="form-group">
				<label for="codigo">Código:</label> <input type="text"
					class="form-control" id="codigo" placeholder="Entre com o seu código"
					name="codigo">
			</div>
			<div class="form-group">
				<label for="preco">Preço:</label> <input type="text"
					class="form-control" id="preco" placeholder="Entre com o seu preço"
					name="preco">
			</div>
			<div class="form-group">
				<label for="data">Data:</label> <input type="text"
					class="form-control" id="data" placeholder="Entre com a sua data"
					name="data">
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>