<%-- 
    Document   : form_inserir_menu
    Created on : 20/08/2019, 14:41:31
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
          <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Novo Livro</title>
    </head>
    <body>
       <link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.11/jquery.mask.min.js"></script>


<style>
    th{
        background: black;
        color: white;
        font-style: bold;
        font-size:20px;
        text-align:center;
    }
    input{
           text-align: center;
           width: 200px;
                  font-size: 15px;

</style>


 


    <center><h1>Novo Livro</h1>
            <table border="3px" text-align="center" display="center">
  <tr>
    <th> Prateleira_Numero </th>
    <th > Título: </th>
    <th> Ano: </th>
    <th> Editora: </th> 
    <th> ISBN_RDA : </th>
    <th> Edição: </th> 
    <th> Descrição: </th>
    <th> Turma: </th>
  </tr>
  <tr>
  <form  name="inserir_livro" action="inserir_livro.do" method="post">
  
    <td>  <input type="text" name="Prateleira_Numero" size="30"  required ></td>
    <td>  <input type="text" name="Titulo" size="30" required></td>
    <td>  <input  type="text" name="Ano" size="30" ></td>
    <td>  <input  type="text" name="Editora" size="30" ></td>
    <td>  <input  type="text" id="isbnrda" name="ISBN_RDA" size="30" required/> </td>
    <td>  <input  type="text" name="Edicao" size="30" ></td>
    <td>  <input type="text" name="Descricao" size="30" > </td>
    <td>  <input type="text" name="Turma" size="30" required> </td>
    <script>
jQuery(function($){
$("#isbnrda").mask("999.99.99.99999-,9");

});
</script>
    </tr>
  <tr>
      
        <td colspan="1"> <a class="login100-form-btn" href="listar_livro.jsp?">Voltar</a> </td>
        <td colspan="6"> </td>  
    <td colspan="1"> <input class="login100-form-input" type="submit" value="Salvar"/> </td>
  </form>
    
  </tr>

</table>
</center> 
    </body>
</html>
