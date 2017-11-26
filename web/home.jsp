<%-- 
    Document   : home
    Created on : 18/11/2017, 00:51:59
    Author     : EDSON
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html lang="pt">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>HOME</title>
        <!-- Bootstrap CSS -->
          <%@ include file = "links.jsp" %>   
    </head>
    <body>       
        <div>      
            <%@ include file = "navPadrao.jsp" %>
           
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">

                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100" src="images/crown.png" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="images/crown.png" alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="images/crown.png" alt="Third slide">
                    </div>

                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>


            <form style="background-color:#EDA62E">
                <div class="form-row" style="margin-left:20px;">
                    <div class="form-group col-md-2" style="margin-left:40px;">
                        <label for="dataRetirada" style="color:white; margin-left:0px;">Data/Hora de retirada</label>
                        <input type="date" class="form-control" id="dataRetirada" placeholder="dd/mm/aaaa">
                    </div>
                    <div class="form-group col-md-2"><br>
                        <select id="inputState" class="custom-select mb-2 mr-sm-2 mb-sm-0" style="margin-top:8px;">
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
                    <div class="form-group col-md-39870">
                        <label for="dataDevolucao" style="color:white; margin-left:0px;">Data/Hora de devolução</label>
                        <input type="date" class="form-control" id="dataDevolucao" placeholder="dd/mm/aaaa">
                    </div>
                    <div class="form-group col-md-3"><br>
                        <select id="inputState" class="custom-select mb-2 mr-sm-2 mb-sm-0" style="margin-top:8px;">
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
                        </select>,
                       
                    </div> 
                     <div class="form-group col-md-2 ">
                        <button type="submit" class="btn btn-dark" style="margin-top:30px; margin-left:  -70px ">BUSCAR</button> 
                    </div>
                </div>    

            </form>  
        </div>

        <div class="form-row" style="margin-top:50px; margin-left:120px;">

            <div class="form-group col-md-4">
                <div class="card" style="width: 20rem;">
                    <img class="card-img-top img-thumbnail" src="images/crown.png" alt="Card image cap">
                    <div class="card-body">
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    </div>
                </div>   
            </div>

            <div class="form-group col-md-4">
                <div class="card" style="width: 20rem;">
                    <img class="card-img-top" src="images/crown.png" alt="Card image cap">
                    <div class="card-body">
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    </div>
                </div>
            </div>   

            <div class="form-group col-md-4">
                <div class="card" style="width: 20rem;">
                    <img class="card-img-top" src="images/crown.png" alt="Card image cap">
                    <div class="card-body">
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    </div>
                </div>
            </div>   
        </div>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
       
    </body>
</html>