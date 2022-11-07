<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastramento de Pacientes</title>
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
		<h2>Paciente</h2>
		<form action="/paciente/incluir" method="post">
			<div class="form-group">
				<label for="nome">Nome:</label> <input type="text"
					class="form-control" id="nome" placeholder="Entre com o seu nome"
					name="nome">
			</div>
			<div class="form-group">
				<label for="dataNascimento">Data de Nascimento</label> <input type="text"
					class="form-control" id="dataNascimento" placeholder="Entre com a sua data de nascimento"
					name="dataNascimento">
			</div>
			<div class="form-group">
				<label for="endereco">Endereco:</label> <input type="text"
					class="form-control" id="endereco" placeholder="Entre com o seu endereço"
					name="endereco">
			</div>
			<div class="form-group">
				<label for="telefone">Telefone:</label> <input type="text"
					class="form-control" id="telefone" placeholder="Entre com o seu telefone"
					name="telefone">
			</div>
			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>