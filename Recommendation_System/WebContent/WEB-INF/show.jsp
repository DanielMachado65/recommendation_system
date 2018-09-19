<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Iniciação Cientifica</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" media="screen"
	href="css/style.css" />
</head>
<body>
	<%
		String nota_algoritmo = (String) request.getAttribute("nota_final_algoritmo");
	%>
	<%
		String nota_usuario = (String) request.getAttribute("nota_final_usuario");
	%>
	<header>
		<div class="header">
			<div class="row">
				<div class="col-lg-12 text-center">
					<a href="/Recommendation_System/"><h1>Avaliação de Notas</h1></a>
				</div>
			</div>
		</div>
	</header>
	<div class="container">
		<div class="row" id="final">
			<div class="col-md-2">
				<img alt="Imagem final" class="img-fluid" src="moveis/final.png">
			</div>

			<div class="col-md-5">
				<p class="wrapper_final">
					O valor que foi previsto pelo algoritmo: 
					<%=nota_algoritmo%>
				</p>
			</div>
			<div class="col-md-5">
				<p class="wrapper_final">
					O seu valor era:
					<%=nota_usuario%>
				</p>
			</div>

		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
</body>
</html>