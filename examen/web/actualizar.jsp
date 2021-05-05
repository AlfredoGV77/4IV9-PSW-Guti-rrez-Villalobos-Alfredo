<%-- 
    Document   : actualizar
    Created on : 04-may-2021, 18:35:04
    Author     : bailarina77
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.sql.*, java.util.*, java.text.*" %>
<!DOCTYPE html>
<html>
    <head>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Borrar Registros</title>
        
    </head>
    <body>
        <div class="container" >
        <%
            Connection con = null;
            Statement set = null;
            ResultSet rs = null;
            String url, userName, password, driver;
            url = "jdbc:mysql://localhost/promociones";
            userName = "root";
            password = "2122loken";
            driver = "com.mysql.jdbc.Driver";
            
            try{
                Class.forName(driver);
                con = DriverManager.getConnection(url, userName, password);
                try{
                    String  nom2;
                    int precio2;
                    
                    nom2 = request.getParameter("nombre2");
                    precio2 = Integer.parseInt(request.getParameter("precio2"));
                    
                    
                    int id = Integer.parseInt(request.getParameter("id2"));
                    
                    String q = "update register set nom_pro = '"+nom2+"', pre_pro = '"+precio2+"'"
                      
                            + "where id_pro = "+id+"";
                    
                    
                    set = con.createStatement();
                    
                    int actualizar = set.executeUpdate(q);
                    
                    %>
                    
                    <h1>Registro Actualizado con Exito</h1>
                    <%     
                    set.close();   
                    %>
                    <title>Borrar registros</title>
                    <%
                }catch(SQLException ed){
                    System.out.println("Error al actualizar el dato");
                    System.out.println(ed.getMessage());
                     %>
                    
                    <h1>No fue posible actualizar el registro</h1>
                    
                    <% 
                
                }
                con.close();
            
            }catch(Exception e){
                System.out.println("Error al conectar con la bd");
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
                %>
                    
                    <h1>Sitio en construcción</h1>
                    
                    <%
            
            }
            %>
        
        <br>
        <a href="index.html" class="btn btn-outline-primary">Regresar al menu</a>
        <br>
        <a href="index.html" class="btn btn-outline-primary">Registrar nuevo usuario</a>
        </div>
    </body>
</html>