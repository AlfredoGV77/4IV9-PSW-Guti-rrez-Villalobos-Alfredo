<%-- 
    Document   : editar
    Created on : 04-may-2021, 18:35:41
    Author     : bailarina77
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.sql.*, java.util.*, java.text.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Datos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    </head>
    <body>

        <div class="container" >
        <h1>Tabla para la actualización de Datos</h1>
        <form method="post" name="formularioactualizar"  action="actualizar.jsp">
            <table class="table table-striped table-hover">
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
                                int id = Integer.parseInt(request.getParameter("id"));
                                String q = "select id_pro, nom_pro, pre_pro from register "
                                        + "where id_pro="+id;

                                set = con.createStatement();
                                rs = set.executeQuery(q);
                                while(rs.next()){
                                %>
                        <tr>
                            <td>ID</td>
                            <td> <input type="hidden" name="id2" value="<%=rs.getInt("id_pro")%>" > </td>
                        </tr>
                        <tr>
                            <td>Nombre :</td>
                            <td> <input type="text" name="nombre2" value="<%=rs.getString("nom_pro")%>" > </td>
                        </tr>
                        <tr>
                            <td>Precio:</td>
                            <td> <input type="number" name="precio2" value="<%=rs.getInt("pre_pro")%>" > </td>
                        </tr>


                                <%

                                }
                                rs.close();
                                set.close();

                            }catch(SQLException ed){
                                System.out.println("Error al consultar los datos");
                                System.out.println(ed.getMessage());
                                %>
                    <tr>
                        <td>ID</td>
                        <td> <input type="hidden" name="id2" value="" > </td>
                    </tr>
                    <tr>
                        <td>Nombre:</td>
                        <td> <input type="text" name="nombre2" value="" > </td>
                    </tr>
                    <tr>
                        <td>Precio:</td>
                        <td> <input type="number" name="precio2" value="" > </td>
                    </tr>

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
                
                
            </table>
                    <br>
                    <input type="submit" value="Actualizar Datos" >
                    <input type="reset" value="Borrar Datos" >
            
        </form>
                    <br>
                    <a class="btn btn-outline-danger" href="PromoCrud.html" >Cancelar</a>
                    <br>
                    <a class="btn btn-outline-primary" href="registrarPromo.jsp" >Registrar nueva promocion </a>
    
        </div>
        </body>
</html>