<%-- 
    Document   : cadastrCliente
    Created on : 17/11/2017, 20:25:19
    Author     : EDSON
--%>

<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
         <%@ include file = "links.jsp" %>   
    </head>
<body>
        <%@ include file = "navFuncionario.jsp" %>

    <div  class="container">

       <h3 style="color:black; margin-top:20px;">  CADASTRO CLIENTE </h3> 

        <form id="cpf_form" method="POST"  data-toggle="validator"  action='mainControll?action=salvarCliente'>
             <div class="form-row"style="margin-top:30px;">        
                    <div class="col-5" style="display: ${1 == 2 ? 'block':'none'}">
                        <input class="form-control"
                            type="text"                                
                            id="example-text-input"
                            name="codigo"
                            value="${clienteTO.codigo}"
                         />
                    </div>   
            <div class="form-row cadastro" style="margin-top:30px;">
                <div class="form-group  col-md-6  has-feedback " >
                    <label>Cpf</label>                           
                        <input type="text"
                               class="form-control"
                               name="cpf"
                               placeholder="000.000.000 - 00"
                               required
                               maxlength="14"
                               onkeypress=" return formatar('###.###.###-##', this);"
                               value="<c:out value="${clienteTO.cpf}" />"
                        />
                </div>                    
                <div class="form-group col-md-6 has-feedback">
                    <label for="inputPassword4">Senha*</label>
                        <input type="password"
                               class="form-control"
                               id="inputPassword4"
                               placeholder="***********"
                               required="true"
                               name="senha"
                               maxlength="20"
                               value="<c:out value="${clienteTO.senha}" />" 
                    /> 
                </div>
                <div class="form-group col-md-12 has-feedback" >
                    <label for="inputAddress">Nome Completo*</label>
                        <input  type="text"
                                class="form-control"
                                id="" placeholder=""
                                required="true" 
                                name="nome" 
                                 maxlength="200"
                                value="<c:out value="${clienteTO.nome}" />"
                        /> 
                </div>
               <div class="form-group col-md-5 has-feedback">
                    <label for="inputAddress2">Cnh*</label>
                        <input type="text"
                               class="form-control"
                               id="cnh"
                               placeholder="00000 - 000"
                               required="true"
                               name="cnh"
                               maxlength="30"
                               value="<c:out value="${clienteTO.cnh}" />" 
                        /> 
                </div>   
                <div class="form-group col-md-4 has-feedback">
                    <label for="inputAddress2">Email*</label>
                        <input type="email"
                               class="form-control"
                               id="inputAddress2"
                               placeholder="email@email.com"
                                name="email"
                                 maxlength="30"
                                value="<c:out value="${clienteTO.email}" />"
                                data-error="Por favor, informe um e-mail correto."  
                                required 
                        /> 
                </div>
                <div class="form-group col-md-3 has-feedback">
                    <label for="inputAddress2">Data de Nascimento*</label>
                        <input type="date" 
                               class="form-control"
                               id="inputAddress2" 
                               placeholder="DD/MM/AAAA"
                               required
                               name="data"
                                maxlength="10"
                               value="<c:out value="${clienteTO.dt_nascimento}" />"
                        /> 
                </div> 
                <div class="form-group col-md-12 has-feedback">
                    <label for="inputAddress">Endereço*</label>
                        <input type="text"
                               class="form-control"
                               id="inputAddress"
                               placeholder="Rua 123, 45, Setor, Cidade, Estado"
                               required  
                               name="endereco" 
                                maxlength="200"
                               value="<c:out value="${clienteTO.endereco}" />" 
                        />  
                </div>
                <div class="form-group col-md-4 has-feedback">
                    <label for="inputAddress90">CEP*</label>
                        <input type="number"
                               class="form-control"
                               id="inputAddress90"
                               placeholder="00000 - 000"
                               required="true"
                               name="cep"
                               maxlength="14"
                               value="<c:out value="${clienteTO.cep}" />" 
                        /> 
                </div>
                <div class="form-group col-md-4 has-feedback">
                    <label for="inputAddress2">Telefone*</label>                      
                        <input type="text"
                               class="form-control"
                               id="inputAddress2"
                               placeholder="00-0-0000-0000"
                               required
                               name="telefone"
                                maxlength="20"
                               value="<c:out value="${clienteTO.telefone}" />"
                        /> 
                </div>              

                <c:if test="${ClienteTO.status eq null}">
                    <div class=" form-group col-md-3 has-feedback ">
                        <label for="inputCity">Status*</label>
                        <br>
                        <label   class="form-check-label" >
                            <input  required
                                    class="form-check-input" 
                                    type="radio" 
                                    name="status"                                      
                                    value="<c:out value="a" />"
                            /> Ativo
                        </label>
                            <label class="form-check-label" style="margin-left:50px">
                                <input class="form-check-input"
                                       type="radio" 
                                       style="margin-top:25px; margin-left:15px;"
                                       name="status"                                      
                                       value="<c:out value="d" />"
                                /> Inativo
                            </label>
                    </div>
                </c:if>
                <c:if test="${ClienteTO.status eq false}">
                    <div class=" form-group col-md-3 has-feedback ">
                        <label for="inputCity">Status*</label>
                        <br>
                        <label class="form-check-label" >
                            <input class="form-check-input"
                                   type="radio" 
                                   required
                                   name="status"                                     
                                   value="<c:out value="a" />"
                            /> Ativo
                        </label>
                        <label class="form-check-label" style="margin-left:50px">
                            <input class="form-check-input"
                                   type="radio" 
                                   style="margin-top:25px; margin-left:15px;"
                                   name="status"
                                   checked="true"                                   
                                   value="<c:out value="d" />"
                            /> Inativo
                        </label>
                    </div>     
                </c:if>
                <c:if test="${ClienteTO.status eq true }">
                    <div class=" form-group col-md-3 has-feedback ">
                        <label for="inputCity">Status*</label>
                        <br>
                        <label class="form-check-label" >
                            <input class="form-check-input"
                                   type="radio" 
                                   required
                                   name="status"
                                   checked="true"                                 
                                   value="<c:out value="a" />"
                            /> Ativo
                            </label>
                                <label class="form-check-label" style="margin-left:50px">
                                    <input class="form-check-input" 
                                           type="radio" 
                                           style="margin-top:25px; margin-left:15px;"
                                           name="status"                                           
                                           value="<c:out value="d" />"
                                    /> Inativo
                                </label>
                    </div>   
                </c:if>                 
                          
                <div class="form-row col-md-8" > 
                    <label for="inputAddress2">* Ítens obrigatórios</label>
                </div> 
                <div class="form-group col-md-6">
                    <button type="submit" class="btn btn-success ">Enviar</button>
                </div> 
            </div>    
              </div>    
        </form>
    </div><!-- /.container-fluid -->
        <script>

            $(document).ready(function () {

                $('#cpf_form').bootstrapValidator({
                   
                    fields: {
                        cpf: {
                            validators: {
                                callback: {
                                    message: 'Cpf Invalido ! Digite Corretamente',
                                    invalid: 'glyphicon glyphicon-remove',
                                    callback: function (value) {
                                        return validacpf(value);
                                    }
                                }
                            }
                        }
                    }
                });
            });
        </script>

    </body>
</html>


