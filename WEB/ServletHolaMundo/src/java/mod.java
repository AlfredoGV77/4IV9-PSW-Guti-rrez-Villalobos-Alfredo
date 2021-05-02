/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author bailarina77
 */
public class mod extends HttpServlet {
    
    private Connection con;
    private Statement set;
    private ResultSet rs;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
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
            out.println("<title>Servlet mod</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet mod at " + request.getContextPath() + "</h1>");
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
    @SuppressWarnings("empty-statement")
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out=response.getWriter()){
            
            String nom,appat,apmat,correo,q;
            int edad, id;
            
            id=Integer.parseInt(request.getParameter("idmodificar"));
            q="select * from mregistro where id_usu="+id;
         
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
                      
                
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet Modificar</title>");            
                out.println("</head>");
                out.println("<body>"
                    +"<form name='formulariomodificar' method='post' action='mod2'>"
                    +"<h2>Modifique los datos</h2>"
                    +"<h2>ID</h2>"
                    +"<input type='text' value='"+id+"' name ='id2' readonly>"
                    +"<br>"
                    +"<h2>Nombre</h2>"
                    +"<input type='text' value='"+nom+"' name ='nom2'>"
                    +"<br>"
                    +"<h2>Apellido Paterno</h2>"
                    +"<input type='text' value='"+appat+"' name ='appat2'>"
                    +"<br>"
                    +"<h2>Apellido Materno</h2>"
                    +"<input type='text' value='"+apmat+"' name ='apmat2'>"
                    +"<br>"
                    +"<h2>Edad</h2>"
                    +"<input type='text' value='"+edad+"' name ='edad2'>"
                    +"<br>"
                    +"<h2>Correo</h2>"
                    +"<input type='text' value='"+correo+"' name ='correo2'>"
                    +"<br>"
                    +"<input type='submit' value='Modificar datos'>"
                    +"</form>");    
                   
                    }
                
            }catch(Exception e){
                System.out.println("Error al realizar la modificacion");
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());                
            }
            out.println("</body>");
            out.println("</html>");            
        }
    }
    
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


