<%-- 
    Document   : login
    Created on : 20/11/2017, 00:07:11
    Author     : EDSON
--%>

<!DOCTYPE html>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html lang="pt">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    
      <%@ include file = "links.jsp" %>   
  </head>
  <body> 
      
     <%@ include file = "navPadrao.jsp" %>   
      
      <div class="container" style="margin-top:40px; width:500px"> 
      
          <form  id="form"method="post"   data-toggle="validator" action="mainControll?action=loginAcesso">
           
        
           
           
           
          <div class="form-group" has-feedback id="loginForm" style="margin-top:20px">
            <label for="exampleInputEmail1" id="emailCodigoLbl">CPF</label>
            <input  required=""type="text" class="form-control" id="emailCOdigoPlaceholder"name="codigo" placeholder="Digite o CPF">
          </div>
          <div class="form-group has-feedback ">
            <label for="exampleInputPassword1">Senha</label>
            <input  required=""type="password" class="form-control" id="senha" name="senha" placeholder="******">
            <button type="button" class="btn btn-link" style="color:#808080">Esqueci a senha</button>
          </div>
          <button type="submit" class="btn btn-warning btn-block" style="background-color: #EDA62E; color:white;">ENTRAR</button>
        </form>
        
      <div style="margin-top:30px;">

        <h7> Não possui cadastro ainda? Clique</h7> <a href="cadastroCliente.jsp" class="btn btn-link" style="margin-bottom:2px; margin-left:-10px;" >AQUI</a> 
      </div>  
          
      
      </div>
         
 <script>
        
$(document).ready(function() {
   
    $('#form').bootstrapValidator({
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
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
  </body>
</html>