<%-- 
    Document   : registrar
    Created on : 02-may-2021, 15:34:15
    Author     : bailarina77
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.sql.*, java.util.*, java.text.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Usuarios</title>
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
                    String nombre;
                    int precio;
                    
                    nombre = request.getParameter("nombre");
                    precio= Integer.parseInt(request.getParameter("precio"));
                    
                    set = con.createStatement();
                    
                    String q = "insert into register(nom_pro, pre_pro) "
                            + "values('"+nombre+"', '"+precio+"')";
                    
                    int register = set.executeUpdate(q);
                    
                    %>
                    
                    <h1>Registro Exitoso nwn</h1>
                    
                    <%
                        set.close();
                        
                
                }catch(SQLException ed){
                    System.out.println("Error al registrar en la tabla");
                    System.out.println(ed.getMessage());
                    %>
                    
                    <h1>Registro No Exitoso, error al leer la tabla nwn</h1>
                    
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
            <a class="btn btn-outline-primary" href="index.html" >Regresar al Menú Principal</a>
        
            </div>  
    </body>
</html>