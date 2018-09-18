<%@page import="br.ufpr.dao.UserPredictDAO.GerenicObject"%>
<%@page import="br.ufpr.dao.UserPredictDAO"%>
<%@page import="br.ufpr.entidade.Nota"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	final String NomeSite = "Teste de Produçãos";
	System.out.println("Recarregando da página");
	UserPredictDAO notaDao = new UserPredictDAO();
%>
<html>
<head>
<title><%=NomeSite%></title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="header col-md-12 text-center">
				<h1><%=NomeSite%></h1>
			</div>
		</div>
		<div class="row">
			<table class="table table-dark">
				<thead>
					<tr>
						<th scope="col">#id</th>
						<th scope="col">Nome</th>
						<th scope="col">Produto</th>
						<th scope="col">Nota</th>
					</tr>
				</thead>
				<tbody>


				</tbody>
			</table>
		</div>
		<div class="row">
			<div class="col-md-6">
				<input type="text" class="form-control" name="CampoNovo"
					aria-describedby="Enserir novos Campos"
					placeholder="Insira o nome da pessoa">
			</div>
			<div class="col-md-6">
				<input type="text" class="form-control" name="CampoNovo"
					aria-describedby="Enserir novos Campos"
					placeholder="Insira o nome do Produto">
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">

				<input type="text" class="form-control" name="CampoNovo"
					aria-describedby="Enserir novos Campos"
					placeholder="A nota que você acha que ele merece">
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">

				<button type="submit" onclick="validar()" class="btn btn-warning"
					name="envio" value="Enviar">Prever</button>
			</div>
		</div>
	</div>

</body>
<script type="text/javascript">
	
</script>
<style>
body, html {
	background: #222;
}

input {
	margin: 5px;
	color: white;
}

.form-control {
	background-color: #222;
}

.form-control:focus, .form-control:active {
	background-color: #222;
	color: white;
}

.form-control::placeholder {
	color: #fff;
}

h1 {
	margin-top: 50px;
	color: white;
}

table{
	margin: 2%;
}
	

button {
	margin-top: 20px;
	width: 100%;
}
</style>

</html>
