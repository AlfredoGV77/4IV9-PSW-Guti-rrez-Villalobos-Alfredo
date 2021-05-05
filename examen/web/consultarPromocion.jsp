<%-- 
    Document   : consultarPromocion
    Created on : 04-may-2021, 18:30:51
    Author     : bailarina77
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.sql.*, java.util.*, java.text.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de Usuarios</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    </head>
    <body>
        <div class="container" >
        <h1 align="center ">Tabla de todas las promociones registradas</h1>
        <table class="table table-striped table-hover" >
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Precio$</th>              
                    <th>Editar</th>
                    <th>Borrar</th>
                </tr>
            </thead>
            <tbody>
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
                            String q = "select * from register order by nom_pro asc";
                            
                            set = con.createStatement();
                            rs = set.executeQuery(q);
                            while(rs.next()){
                            %>
                <tr>
                    <td> <%=rs.getInt("id_pro")%> </td>
                    <td> <%=rs.getString("nom_pro")%> </td>
                    <td> <%=rs.getInt("pre_pro")%> </td>
                    <td> <a class="btn btn-outline-primary" href="editar.jsp?id=<%=rs.getInt("id_pro")%>" > Editar </a> </td>
                    <td> <a class="btn btn-outline-danger" href="borrarPromocion.jsp?id=<%=rs.getInt("id_pro")%>" > Borrar </a> </td>

                </tr>        
                            
                            
                            <%
                                
                                
                            }
                            rs.close();
                            set.close();
                        
                        }catch(SQLException ed){
                            System.out.println("Error al consultar la tabla");
                            System.out.println(ed.getMessage());
                            %>
            </tbody>
            <h1>Error el recurso de la consulta no esta disponible, solo juguito contigo</h1>
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
                
                
            </tbody>
            
            
        </table>
            <br>
            <a class="btn btn-outline-primary" href="index.html" >Regresar al Menú Principal</a>
            <br>
            <a class="btn btn-outline-primary" href="registrar.jsp" >Registrar Nuevo Usuario</a>
        </div>
        </body>
</html>
