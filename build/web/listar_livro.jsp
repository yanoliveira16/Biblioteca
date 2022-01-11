<%-- 
    Document   : listar_menu
    Created on : 20/08/2019, 16:31:21
    Author     : Administrador
--%>

<%@page import="modelo.livroDAO"%>
<%@page import="modelo.livro"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<%
ArrayList<livro> lista = new ArrayList<livro>();
try{
   livroDAO lDAO = new livroDAO();
   lista = lDAO.listar();
}catch(Exception e){
    out.print("Erro:"+e);
}
%>


<html>
    <head>
         <meta name="viewport" content="width=device-width, initial-scale=1">
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
         <body>
        <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span>
            <input name="consulta" id="txt_consulta" placeholder="Consultar" type="text" class="form-control">
        </div>
        
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript">
            function excluir(Titulo,id){
                if(confirm("Tem certeza que deseja excluir o Livro:"+Titulo+"?")){
                    window.open("excluir_livro.do?id="+id,"_self");
                }
            }
        </script>
         
    </head>
 
	<title>Biblioteca</title>
	<script src="https://code.jquery.com/jquery-3.1.1.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.quicksearch/2.3.1/jquery.quicksearch.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
      
<style>
    th{
        background:black;
        color:white;
        font-size:20px;
        text-align:center;
    }
</style>
       <body>
       <center>
        <h1>Lista de livros<a  class="login100-form-btn" href="inserir_livro.jsp"><img src="imagens/novo.png"/>Inserir novo livro</a></h1>
        <table id="tabela" class="table table-hover" border="3px">
            </center>
            <center>
                <thead>   
            <tr>
                <th>Prateleira_Numero</th>
                <th>Título</th>
                <th>Ano</th>
                <th>Editora</th>
                <th>Edição</th>
                <th>ISBN_RDA</th>
                <th>Descrição</th>
                <th>Turma</th>
                <th>Opções</th>
            </tr>
             </thead> 
            <%
            for(livro l:lista){
            %>
            <tbody>
            <tr>
                <td><%=l.getPrateleira_Numero() %></td>
                <td><%=l.getTitulo()%></td>
                <td><%=l.getAno()%></td>
                <td><%=l.getEditora()%></td>
                <td><%=l.getEdicao()%></td>
                <td><%=l.getISBN_RDA()%></td>
                <td><%=l.getDescricao()%></td>
                <td><%=l.getTurma()%></td>
                     </center>
                <td><a class="login100-form-btn" href="alterar_livro.jsp?id=<%=l.getId() %>"><img src="imagens/alterar.png"/>Alterar</a> <a class="login100-form-btn" href="#" onclick="excluir('<%=l.getTitulo()%>',<%=l.getId() %>)"><img src="imagens/excluir.png"/>Excluir</a></td>
        
        </tr>      
         </tbody>  
            <%    
            } 
            %>   
        </table>
        
         <script>
            $('input#txt_consulta').quicksearch('table#tabela tbody tr');
        </script>
 </div>
 </div>

    </body>
</html>
