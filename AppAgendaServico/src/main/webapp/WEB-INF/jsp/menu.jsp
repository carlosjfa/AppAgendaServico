<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="/">AppAgendaServi�o</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="/">Home</a></li>
			<c:if test="${not empty user}">
				<li class="nav-item"><a class="nav-link" href="/usuario/lista">Usu�rio</a>
				</li>
				<li class="nav-item"><a class="nav-link active"
					href="/paciente/lista">Paciente</a></li>
				<li class="nav-item"><a class="nav-link active"
					href="/consulta/lista">Consulta</a></li>
				<li class="nav-item"><a class="nav-link active"
					href="/servico/lista">Servi�o</a></li>
				<li class="nav-item"><a class="nav-link active"
					href="/procedimento/lista">Procedimento</a></li>
				<li class="nav-item"><a class="nav-link active"
					href="/restauracao/lista">Restaura��o</a></li>
				<li class="nav-item"><a class="nav-link active"
					href="/raiox/lista">RaioX</a></li>
			</c:if>

		</ul>
		<ul class="nav navbar-nav navbar-right">
			<c:if test="${empty user}">
				<li><a href="/usuario"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>

				<li><a href="/login"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</c:if>

			<c:if test="${not empty user}">
				<li><a href="/logout"><span
						class="glyphicon glyphicon-log-out"></span> Logout ${user.nome}</a></li>

			</c:if>
		</ul>
	</div>
</nav>