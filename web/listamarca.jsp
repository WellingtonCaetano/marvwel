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
        
    </head>
    <body>
        <%@include file="navFuncionario.jsp" %>
        <div>
            <!--</div>-->
            <div class="conteudo">

                <div  class="container">

                    <!--table boostrap-->

                    <div class="container">
                        <h1 class="page-header">Marcas Cadastradas </h1>
                        <a href="mainControll?action=PGcadastrarMarca" data-toggle="tooltip" title="Adicionar novo registro" type="button" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Adicionar</a>
                        <div class="table-responsive">
                            <table class="table table-bordered table-striped">		      
                                <thead>
                                    <tr>                                        

                                        <th class="text-center">#</th>
                                        <th>Codigo</th>                                     
                                        <th>Nome</th>                         
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${marcas}" var="marcaTO">
                                        <tr>        
                                            <td>
                                                <a title="Remover registro" class="btn btn-danger" href="mainControll?action=RemoveMarca&codigo=<c:out value="${marcaTO.codigo}"/>"><span class="glyphicon glyphicon-remove"/></a>
                                                <a title="Editar registro" class="btn btn-warning" href="mainControll?action=EditarMarca&codigo=<c:out value="${marcaTO.codigo}"/>"><span class="glyphicon glyphicon-edit"/></a>
                                            </td>
                                            <td><c:out value="${marcaTO.codigo}" /></td>                                          
                                            <td><c:out value="${marcaTO.nome}" /></td>                     
                                                          
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


