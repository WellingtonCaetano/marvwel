<%-- 
    Document   : listaVeiculoLocacao
    Created on : 24/11/2017, 01:57:01
    Author     : EDSON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="pt">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Latest compiled and minified CSS -->
          <%@ include file = "links.jsp" %>

    </head>

    
    <body style="background-color:#F4F4F4;"> 
        
         <%@ include file = "navCliente.jsp" %>

        <div class="row">
            <div class="col-sm-3" style="margin-top:60px; margin-left:60px; background-color:clear; height:870px;">
                
                <div class="row" style="background-color:#EDA62E; height:230px;">
                    <div class="form-group col-sm-6" style="margin-left:0px; margin-top:25px;">
                      <label for="dataRetirada" style="color:white; margin-left:0px;">Data Retirada</label>
                      <input type="date" class="form-control" id="dataRetirada" placeholder="dd/mm/aaaa">
                    </div>
                    <div class="form-group col-sm-6" style="margin-left:0px; margin-top:25px;">
                      <label for="dataRetirada" style="color:white; margin-left:0px;">Hora</label>
                        <select id="inputState" class="form-control mb-2 mr-sm-2 mb-sm-0">
                            <option selected>Selecionar...</option>
                            <option>08:00</option>
                            <option>08:30</option>
                            <option>09:00</option>
                            <option>09:30</option>
                            <option>10:00</option>
                            <option>10:30</option>
                            <option>11:00</option>
                            <option>11:30</option>
                            <option>12:00</option>
                            <option>13:00</option>
                            <option>13:30</option>
                            <option>14:00</option>
                            <option>14:30</option>
                            <option>15:00</option>
                            <option>16:30</option>
                            <option>16:00</option>
                            <option>17:00</option>
                            <option>17:30</option>
                            <option>18:00</option>
                        </select>
                    </div>
                    <br>
                    <div class="form-group col-sm-6" style="margin-left:0px;">
                      <label for="dataRetirada" style="color:white; margin-left:0px;">Data Devolução</label>
                      <input type="date" class="form-control" id="dataRetirada" placeholder="dd/mm/aaaa">
                    </div>
                    <div class="form-group col-sm-6" style="margin-left:0px;">
                      <label for="dataRetirada" style="color:white; margin-left:0px;">Hora</label>
                        <select id="inputState" class="form-control mb-2 mr-sm-2 mb-sm-0">
                            <option selected>Selecionar...</option>
                            <option>08:00</option>
                            <option>08:30</option>
                            <option>09:00</option>
                            <option>09:30</option>
                            <option>10:00</option>
                            <option>10:30</option>
                            <option>11:00</option>
                            <option>11:30</option>
                            <option>12:00</option>
                            <option>13:00</option>
                            <option>13:30</option>
                            <option>14:00</option>
                            <option>14:30</option>
                            <option>15:00</option>
                            <option>16:30</option>
                            <option>16:00</option>
                            <option>17:00</option>
                            <option>17:30</option>
                            <option>18:00</option>
                        </select>
                    </div> 
                    <div class="row" style="margin-right:0px; margin-left:0px; margin-top:10px;">
                      <div class="col-lg-12" >
                        <button type="button" class="btn btn-success btn-block" style="">BUSCAR</button> 
                      </div>
                    </div>        
                </div>
                <div class="row" style="background-color:white; margin-top:30px; height:350px;">
                    <h4 style="margin-left:10px;"> Características do Carro</h4>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Ar Condicionado</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Direção Hidráulica</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Câmbio Automático</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Vidros Elétricos</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Direção Hidráulica</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Trava Elétrica</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Aribag</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Freio ABS</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> 2 portas</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> 4 portas</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Até 5 passageiros</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Mais de 5 passageiros</label>
                    </div>
                </div>
                <div class="row" style="background-color:white; margin-top:30px; height:200px;">
                    <h4 style="margin-left:10px;"> Categorias de Carro</h4>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Standart</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> SUV</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Especial</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Utilitário</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Minivan</label>
                    </div>
                    <div class="checkbox" style="margin-left:10px;">
                        <label><input type="checkbox"> Luxo</label>
                    </div>
                </div>
                
            </div>
            
            <div class="col-sm-8" style="margin-left:0px;">
            <ul class="list-group" style="margin-top:60px; margin-left:0px;">
          <li class="list-group-item">
            <div class="row" style="margin-right:0px;"> 
                <div class="col-sm-3">
                    <div class="media">
                        <div class="media-left">
                            <img src="images/carro.jpg" class="media-object" style="width:175px; margin-top:60px;">
                        </div>
                    </div>
                </div>
                <div class="col-sm-4" style="margin-right:50px;">
                    <h4 class="strong text-uppercase" style="margin-right:20px;">Ford Mustang</h4>
                </div>
                <div class="col-sm-4">
                    <h4 class="strong text-uppercase">LUXO</h4>
                </div>
                <div class="col-sm-6" style="margin-top:20px;">
                    <div class="row">
                      <div class="col-sm-4" style="margin-top:5px;">Motor:</div>
                      <div class="col-sm-1 text-left" style="margin-top:5px;"><mark style="background-color:#40AE6A; color:white;">2.0</mark></div>
                      <div class="col-sm-4" style="margin-top:5px; margin-left:50px;">Passageiros:</div>
                      <div class="col-sm-1 text-left" style="margin-top:5px;"><mark style="background-color:#40AE6A; color:white;">4</div>
                    </div>
                    <div class="row">
                      <div class="col-sm-4" style="margin-top:5px;">ArCondicionado:</div>
                      <div class="col-sm-1 text-right" style="margin-top:5px;"><mark style="background-color:#40AE6A; color:white;">Sim</mark></div>
                      <div class="col-sm-4" style="margin-top:5px; margin-left:50px;">Direção:</div>
                      <div class="col-sm-1 text-right" style="margin-top:5px;"><mark style="background-color:#40AE6A; color:white;">Hidráulica</mark></div>
                    </div>
                    <div class="row">
                      <div class="col-sm-4" style="margin-top:5px;">Câmbio:</div>
                      <div class="col-sm-1 text-left" style="margin-top:5px;"><mark style="background-color:#40AE6A; color:white;">Automático</mark></div>
                      <div class="col-sm-4" style="margin-top:5px; margin-left:50px;">Vidros Elétricos:</div>
                      <div class="col-sm-1 text-left" style="margin-top:5px;"><mark style="background-color:#40AE6A; color:white;">Sim</mark></div>
                    </div>
                    <div class="row">
                      <div class="col-sm-4" style="margin-top:5px;">Trava Elétrica:</div>
                      <div class="col-sm-1 text-left" style="margin-top:5px;"><mark style="background-color:#40AE6A; color:white;">Sim</mark></div>
                      <div class="col-sm-4" style="margin-top:5px; margin-left:50px;">Airbag:</div>
                      <div class="col-sm-1 text-left" style="margin-top:5px;"><mark style="background-color:#40AE6A; color:white;">Sim</mark></div>
                    </div>
                    <div class="row">
                      <div class="col-sm-4" style="margin-top:5px;">Freios ABS:</div>
                      <div class="col-sm-1 text-left" style="margin-top:5px;"><mark style="background-color:#40AE6A; color:white;">Sim</mark></div>
                      <div class="col-sm-4" style="margin-top:5px; margin-left:50px;">Qtd. portas:</div>
                      <div class="col-sm-1 text-left" style="margin-top:5px;"><mark style="background-color:#40AE6A; color:white;">2</mark></div>
                    </div>
                    <div class="row">
                      <div class="col-sm-4" style="margin-top:5px;">Som:</div>
                      <div class="col-sm-1 text-left" style="margin-top:5px;"><mark style="background-color:#40AE6A; color:white;">CD/USB</mark></div>
                      <div class="col-sm-4" style="margin-top:5px; margin-left:50px;">Qtd. malas:</div>
                      <div class="col-sm-1 text-left" style="margin-top:5px;"><mark style="background-color:#40AE6A; color:white;">2</mark></div>
                    </div>
                </div>
                <div class="col-sm-1">
                   <div class="row  text-center" style="margin-left:50px;">
                      <h2>R$750,00</h2>
                      <label class="small" style="margin-left:30px;">R$150,00/dia</label> <br><br>
                      <button type="button" class="btn btn-success" style="margin-left:10px;">CONTINUAR</button> 
                   </div>

                </div>

            </div>

          </li>
        </ul>
            </div>
        </div>
        
    </body>
    
</html>