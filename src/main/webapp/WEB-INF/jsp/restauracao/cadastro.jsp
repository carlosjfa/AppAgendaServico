<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de Restaurações</title>
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
		<h2>Restauração</h2>
		<form action="/restauracao/incluir" method="post">
		<div class="form-group">
				<label for="tipo">Código:</label> <input type="text"
					class="form-control" id="tipo" placeholder="Entre com o seu código"
					name="codigo">
			</div>
			
			<div class="form-group">
				<label for="tipo">Nome:</label> <input type="text"
					class="form-control" id="tipo" placeholder="Entre com o seu nome"
					name="nome">
			</div>
			
			<div class="form-group">
				<label for="codigoDente">Código do Dente:</label> <input type="text"
					class="form-control" id="codigoDente" placeholder="Entre com o seu código do dente"
					name="codigoDente">
			</div>
			
			<div class="form-group">
				<label for="materialUtilizado">Material Utilizado:</label> <input type="text"
					class="form-control" id="materialUtilizado" placeholder="Entre com o seu material utilizado"
					name="materialUtilizado">
			</div>
			<div class="form-group">
				<label for="anosGarantia">Anos de Garantia:</label> <input type="text"
					class="form-control" id="anosGarantia" placeholder="Entre com os anos de garantia"
					name="anosGarantia">
			</div>
			<div class="form-group">
				<label for="diagnistico">Preço:</label> <input type="text"
					class="form-control" id="preco" placeholder="Entre com o seu preço"
					name="preco">
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>