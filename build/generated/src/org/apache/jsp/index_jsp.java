package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import UTIL.Constantes;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"SUNAT\">\n");
      out.write("    <title>.:: Pagina de Mensajes ::.</title>    \n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/bootstrap.min_1.css\">\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/jquery-ui/jquery.js\"></script>   \n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/bootstrap.min1.js\" ></script>\n");
      out.write("    <script src=\"/a/js/libs/blockUI/jquery.blockUI.js\" type=\"text/javascript\"></script>\n");
      out.write("    <style type=\"text/css\">\t\t    \n");
      out.write("\t\t  .div_cuerpo\n");
      out.write("                  {\n");
      out.write("                    margin-top: 15px;\n");
      out.write("                   }\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("    function  iniciar1(){\n");
      out.write("        var url=\"");
      out.print(request.getContextPath());
      out.write("/Seguridad/loginAcceso/Docente/FrmLoginPersonal.jsp\";\t \n");
      out.write("        var opciones=\"toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=yes,resizable=no,width=1500,height=2000\";\n");
      out.write("        window.open(url,\"otra\",opciones);\n");
      out.write("     }\n");
      out.write("    function  iniciar2(){\n");
      out.write("        var url=\"");
      out.print(request.getContextPath());
      out.write("/Seguridad/loginAcceso/Alumno/FrmLoginAlumno.jsp\";\t \n");
      out.write("        var opciones=\"toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=yes,resizable=no,width=1500,height=2000\";\n");
      out.write("        window.open(url,\"otra\",opciones);\n");
      out.write("     }       \n");
      out.write("    </script> \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container div_cuerpo\" id=\"div_cuerpo1\">\t\n");
      out.write("        <div class=\"panel panel-primary\">\n");
      out.write("            <div class=\"panel-heading text-center\" >\n");
      out.write("                <h4>UNIVERSIDAD PERUANA SIMON BOLIVAR</h4>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            <div class=\"alert alert-info\">\n");
      out.write("                                    <h4><strong><center> SISTEMA VIRTUAL DE EVALUACION EN  LINEA</center></strong></h4>                            \n");
      out.write("                        </div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("\t\t\t    <div class=\"row\">\n");
      out.write("                                \n");
      out.write("\t\t\t    \t<div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("                                    <center>  <img  src=\"imagenes/seguridadloguin.png\"></center>\n");
      out.write("\t\t\t    \t</div>\n");
      out.write("\t\t\t    </div>\t\t\t\n");
      out.write("\t\t\t    <div class=\"row\">\n");
      out.write("\t\t\t    \t<div class=\"col-md-6 col-md-offset-3 error text-center\">Acceso al Sistema\n");
      out.write("\t\t\t    \t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t    <div class=\"row\">\n");
      out.write("\t\t\t    \t<div class=\"col-md-6 col-md-offset-3\"><HR size=\"3px\" color=\"#0000ff\">\n");
      out.write("\t\t\t    \t</div>\n");
      out.write("\t\t\t\t</div>\t\t\t\n");
      out.write("\t\t\t   \n");
      out.write("\t\t\t    <div class=\"row\">\n");
      out.write("\t\t\t    \t<div class=\"col-md-6 col-md-offset-3 soluc\">\n");
      out.write("                                    <center> \n");
      out.write("                                        <button    class=\"btn btn-success btn-xlarge\" onclick=\"iniciar1()\" >\n");
      out.write("                                            <center>  <img  src=\"imagenes/personal.png\" width=\"100px\" height=\"100px\"></center><br>\n");
      out.write("                                            Personal\n");
      out.write("                                        </button> \n");
      out.write("                                        <button    class=\"btn btn-warning btn-xlarge\"  onclick=\"iniciar2()\" >\n");
      out.write("                                            <center>  <img  src=\"imagenes/alumno.png\" width=\"100px\" height=\"100px\"></center><br>\n");
      out.write("                                            Alumno\n");
      out.write("                                        </button> \n");
      out.write("               \n");
      out.write("                                    </center>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("\t\t\t    \t</div>\n");
      out.write("\t\t\t    </div>\t\t\t\n");
      out.write("\t\t\t   \n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel-footer text-center\">\n");
      out.write("                Sistema Virtual Evaluacion en Linea - Derechos reservados &copy; 2015-2016\n");
      out.write("            </div>            \n");
      out.write("        </div>\t\t\t\t\t\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
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
