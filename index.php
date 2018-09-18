<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Iniciação Cientifica</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  <link rel="stylesheet" type="text/css" media="screen" href="style.css" />
</head>

<?php
  $array = array(
    1 => 'Sem a capacidade de adicionar mais dívida, Musk pode ter de recorrer a fontes de recurso que estão menos acostumadas a usar dívida para melhorar o retorno da maneira como as empresas de private equity estão.',
    2 => 'Quando um usuário do Twitter comentou sobre o acordo proposto por Musk escrevendo “Assim como fez a Dell. Isso evita muita dor de cabeça”, Musk respondeu tuitando “Sim”. O acordo para fechar capital da Dell, no entanto, talvez não possa ser replicado com a Tesla, que tem dívida de 10,9 bilhões de dólares, está perdendo dinheiro e cuja dívida é classificada como “junk” pelas agências de risco.',
    3 => '“A empresa tem fluxo de caixa negativo. Como você usa qualquer dívida de uma empresa que tem fluxo de caixa negativo?”, disse Steven Kaplan, um professor da Universidade de Chicago que pesquisa private equity. Encontrar parceiros de capital e financiamento bancário é crucial para acordos de fechamento de capital. Quando Michael Dell fechou o capital de sua fabricante de computadores por 24,9 bilhões de dólares em 2013, por exemplo, ele trouxe a empresa de aquisições Silver Lake que contribuiu com 1,4 bilhão de dólares em ativo, levantou mais de 10 bilhões de dólares em dívida bancária e recebeu um empréstimo de 2 bilhões de dólares da Microsoft.',
    4 => 'São Paulo – Os preços dos seguros dos carros mais vendidos do país podem partir de 1.442 reais, valor médio do seguro do Renault Kwid em Brasília, e podem chegar a até 5.697 reais, preço médio do seguro do Jeep Compass no Rio de Janeiro. Essas informações fazem parte de um levantamento realizado pela corretora de seguros online Minuto Seguros, que simulou os preços médios das apólices dos veículos líderes de venda para cinco capitais (São Paulo, Rio de Janeiro, Brasília, Belo Horizonte e Curitiba).',
    5 => 'Para fazer a simulação, foi considerado o perfil de cliente homem de 35 anos e casado. O valor da cobertura contra terceiros contratada seria de 100 mil reais e as cotações foram feitas nas seguintes seguradoras: Azul, Aliro, Allianz, Bradesco, HDI, Itaú, Liberty, Sompo Seguros, Mapfre, Mitsui, Porto Seguro, Tokio Marine e Sulamerica. informações sobre os carros mais vendidos são da Federação Nacional dos Fabricantes de Veículos Automotores (Fenabrave), referentes ao mês de julho de 2018. Confira abaixo os valores médios dos seguros dos carros mais vendidos do país.',
    6 => 'O presidente-executivo da Tesla, Elon Musk, acostumado a fazer tudo à sua maneira, está agora buscando uma reengenharia sobre como uma empresa pode fechar capital. Musk anunciou no Twitter na terça-feira que estava considerando fechar o capital da montadora de carros elétricos por 420 dólares a ação, ou 72 bilhões de dólares, no que seria o maior acordo desse tipo. Ele disse que o financiamento do acordo estava garantido, mas não forneceu detalhes.',
    7 => 'As ações da Tesla subiram 11 por cento na véspera, encerrando o pregão negociadas a 379,57 dólares, indicando que investidores deram algum crédito ao plano. No entanto, bancos de investimento e analistas reagiram com ceticismo, dizendo à Reuters que seria difícil para Musk, cuja fortuna segundo a Forbes é de 22 bilhões de dólares, captar o financiamento necessário em capital e dívida para o acordo, uma vez que a Tesla não está se tornando lucrativa.'
 );

$nextWeek = time() + (7 * 24 * 60 * 60);

?>

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
          <form id="FormularioIndices"  method="get">
                <div class="list-group">
                  <?php for ($i=0; $i < 7; $i++) { ?>
                  <a class="list-group-item list-group-item-action flex-column align-items-start">
                    <div class="d-flex w-100 justify-content-between">
                      <h5 class="mb-1"><?php echo $i; ?>º Carro</h5>
                      <small class="text-muted"><?php echo 'Agora: '. date('Y-m-d') ."\n"; ?></small>
                    </div>
                    <div class="row">
                      <div class="col-md-2">
                        <img src="carros/<?php echo 'carro'.($i+1).'.jpg' ?>" class="img-fluid" alt="Responsive image">
                      </div>
                      <div class="col-md-10">
                        <div class="row">
                          <p>
                            <?php echo $array[$i+1]; ?>
                          </p>
                          <input type="value"  name="<?php echo " carro ".$i; ?>" class="form-control" placeholder="Insira um valor">
                        </div>
                      </div>
                    </div>
                  </a>
                  <?php  } ?>
                </div>
              <input type="submit" class="btn btn-warning" name="submitButton" value="Click Para Enviar">
          </form>
          <div id="final" class="Result hidden">
            <div class="row">
              <div class="col-md-12">
                <a class="list-group-item list-group-item-action flex-column align-items-start">
                  <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1">Carro final</h5>
                  </div>
                  <div class="row">
                    <div class="col-md-2">
                      <img src="carros/final.png" class="img-fluid" alt="Responsive image">
                    </div>
                    <div class="col-md-10">
                      <div class="row" id="ResultadoFinalDiv">
                        <p> Por favor, insira o valor do ultimo carro. Para que a gente possa tentar prever a sua nota, comparada com outros usuários </p>
                        <input id="showFinalResult"type="value" required class="form-control" placeholder="Insira um valor">
                      </div>
                    </div>
                  </div>
                </a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <script>
      $('#FormularioIndices').submit(function(event){
        event.preventDefault();

        $('#FormularioIndices').addClass( "hidden");
        $('#final').removeClass( "hidden" ).addClass( "show").css("margin",'100px');
      });

      $("#showFinalResult").keypress(function(e) {
        if (e.which == 13 ) {
          let valor = $("#showFinalResult").val();
          if (isNaN(valor)) {
            alert('Insira um valor, por favor!');
          }else {
            $('#ResultadoFinalDiv').html("O valor que foi previsto pelo algoritmo: " + 4 + " | O seu valor: " + valor);
          }
        }
      });
    </script>
  </body>

</html>
