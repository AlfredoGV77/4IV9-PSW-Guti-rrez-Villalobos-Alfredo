package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminpag_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("       <script src=\"js/validar.js\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\" >\n");
      out.write("            \n");
      out.write("            <div class=\"text-center mt-4 mb-4\">\n");
      out.write("                <h1>\n");
      out.write("                    \n");
      out.write("                    Esta es la gestion de Usuarios\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"containerRegistro\" >\n");
      out.write("                <form name=\"formularioregistro\" action=\"Registrar.jsp\" method=\"POST\">\n");
      out.write("                    <div class=\"row mb-3\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>Nombre(S):</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"nombre\" size=\"15\" onkeypress=\"return validarabc(event)\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>Apellido Paterno:</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"apellidop\" size=\"15\" onkeypress=\"return validarabc(event)\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row mb-3\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>Apellido Materno:</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"apellidom\" size=\"15\" onkeypress=\"return validarabc(event)\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>Edad:</label>\n");
      out.write("                            <input class=\"form-control\" type=\"number\" name=\"edad\" size=\"2\" onkeypress=\"return validarn(event)\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row mb-3\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>Direccion:</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"direccion\" size=\"50\" >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>Telefono o Celular:</label>\n");
      out.write("                            <input class=\"form-control\" type=\"text\" name=\"telefono\" size=\"10\" onkeypress=\"return validarn(event)\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row mb-3\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label>Password</label>\n");
      out.write("                            <input class=\"form-control\" type=\"password\" name=\"password\" size=\"50\" >\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <button class=\"btn btn-outline-success\" type=\"submit\" value=\"Registrar Usuario\"> Registrar Usuario </button>\n");
      out.write("                    <button class=\"btn btn-outline-danger\"  type=\"reset\" value=\"Borrar Datos\" >  Borrar </button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"containerConsulta\" >\n");
      out.write("                <a href=\"Consultar.jsp\" class=\"btn btn-outline-primary\">Ver a todos los usuarios </a>\n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("         <script src=\"./JS/validar.js\"></script> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
