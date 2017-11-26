<%-- 
    Document   : cadastroFuncionario
    Created on : 17/11/2017, 17:44:37
    Author     : EDSON
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DCTYPE html>

<html lang="pt">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Cadastro de Funcionarios</title>
    <!-- Bootstrap CSS -->
      <%@ include file = "links.jsp" %>   
    
</head>
    <body> 
        <%@ include file = "navFuncionario.jsp" %>   
      
    <div class="container">
          
        <h3 style="color:black; margin-top:20px;">  CADASTRO FUNCIONÁRIO </h3> 
       
        <form  id="cpf_form" method="POST"  action='mainControll?action=salvarFuncionario' data-toggle="validator" >
            <div class="form-row" style="margin-top:30px;">
                
                <div class="form-row"style="margin-top:30px;">        
                    <div class="col-5" style="display: ${1 == 2 ? 'block':'none'}">
                        <input class="form-control"
                            type="text"                                
                            id="example-text-input"
                            name="codigo"
                            value="${funcionarioTO.matricula}"
                         />
                    </div>   
                    <div class="form-group col-md-6  has-feedback">
                        <label for="inputMatricula">Cpf*</label>
                         <input type="text"
                               class="form-control"
                               name="cpf"
                               placeholder="000.000.000-00"
                               required
                               maxlength="14"
                               onkeypress=" return formatar('###.###.###-##', this);"
                               value="<c:out value="${funcionarioTO.cpf}" />"
                        />         
                    </div>
                    <div class="form-group col-md-6  has-feedback">
                        <label for="inputPassword">Senha*</label>
                        <input type="password" 
                             class="form-control" 
                             id="inputPassword4"
                             placeholder="***********"  
                             name="senha" 
                             required   
                             maxlength="14"
                             value="<c:out value="${funcionarioTO.senha}" />"
                        />
                    </div>           
                    <div class="form-group col-md-12 has-feedback" >
                        <label for="inputNome">Nome Completo*</label>        
                        <input type="text" 
                           class="form-control"
                           id="inputNome"
                           placeholder=""
                           required  
                           name="nome" 
                            maxlength="200"
                           value="<c:out value="${funcionarioTO.nome}" />"
                        />
                    </div>         
                    <div class="form-row col-md-12"> 
                        <label for="inputItensObg">* Ítens obrigatórios</label>
                    </div>
                    <br> 
                    <div class="form-group col-md-12 has-feedback" >
                        <button type="submit" class="btn btn-success ">SALVAR</button>
                    </div>
                </div>
            </div>
        </form>      
    </div>
     <script>
        
$(document).ready(function() {
   
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