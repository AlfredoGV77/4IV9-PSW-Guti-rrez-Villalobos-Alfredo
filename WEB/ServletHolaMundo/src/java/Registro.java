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
public class Registro extends HttpServlet {

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
            
            String nom,appat,apmat,correo;
            int edad;
            
            nom=request.getParameter("nombre");
            appat=request.getParameter("appat");
            apmat=request.getParameter("apmat");
            correo=request.getParameter("correo");
            edad=Integer.parseInt(request.getParameter("edad"));
            
            
            //Vamos a registrar en la tabla
            try{
                String q="insert into mregistro"
                        +"(nom_usu,appat_usu,apmat_usu,edad_usu,email_usu)"
                        +"values"
                        +"('"+nom+"','"+appat+"','"+apmat+"',"+edad+",'"+correo+"')";
                
                set.executeUpdate(q);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registro</title>");            
            out.println("</head>");
            out.println("<body>"
            +"<br>"
            +"Tu nombre es:"+nom
            +"<br>"
            +"Tu apellido paterno es:"+appat
            +"<br>"
            +"Tu apellido materno es:"+apmat
            +"<br>"
            +"Tu edad es:"+edad     
            +"<br>");
            out.println("<h1>Registro exitoso</h1>"
            +"<a href='index.html'>Regresar al menu</a>");
            out.println("</body>");
            out.println("</html>");
            set.close();       
            }catch(Exception e){
                System.out.println("Error al registrar");
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registro</title>");            
            out.println("</head>");
            out.println("<body>"
            +"<br>");
            out.println("<h1>Registro NO exitoso, sorri</h1>"
                +"<a href='index.html'>Regresar al menu</a>");
            out.println("</body>");
            out.println("</html>");
            }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
