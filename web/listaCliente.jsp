<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link type="text/css" rel="stylesheet" href="css/font-awesome.min.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

          <%@ include file = "links.jsp" %>   
        <title>LISTA</title>
    </head>
    <body>
        <%@include file="navFuncionario.jsp" %>
        <div>
            <!--</div>-->
            <div class="conteudo">

                <div  class="container">

                    <!--table boostrap-->

                    <div class="container">
                        <h1 class="page-header">Clientes Cadastrados </h1>
                        <a href="mainControll?action=PGcadastrarCliente" data-toggle="tooltip" title="Adicionar novo registro" type="button" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Adicionar</a>
                        <div class="table-responsive">
                            <table class="table table-bordered table-striped">		      
                                <thead>
                                    <tr>                                        

                                        <th class="text-center">#</th>
                                        <th>Codigo</th>
                                        <th>Nome</th>
                                        <th>Cpf</th>     
                                        <th>Email</th>    
                                        <th>DataNascimento</th>    
                                        <th>Telefone</th>  
                                      
                                       
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${clientes}" var="clienteTO">
                                        <tr>        
                                            <td>
                                                <a title="Remover registro" class="btn btn-danger" href="mainControll?action=RemoveCliente&codigo=<c:out value="${clienteTO.codigo}"/>"><span class="glyphicon glyphicon-remove"/></a>
                                                <a title="Editar registro " class="btn btn-warning" href="mainControll?action=EditarCliente&codigo=<c:out value="${clienteTO.codigo}"/>"><span class="glyphicon glyphicon-edit"/></a>
                                            </td>
                                            <td><c:out value="${clienteTO.codigo}" /></td>                                           
                                            <td><c:out value="${clienteTO.nome}" /></td>
                                            <td><c:out value="${clienteTO.cpf}" /></td>
                                            <td><c:out value="${clienteTO.email}" /></td>
                                            <td><c:out value="${clienteTO.dt_nascimento}" /></td>
                                            <td><c:out value="${clienteTO.telefone}" /></td>    
                                             
                                           
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>

                </div>
                <!--Fim slydeShow-->
            </div>
        </div>
        <div class="rodape">
         
        </div>  

    </body>

   
</html>


