<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link type="text/css" rel="stylesheet" href="css/font-awesome.min.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>    
        <!--<link href="resources/Css/stiloVeiculo.css" rel="stylesheet" type="text/css"/> css stiloVeiculo-->
        <title>MARWVEL</title>

        <%@ include file = "links.jsp" %>   
    </head>
    <body>
        <%@include file = "navFuncionario.jsp" %> <!--menu-->       

        <div>
            <!--</div>-->
            <div class="conteudo">

                <div  class="container">

                    <!--table boostrap-->

                    <div class="container">
                        <h1 class="page-header">Veiculos</h1>
                        <a href="mainControll?action=PGcadastrarVeiculo" data-toggle="tooltip" title="Adicionar novo registro" type="button" class="btn btn-primary"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Adicionar</a>
                        <div class="table-responsive">
                            <table class="table table-bordered table-striped">		      
                                <thead>
                                    <tr>
                                        <th class="text-center">#</th>
                                        <th>codigo</th>
                                        <th>categoria</th>
                                        <th>marca</th>	        
                                        <th>modelo</th>
                                        <th>ano_fabricacao</th>
                                        <th>placa</th>
                                        <th>chassi</th>
                                        <th>motor</th>
                                        <th>porta</th>
                                        <th>passageiro</th>
                                        <th>valor_franquia</th>	        
                                        <th>status</th>	        
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${veiculos}" var="veiculo">
                                        <tr>        
                                            <td>
                                                <a title="Remover Registro" class="btn btn-danger" href="ListaVeiculoCommand?action=delet&codigo=<c:out value="${veiculo.codigo}"/>"><span class="glyphicon glyphicon-remove"/></a>
                                                <a title="Editar Registro" class="btn btn-warning" href="ListaVeiculoCommand?action=edit&codigo=<c:out value="${veiculo.codigo}"/>"><span class="glyphicon glyphicon-edit"/></a>
                                            </td>
                                            <td><c:out value="${veiculo.codigo}" /></td>
                                            <td><c:out value="${veiculo.categoria.nome}" /></td>
                                            <td><c:out value="${veiculo.marca.nome}" /></td>                                      
                                            <td><c:out value="${veiculo.modelo.nome}" /></td>                                            
                                            <td><c:out value="${veiculo.anoFabricacao}" /></td>                                      
                                            <td><c:out value="${veiculo.placa}" /></td>                                      
                                            <td><c:out value="${veiculo.chassi}" /></td> 
                                            <td><c:out value="${veiculo.motor}" /></td>
                                            <td><c:out value="${veiculo.porta}" /></td>
                                            <td><c:out value="${veiculo.passageiro}" /></td>
                                            <td><c:out value="${veiculo.valorFranquia}" /></td>                                      
                                            <td><c:out value="${veiculo.status}" /></td>                                      
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

        <%@include file="rodape.jsp" %>

    </body>

    <script src="js/jquery.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</html>


