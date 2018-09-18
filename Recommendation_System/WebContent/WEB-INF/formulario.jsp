<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de livro</title>
</head>
<body>
 
     <fieldset>
         <legend>Formulário de cadastro de livros</legend>
         <form action="Processa">
   <label>Livro</label>
         <input type="text" name="nome" />
   <label>Autor</label>
   <input type="text" name="autor" />
   <label>ISBN</label>
   <input type="text" name="isbn" />
   <label>Valor</label>
   <input type="number" step="0.01" name="valor" />
   <label>Data da compra</label>
         <input type="date" name="data" />
   <button>Cadastrar</button>
   </form>
     </fieldset>
 
</body>
</html>