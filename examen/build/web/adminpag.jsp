<%-- 
    Document   : adminpag
    Created on : 04-may-2021, 19:56:14
    Author     : bailarina77
--%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
       <script src="js/validar.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    </head>
    <body>
        
        <div class="container" >
            
            <div class="text-center mt-4 mb-4">
                <h1>
                    
                    Esta es la gestion de Usuarios
                </h1>
            </div>
            <div class="containerRegistro" >
                <form name="formularioregistro" action="Registrar.jsp" method="POST">
                    <div class="row mb-3">
                        <div class="col">
                            <label>Nombre(S):</label>
                            <input class="form-control" type="text" name="nombre" size="15" onkeypress="return validarabc(event)">
                        </div>
                        <div class="col">
                            <label>Apellido Paterno:</label>
                            <input class="form-control" type="text" name="apellidop" size="15" onkeypress="return validarabc(event)">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col">
                            <label>Apellido Materno:</label>
                            <input class="form-control" type="text" name="apellidom" size="15" onkeypress="return validarabc(event)">
                        </div>
                        <div class="col">
                            <label>Edad:</label>
                            <input class="form-control" type="number" name="edad" size="2" onkeypress="return validarn(event)">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col">
                            <label>Direccion:</label>
                            <input class="form-control" type="text" name="direccion" size="50" >
                        </div>
                        <div class="col">
                            <label>Telefono o Celular:</label>
                            <input class="form-control" type="text" name="telefono" size="10" onkeypress="return validarn(event)">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col">
                            <label>Password</label>
                            <input class="form-control" type="password" name="password" size="50" >
                        </div>
                    </div>
                    
                    <button class="btn btn-outline-success" type="submit" value="Registrar Usuario"> Registrar Usuario </button>
                    <button class="btn btn-outline-danger"  type="reset" value="Borrar Datos" >  Borrar </button>
                </form>
            </div>
            <br>
            <div class="containerConsulta" >
                <a href="Consultar.jsp" class="btn btn-outline-primary">Ver a todos los usuarios </a>
            </div> 
            
        </div>
         <script src="./JS/validar.js"></script> 
    </body>
</html>

