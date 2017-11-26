<%-- 
    Document   : cadastroModelo
    Created on : 23/11/2017, 20:32:31
    Author     : EDSON
--%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>



<!DOCTYPE html>

<%@ include file = "links.jsp" %>   
<!-- Latest compiled and minified CSS -->


<!-- jQuery library -->


<!-- Latest compiled JavaScript   hover:#B57407; -->


</head>

<body>
    <%@ include file = "navFuncionario.jsp" %>  

    <div class="container" style="margin-top:50px; width:400px">
        <form id="form" method="POST"  data-toggle="validator"  action='mainControll?action=salvarModelo'>

            <div class="form-row"style="margin-top:30px;">        
                <div class="col-5" style="display: ${1 == 2 ? 'block':'none'}">
                    <input class="form-control"
                           type="text"                                
                           id="example-text-input"
                           name="codigo"
                           value="${modelo.codigo}"
                           />
                </div> 
                <div class="form-group" style="margin-left:80px;">
                    <img src="images/noImage.png" class="rounded float-left" alt="..." style="width:180px; height:140px; margin-bottom:20px;">
                    <input id="input-b5"
                           name="input-b5[]" 
                           type="file"
                           value="<c:out value="${modelo.imagen}" />"
                           >
                    <script>
                        $(document).on('ready', function () {
                            $("#input-b5").fileinput({showCaption: false});
                        });
                    </script>
                </div>
                <div class="form-group">
                    <label for="nome">Marca</label>
                    <select id="inputState"
                            class="form-control"
                            name="codigoMarca">
                        <option selected>Selecionar...</option>                  
                        <c:forEach items="${marcas}" var="marca">
                            <option value="<c:out value="${marca.codigo}"/>" 
                                    ${marca.codigo == modeloTO.marcaTO.codigo ? 'selected' : ''}>
                                <c:out value="${marca.nome}"/>
                            </option >
                        </c:forEach>
                    </select>
                </div>
                           
                <div class="form-group">
                    <label for="nome">Modelo</label>
                    <input type="text"
                           class="form-control" 
                           id="nome"
                           required
                           name="nome"                             
                           value="<c:out value="${modelo.nome}" />"
                           />
                </div>
                <button type="submit" class="btn btn-success btn-block">SALVAR</button>
            </div>
        </form>
    </div>
    <script>

        $(document).ready(function () {

            $('#form').bootstrapValidator({

                fields: {
                    cpf: {
                        validators: {
                            callback: {
                                message: 'Cpf Invalido ! Digite Corretamente',
                                invalid: 'glyphicon glyphicon-remove'

                            }
                        }
                    }
                }
            });
        });
    </script>


</body>
