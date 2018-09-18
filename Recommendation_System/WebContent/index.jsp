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
<%
	ArrayList<String> lista = new ArrayList<String>();

	lista.add(" Uma estante de livros para que você consiga fazer a leitura dos mesmo de forma bem clara ");
	lista.add(" Uma cadeira altamente confortável com o estampado em azul, perfeito para o momento de lazer");
	lista.add(
			" A cadeira branca para ambientes externos, pode harmonizar perfeitamente para uma chicará de chá ou um copo de suco");
	lista.add(" A estante para a sala. Em tons de marrom e beje");
	lista.add(" A cama beliche em tom de beje e marrom claro");
	lista.add(" A estante em tom de marrom e preto, com madeira rústica ");
	lista.add(" A mesa branca com beje, também disponivel no tom preto com azul");
%>
<body>
	<header>
		<div class="header">
			<div class="row">
				<div class="col-lg-12 text-center">
					<a href=""><h1>Avaliação de Notas</h1></a>
				</div>
			</div>
		</div>
	</header>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<fieldset>
					<legend>Formulário de cadastro de livros</legend>
					<form action="Processa" id="FormularioIndices" method="GET">
						
						<div class="list-group">
							<%
								for (int i = 0; i < 7; i++) {
							%>
							<a
								class="list-group-item list-group-item-action flex-column align-items-start">
								<div class="d-flex w-100 justify-content-between">
									<h5 class="mb-1"><%=(i + 1)%>º Movel
									</h5>
								</div>
								<div class="row">
									<div class="col-md-2">
										<img src="moveis/movel<%=(i + 1)%>.png" class="img-fluid"
											alt="Responsive image">
									</div>
									<div class="col-md-10">
										<div class="row">
											<p>
												<%=lista.get(i)%>
											</p>
											<input type="value" name="movel_<%=i%>" class="form-control"
												placeholder="Insira um valor">
										</div>
									</div>
								</div>
							</a>
							<%
								}
							%>
							
							<button id="submitbtn1" class="btn btn-success " type="button"
							name="button">Click Para Enviar</button>
						</div>

						

						<div class="row" id="final" style="display: none">
							<div class="col-md-12">
								<a
									class="list-group-item list-group-item-action flex-column align-items-start">
									<div class="d-flex w-100 justify-content-between">
										<h5 class="mb-1">Movel final</h5>
									</div>
									<div class="row">
										<div class="col-md-2">
											<img src="moveis/final.png" class="img-fluid"
												alt="Responsive image">
										</div>
										<div class="col-md-10">
											<div class="row" id="ResultadoFinalDiv">
												<p>Por favor, insira o valor do ultimo carro. Para que a
													gente possa tentar prever a sua nota, comparada com outros
													usuários</p>
												<input id="showFinalResult" name="movel_7" type="value"
													required class="form-control" placeholder="Insira um valor">
											</div>
										</div>
									</div>
									<hr>
									<div class="row">
									<input class="form-control" type="text" name="nomeUsuario" placeholder="Insira o seu nome">
										<input type="submit" class="btn btn-success"
											name="submitButton" value="Click Para Enviar">
									</div>
								</a>
							</div>
						</div>

					</form>
				</fieldset>
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
	<script>
		$('#submitbtn1').click(function(event) {
			event.preventDefault();
			$(".list-group").css("display", 'none');
			$('#final').css("margin", '100px').css("display", 'block');
		});
	</script>
</body>
</html>