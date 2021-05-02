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
public class Eliminar extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Eliminar</title>");            
            out.println("</head>");
            out.println("<body>");
            
            int id;
            id=Integer.parseInt(request.getParameter("ideliminar"));
            String q="delete from mregistro where id_usu="+id;
            
            try{
                set.executeUpdate(q);
                out.println("<h1>Usuario eliminado</h1>");
                System.out.println("Registro eliminado");
            }catch(Exception e){
                out.println("<h1>Usuario no eliminado</h1>");
                System.out.println("Error al eliminar registro");
                System.out.println(e.getMessage());
            }
         
            
            out.println("<h1>Usuario eliminado</h1>"
                        +"<a href='index.html'>Regresar al menu</a>"
                        +"<a href='Registro'>Nuevo Registro</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    public void destroy(){
        try{
            con.close();
        }catch(Exception e){
            super.destroy();
        }
    }
}
