<%-- 
    Document   : cadastroVeiculo
    Created on : 18/11/2017, 20:52:35
    Author     : EDSON
--%>


<!DOCTYPE html>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html lang="pt">
    <head>
        <!-- Required meta tags -->
        <title>CADASTRO VEICULO</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS -->
        <link href="resources/Css/stiloVeiculo.css" rel="stylesheet" type="text/css"/>

        <%@ include file = "links.jsp" %>   
    </head>
    <body> 

        <%@include file = "navFuncionario.jsp" %>
        
        <div class="container">            
            <form  id="form" method="POST" action='mainControll?action=salvarVeiculo'  data-toggle="validator" >

                <div class="row"><br></div>                
                <h1 class="page-header">Cadastro de Veiculo</h1>
                <div class="row"><br></div>
                <!----- aqui comeca  a div que pega os dados do veiculo  -----> 

                <div class="row">             
                    <div class="col-md-2" style="display: ${1 == 2 ? 'block':'none'}">
                        <div class="form-group">
                            <label for="codigo">Codigo</label>
                            <input type="text" class="form-control" id="codigo" readonly="readonly"
                                   name="codigo"  value="<c:out value="${veiculo.codigo}" />" />
                        </div>
                    </div>
                </div>
                <div class="row">             
                    <div class="col-md-4">
                        <div class="form-group">
                            <label for="marca">Marca</label>
                            <select  name="marca" class="form-control">
                                <option value="" value='selected'>Selecione</option>
                                <c:forEach items="${marcas}" var="marca">
                                    <option value="<c:out value="${marcaTO.codigo}"/>" 
                                            ${marca.codigo ==  veiculo.marca.codigo ? 'selected' : ''}>
                                        <c:out value="${marca.nome}"/>
                                    </option >
                                </c:forEach>
                            </select>
                        </div>
                    </div>           
                    <div class="form-group col-md-4 has-feedback">
                        <label for="modelo">Modelo</label>
                        <select  name="modelo" class="form-control">
                            <option value="" value='selected'>Selecione...</option>
                            <c:forEach items="${modelos}" var="modelo">
                                <option value="<c:out value="${modelo.codigo}"/>" 
                                        ${modelo.codigo ==  veiculo.modelo.codigo ? 'selected' : ''}>
                                    <c:out value="${modelo.nome}"/>
                                </option >
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group col-md-4 has-feedback">
                        <label for="categoria">Categoria</label>
                        <select  name="categoria" class="form-control">
                            <option value="" value='selected'>Selecione...</option>
                            <c:forEach items="${categorias}" var="categoria">
                                <option value="<c:out value="${categoria.codigo}"/>" 
                                        ${categoria.codigo ==  veiculo.categoria.codigo ? 'selected' : ''}>
                                    <c:out value="${categoria.nome}"/>
                                </option >
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="row"> 
                    <div class="col-md-2 has-feedback">
                        <div class="form-group has-feedback">
                            <label for="anoFabricacao">Ano de Fabricação</label>
                            <input class="form-control" type="text" maxlength="4" onkeypress='return event.charCode >= 48 && event.charCode <= 57' placeholder="Digite o ano"
                                   name="anoFabricacao"  value="<c:out value="${veiculo.anoFabricacao}" />" />
                        </div>
                    </div>  
                    <div class="col-md-2 has-feedback">
                        <div class="form-group has-feedback">
                            <label>Placa*</label>
                            <input type="text" class="form-control" id="nome" placeholder="ABC-1234"
                                   name="nome"  value="<c:out value="${veiculo.placa}" />" />
                        </div>
                    </div>   
                    <div class="col-md-4 has-feedback">
                        <div class="form-group has-feedback">
                            <label>Chassi*</label>
                            <input type="text" class="form-control" id="chassi" placeholder="Digite o chassi"
                                   name="chassi"  value="<c:out value="${veiculo.chassi}" />" />
                        </div>

                    </div>

                    <div class="col-md-2 has-feedback">
                        <div class="form-group has-feedback">
                            <label for="exampleInputEmail1">Motor</label>
                            <select  name="tipo" class="form-control">
                                <option value="#" value='selected'>Selecione...</option>
                                <option value="1.0" ${veiculo.motor == '1.0' ? 'selected' : ''}>1.0</option>
                                <option value="1.4" ${veiculo.motor == '1.4' ? 'selected' : ''}>1.4</option>
                                <option value="1.5" ${veiculo.motor == '1.5' ? 'selected' : ''}>1.5</option>
                                <option value="1.6" ${veiculo.motor == '1.6' ? 'selected' : ''}>1.6</option>
                                <option value="1.8" ${veiculo.motor == '1.8' ? 'selected' : ''}>1.8</option>
                                <option value="2.0" ${colecao.tipo == '2.0' ? 'selected' : ''}>2.0</option>                                
                            </select>
                        </div>
                    </div>
                    <div class="col-md-2 has-feedback">
                        <div class="form-group has-feedback">
                            <label for="exampleInputEmail1">Qtd. de Portas</label>
                            <select  name="tipo" class="form-control">
                                <option value="#" value='selected'>Selecione...</option>
                                <option value="2" ${veiculo.porta == '2' ? 'selected' : ''}>2</option>
                                <option value="4" ${veiculo.porta == '4' ? 'selected' : ''}>4</option>                           
                            </select>
                        </div>
                    </div>
                </div>
                <div class="row"> 

                    <div class="col-md-2 has-feedback">
                        <div class="form-group has-feedback">
                            <label for="passageiros">Passageiros</label>
                            <select  name="passageiros" class="form-control">
                                <option value="#" value='selected'>Selecione...</option>
                                <option value="1" ${veiculo.passageiros == '1' ? 'selected' : ''}>Ate 4</option>
                                <option value="2" ${veiculo.passageiros == '2' ? 'selected' : ''}>Mais que 4</option>                           
                            </select>
                        </div>
                    </div>
                    <div class="col-md-2 has-feedback">
                        <div class="form-group has-feedback">
                            <label for="valor">Valor</label>
                            <input type="text" class="form-control moeda" id="valor" placeholder="Digite o valor"
                                   name="valor"  value="<c:out value="${veiculo.valor}" />" />
                        </div>

                    </div>
                    <div class="col-md-2 has-feedback">
                        <div class="form-group has-feedback">
                            <label for="status">Status</label>
                            <select  name="status" class="form-control">
                                <option value="true" ${veiculo.status == 'true' ? 'selected' : ''}>Ativo</option>
                                <option value="false" ${veiculo.status == 'false' ? 'selected' : ''}>Bloqueado</option>
                            </select>
                        </div>
                    </div> 
                </div>
                <!--salta linhas-->                               
                <div class="row"><br></div>

                <!----- aqui acaba a div que pega os dados do veiculo  ----->

                <!----- aqui comeca  a div que pega os dados da caracteristica do veiculo  ----->

                <div class="panel panel-default" id="panel1">

                    <div class="panel-heading" id="panel2">Caracteristica Veiculo</div>
                    <div class="panel-body" id="painel5">


                        <!--<fieldset class="col-md-8">-->    	
                        <!--<legend >Caracteristicas</legend>-->

                        <div class="panel panel-default" id="panel3">
                            <div class="panel-body">                                
                                <!--começa os radios-->
                                <div class="row">  <!--inicio linha 1 radios-->                                
                                    <c:choose>
                                        <c:when test="${empty caracteristicaTO.codigo}">                               
                                            <div class="form-group col-md-2 "><br>
                                                <label class="form-check-label">
                                                    <input name="checkFreio" 
                                                           class="form-check-input"
                                                           type="checkbox" 
                                                           style="margin-top:20px; margin-left:0px;"
                                                           /> Freio ABS
                                                </label>
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input  checked="true" 
                                                            name="checkFreio" 
                                                            class="form-check-input"
                                                            type="checkbox" 
                                                            style="margin-top:20px; margin-left:0px;"
                                                            /> Freio ABS
                                                </label>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>

                                    <c:choose>
                                        <c:when test="${empty caracteristica.codigo}">                               
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input name="checkAirbag"
                                                           class="form-check-input"
                                                           type="checkbox" 
                                                           style="margin-top:20px; margin-left:0px;"
                                                           /> Airbag
                                                </label>
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input  checked="true"
                                                            name="checkAirbab" 
                                                            class="form-check-input" 
                                                            type="checkbox" 
                                                            style="margin-top:20px; margin-left:0px;"
                                                            /> Airbag
                                                </label>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                    <c:choose>
                                        <c:when test="${empty caracteristica.codigo}">                               
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input name="checkBanco" 
                                                           class="form-check-input" 
                                                           type="checkbox" 
                                                           style="margin-top:20px; margin-left:0px;"
                                                           /> Banco de Couro
                                                </label>
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input  checked="true"
                                                            name="checkBanco"
                                                            class="form-check-input"
                                                            type="checkbox" 
                                                            style="margin-top:20px; margin-left:0px;"
                                                            /> Banco de Couro
                                                </label>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                    <c:choose>
                                        <c:when test="${empty caracteristica.codigo}">                               
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input name="checkVidro"
                                                           class="form-check-input"
                                                           type="checkbox" 
                                                           style="margin-top:20px; margin-left:0px;"
                                                           /> Vidro Elétrico
                                                </label>
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input  checked="true" 
                                                            name="checkVidro" 
                                                            class="form-check-input" 
                                                            type="checkbox" style="margin-top:20px; margin-left:0px;"
                                                            /> Vidro Elétrico
                                                </label>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                    <c:choose>
                                        <c:when test="${empty caracteristica.codigo}">                               
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input name="checkDirecao
                                                           class="form-check-input" 
                                                           type="checkbox" 
                                                           style="margin-top:20px; margin-left:0px;"
                                                           /> Direção Hidráulica 
                                                </label>
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input  checked="true" 
                                                            name="checkDirecao"
                                                            class="form-check-input" 
                                                            type="checkbox"
                                                            style="margin-top:20px; margin-left:0px;"
                                                            /> Direção Hidráulica
                                                </label>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                    <c:choose>
                                        <c:when test="${empty caracteristica.codigo}">                               
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input name="checkAr" 
                                                           class="form-check-input" 
                                                           type="checkbox" 
                                                           style="margin-top:20px; margin-left:0px;"
                                                           />  Ar condicionado 
                                                </label>
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input  checked="true"
                                                            name="checkAr" 
                                                            class="form-check-input" 
                                                            type="checkbox" 
                                                            style="margin-top:20px; margin-left:0px;"
                                                            />  Ar condicionado 
                                                </label>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                </div> <!--fim da linha 1 radios-->

                                <div class="row">  <!--inicio linha 2 radios-->  
                                    <c:choose>
                                        <c:when test="${empty caracteristica.codigo}">                               
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input name="checkAr" 
                                                           class="form-check-input" 
                                                           type="checkbox" 
                                                           style="margin-top:20px; margin-left:0px;"
                                                           />  Travas Eletricas 
                                                </label>
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input  checked="true"
                                                            name="checkTE" 
                                                            class="form-check-input" 
                                                            type="checkbox" 
                                                            style="margin-top:20px; margin-left:0px;"
                                                            />  Travas Eletricas
                                                </label>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>
                                    <c:choose>
                                        <c:when test="${empty caracteristica.codigo}">                               
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input name="checkCambio"
                                                           class="form-check-input" 
                                                           type="checkBox" 
                                                           style="margin-top:20px; margin-left:0px;"
                                                           /> Câmbio Automático 
                                                </label>
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input  checked="true"
                                                            name="checkCambio" 
                                                            class="form-check-input" 
                                                            type="checkbox" 
                                                            style="margin-top:20px; margin-left:0px;"
                                                            /> Câmbio Automático 
                                                </label>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>

                                    <c:choose>
                                        <c:when test="${empty caracteristica.codigo}">                               
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input name="checkSom" 
                                                           class="form-check-input" 
                                                           type="checkbox" 
                                                           style="margin-top:20px; margin-left:0px;"
                                                           /> Som  
                                                </label>
                                            </div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="form-group col-md-2"><br>
                                                <label class="form-check-label">
                                                    <input  checked="true" 
                                                            name="checkSom" 
                                                            class="form-check-input"
                                                            type="checkbox" 
                                                            style="margin-top:20px; margin-left:0px;"
                                                            /> Som  
                                                </label>
                                            </div>
                                        </c:otherwise>
                                    </c:choose>  
                                </div>  <!--fim linha 2 radios-->                                
                                <!--fim dos radios-->
                            </div>
                        </div> <!--fim panel3-->     
                        <div class="clearfix"></div>                           
                    </div>
                </div>

                <!----- aqui acaba  a div que pega os dados da caracteristica do veiculo  -----> 
                <!--Botoes-->
                <div class="form-group col-md-12">
                    <!--<button type="submit" class="btn btn-dark">Enviar</button>-->
                    <div class="row"><br></div>
                    <div class="row"><br></div>
                    <div class="row"><br></div>
                    <!--botoes-->
                    <div class="row text-center">
                        <a href="home.jsp" class="btn btn-default" title="Voltar"><span class="glyphicon glyphicon-arrow-left"/> Voltar</a>
                        <button type="submit" class="btn btn-success" title="Salvar"><span class="glyphicon glyphicon-floppy-disk"/> Salvar</button>
                    </div>                    
                </div> 
                <!--Fim botoes-->
            </form>
        </div>
        <!--fim container-->
        <!--        chama script para adicionar mascara de moeda-->
        <script src="resources/js/jquery.maskMoney.min.js" type="text/javascript"></script>
        <script type="text/javascript">
                        $(".moeda").maskMoney({prefix: 'R$ ', allowNegative: true, thousands: '.', decimal: ',', affixesStay: false});
                        //$(".moeda").maskMoney({ formatOnBlur: true, reverse: true, prefix: '$', selectAllOnFocus: true, precision: 4, allowEmpty: true });
        </script>
        <script>

            $(document).ready(function () {

                $('#form').bootstrapValidator({

                    fields: {
                        cpf: {
                            validators: {
                                callback: {
                                    message: 'Preencha Corretamente '

                                }
                            }
                        }
                    }
                });
            });
        </script>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <%@include file="rodape.jsp" %>
    </body> 

</html>


