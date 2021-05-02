/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.servlet.ServletConfig;

/**
 *
 * @author bailarina77
 */
public class Consultar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private Connection con;
    private Statement set;
    private ResultSet rs;
    

    @Override
    public void init(ServletConfig cfg) throws ServletException{
        //Como se conecta a la base de datos wiiii :))
        String url="jdbc:mysql:3306//localhost/registro4iv9";
        String userName="root";
        String password="2122loken";
        //Por si hay error url="jdbc:mysql://localhost/registro4IV9";
        

        
        
        try{
            //Por si hay error url="jdbc:mysql://localhost/registro4IV9";
            url="jdbc:mysql://localhost/registro4IV9";
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url, userName, password);
            set=con.createStatement();
            System.out.println("Conexion exitosa");
        
        }catch(Exception e){
            System.out.println("Conexion no exitosa, ijole xd");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
    
    
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Consultar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Consultar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Consultar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Tabla del Registro de Usuarios</h1>"
                    +"<table border='2'>"
                    +"<thead>"
                        +"<tr>"
                            +"<th>ID</th>"
                            +"<th>Nombre</th>"
                            +"<th>Edad</th>"
                            +"<th>Correo</th>"
                        +"</tr>"
                    +"</thead>"
                    +"<tbody>");
            
            String nom,appat,apmat,correo,q;
            int edad, id;            
            
            q="select * from mregistro";
            
            try{
                set=con.createStatement();
                rs=set.executeQuery(q);
                while(rs.next()){
                    id=rs.getInt("id_usu");
                    nom=rs.getString("nom_usu");
                    appat=rs.getString("appat_usu");
                    apmat=rs.getString("apmat_usu");
                    edad=rs.getInt("edad_usu");
                    correo=rs.getString("email_usu");
                    out.println(""
                            +"<t>"
                                +"<td>"+id+"</td>"
                                +"<td>"+nom+" "+appat+" "+apmat+"</td>"
                                +"<td>"+edad+"</td>"
                                +"<td>"+correo+"</td>"
                            +"</tr>");
                }
                System.out.println("Consulta exitosa");
                rs.close();
                set.close();
            
            }catch(Exception e){
                System.out.println("Error en la consulta");
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
            }
            out.println("</tbody>"
                    + "</table>"
                    +"<a href='index.html'>Regresar al menu</a>"
                    +"<a href='Registro'>Nuevo Registro</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    
    public void destroy(){
        try{
            con.close();
        }catch(Exception e){
            super.destroy();
        }
    }
    
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
