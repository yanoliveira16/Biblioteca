<%-- 
    Document   : form_alterar_menu
    Created on : 20/08/2019, 14:41:31
    Author     : Administrador
--%>

<%@page import="modelo.livroDAO"%>
<%@page import="modelo.livro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    livro lv = new livro();
    try{
        int id = Integer.parseInt(request.getParameter("id"));
        livroDAO lDAO = new livroDAO();
        lv = lDAO.carregarPorId(id);
    }catch(Exception e){
        out.print("Erro:"+e);
    }
    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <title>Editar Menu</title>
    </head>
    <body>
          <link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">

            <style>
                 input  {
                  text-align: center;
                  width: 150px;
                  font-size: 15px;

                }

    th{
        background:black;
        color:white;
        font-size:20px;

    }
</style>
      


 
     <center>
        <h1>Editar Livro</h1>
        <form name="alterar_livro" action="alterar_livro.do" method="post">
            ID:<%=lv.getId() %><br/>
            <input type="hidden" value="<%=lv.getId() %>" name="id"/>
            <table border="3px" text-align="center">
                <tr>
    <th> Prateleira_Número: <input type="text" name="Prateleira_Numero" value="<%=lv.getPrateleira_Numero() %>" size="30" /></th>
    <th> Título: <input type="text" name="Titulo" value="<%=lv.getTitulo()%>" size="30" /> </th>  
    <th> Ano  <input type="text" name="Ano" value="<%=lv.getAno()%>" size="30" /> </th>
    <th> Editora:  <input type="text" name="Editora" value="<%=lv.getEditora()%>" size="30" /> </th>
    <th> Edição  <input type="text" name="Edicao" value="<%=lv.getEdicao()%>" size="30" /> </th>
    <th> ISBN_RDA <input type="text" name="ISBN_RDA" value="<%=lv.getISBN_RDA()%>" size="30" /> </th>
    <th> Descrição: <input type="text" name="Descricao" value="<%=lv.getDescricao()%>" size="30" />  </th>
    <th> Turma: <input type="text" name="Turma" value="<%=lv.getTurma()%>" size="30" /> </th>
  
  </tr>
  <tr>
<td colspan="4"> <a class="login100-form-btn" href="listar_livro.jsp?">Voltar</a></td>
  <td colspan="4" > <center> <input class="login100-form-btn" type="submit" value="Salvar"/> </center> </td>


          </tr>
            </table>
        </form>
   
            </center>

    </body>
</html>
