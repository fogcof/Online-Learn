package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class change_005fpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>Home</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\n");
      out.write("        integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\"\n");
      out.write("        integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\"\n");
      out.write("        crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        .form-container {\n");
      out.write("            width: 400px;\n");
      out.write("            height: 600px;\n");
      out.write("            position: relative;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px 0;\n");
      out.write("            margin: auto;\n");
      out.write("            /* box-shadow: 0 0 20px 0px rgba(0, 0, 0, 0.1); */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-container span {\n");
      out.write("            font-weight: bold;\n");
      out.write("            padding: 0 10px;\n");
      out.write("            color: #555;\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 200px;\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-container form {\n");
      out.write("            max-width: 400px;\n");
      out.write("            padding: 0 20px;\n");
      out.write("            position: absolute;\n");
      out.write("            top: 120px;\n");
      out.write("            transition: transform 1s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #RegForm input {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 50px;\n");
      out.write("            margin: 10px 0;\n");
      out.write("            padding: 0 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #Indicator {\n");
      out.write("            width: 100px;\n");
      out.write("            border: none;\n");
      out.write("            background: blueviolet;\n");
      out.write("            height: 3px;\n");
      out.write("            margin-top: 8px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <button data-toggle=\"modal\" data-target=\"#exampleModalLong\">Change Password</button>\n");
      out.write("    <div class=\"modal fade\" id=\"exampleModalLong\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLongTitle\"\n");
      out.write("        aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"my-3\">\n");
      out.write("                    <h5 class=\"modal-title text-center\">COURSERE</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <div class=\"account-page\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-12\">\n");
      out.write("                                    <div class=\"form-container\">\n");
      out.write("                                        <div class=\"form-bt\">\n");
      out.write("                                            <!-- <span onclick=\"login()\">Login</span> -->\n");
      out.write("                                            <span>Change Password</span>\n");
      out.write("                                            <hr id=\"Indicator\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <form id=\"RegForm\" style=\"text-align: left;\" action=\"\">\n");
      out.write("                                            OLD PASSWORD\n");
      out.write("                                            <input type=\"password\" placeholder=\"Enter your old password\">\n");
      out.write("                                            NEW PASSWORD\n");
      out.write("                                            <input type=\"password\" placeholder=\"Enter your new password\">\n");
      out.write("                                            CONFIRM NEW PASSWORD\n");
      out.write("                                            <input type=\"password\" placeholder=\"Confirm new password\">\n");
      out.write("                                            <input type=\"submit\" value=\"Change now\">\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <section class=\"container-fluid bg-success row mx-auto\" style=\"height: 300px;\">\n");
      out.write("        <div class=\"col-2\" style=\"border:solid 1px black;\"></div>\n");
      out.write("        <div class=\"col-2\" style=\"border:solid 1px black;\"></div>\n");
      out.write("        <div class=\"col-2\" style=\"border:solid 1px black;\"></div>\n");
      out.write("        <div class=\"col-2\" style=\"border:solid 1px black;\"></div>\n");
      out.write("    </section>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\n");
      out.write("    integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\n");
      out.write("    integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\n");
      out.write("    integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</html>\n");
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
