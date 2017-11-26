<%-- 
    Document   : navFuncionarios
    Created on : 23/11/2017, 23:21:21
    Author     : EDSON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid" style="background-color: #EDA62E;">
                <div class="navbar-header">
                    <a class="navbar-brand" href="home.jsp" style="color:white;">MARWVEL</a>
                </div>
                <ul class="nav navbar-nav navbar-right" style="background-color: #EDA62E;">
                    <li class="dropdown" style="background-color: #EDA62E;">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="color:white; background-color: #EDA62E;">Veiculos
                        <span class="caret"></span></a>
                        <ul class="dropdown-menu" style="background-color: #EDA62E;">
                            <li><a href="mainControll?action=PGcadastrarVeiculo" style="color:white; background-color: #EDA62E;">Cadastrar</a></li>
                            <li><a href="mainControll?action=ListarVeiculos" style="color:white; background-color: #EDA62E;">Listas</a></li>
                        </ul>
                    </li>
                    <li class="dropdown" style="background-color: #EDA62E;">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="color:white; background-color: #EDA62E;">Funcionarios
                        <span class="caret"></span></a>
                        <ul class="dropdown-menu" style="background-color: #EDA62E;">
                            <li><a href="mainControll?action=PGcadastrarFuncionario" style="color:white; background-color: #EDA62E;">Cadastrar</a></li>
                            <li><a href="mainControll?action=ListarFuncionarios" style="color:white; background-color: #EDA62E;">Listas</a></li>
                        </ul>
                    </li>
                    <li class="dropdown" style="background-color: #EDA62E;">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="color:white; background-color: #EDA62E;">Clientes
                        <span class="caret"></span></a>
                        <ul class="dropdown-menu" style="background-color: #EDA62E;">
                            <li><a href="mainControll?action=PGcadastrarCliente" style="color:white; background-color: #EDA62E;">Cadastrar</a></li>
                            <li><a href="mainControll?action=ListarClientes" style="color:white; background-color: #EDA62E;">Listas</a></li>
                        </ul>
                    </li>
                    <li class="dropdown" style="background-color: #EDA62E;">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="color:white; background-color: #EDA62E;"> Marcas
                        <span class="caret"></span></a>
                        <ul class="dropdown-menu" style="background-color: #EDA62E;">
                            <li><a href="mainControll?action=PGcadastrarMarca" style="color:white; background-color: #EDA62E;">Cadastrar</a></li>
                            <li><a href="mainControll?action=ListarMarcas" style="color:white; background-color: #EDA62E;">Listas</a></li>
                        </ul>
                    </li>
                    <li class="dropdown" style="background-color: #EDA62E;">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="color:white; background-color: #EDA62E;">Modelos
                        <span class="caret"></span></a>
                        <ul class="dropdown-menu" style="background-color: #EDA62E;">
                            <li><a href="mainControll?action=PGcadastrarModelo" style="color:white; background-color: #EDA62E;">Cadastrar</a></li>
                            <li><a href="mainControll?action=ListarModelos" style="color:white; background-color: #EDA62E;">Listas</a></li>
                        </ul>
                    </li>
                    <li><a href="#" style="color:white;"><span class="glyphicon glyphicon-calendar" style="color:white;"></span> Reservas</a></li>
                    <li><a href="#" style="color:white; background-color: #EDA62E;"><span class="glyphicon glyphicon-list-alt" style="color:white;"></span> Ocorrências</a></li>
                    <li><a href="#" style="color:white; background-color: #EDA62E;"><span class="glyphicon glyphicon-user" style="color:white;"></span> Perfil</a></li>
                </ul>
            </div>
        </nav>
    </body>
</html>
