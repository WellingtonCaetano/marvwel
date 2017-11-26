<%-- 
    Document   : cadatroMarca
    Created on : 23/11/2017, 20:32:18
    Author     : EDSON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Latest compiled and minified CSS -->
      

        <!-- jQuery library -->
       

        <!-- Latest compiled JavaScript   hover:#B57407; -->
      
    <%@ include file = "links.jsp" %>   
    </head>
    
    <body>
        
          <%@ include file = "navFuncionario.jsp" %> 
          
        <div class="container" style="margin-top:50px; width:400px">
            <form id="form" method="POST" action='mainControll?action=salvarMarca'  data-toggle="validator">
                <div class="form-row"style="margin-top:30px;">        
                    <div class="col-5" style="display: ${1 == 2 ? 'block':'none'}">
                        <input class="form-control"
                            type="text"                                
                            id="example-text-input"
                            name="codigo"
                            
                            value="<c:out value="${marcaTO.codigo}" />"
                        />
                            
                    
                    </div>   
                
                <div class="form-group has-feedback">
                    <label for="nome">Marca</label>
                    <input type="text"
                           class="form-control" 
                           id="nome"
                           name ="nome"
                           required                           
                            value="<c:out value="${marcaTO.nome}" />"
                    />
                    
                </div>
                  
                <button type="submit" class="btn btn-success btn-block">SALVAR</button>
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
    
    
    
</html>