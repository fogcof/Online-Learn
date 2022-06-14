package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class account_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\n");
      out.write("        integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\"\n");
      out.write("        integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\"\n");
      out.write("        crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <<link rel=\"stylesheet\" href=\"../css/account.css\"/>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"account-page mt-5\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <div class=\"form-container\">\n");
      out.write("                        <div class=\"form-bt\">\n");
      out.write("                            <span onclick=\"login()\">Login</span>\n");
      out.write("                            <span onclick=\"register()\">Register</span>\n");
      out.write("                            <hr id=\"Indicator\">\n");
      out.write("                        </div>\n");
      out.write("                        <form id=\"LoginForm\" style=\"text-align: left;\" action=\"\">\n");
      out.write("                            EMAIL\n");
      out.write("                            <input type=\"email\" placeholder=\"name@email.com\">\n");
      out.write("                            PASSWORD\n");
      out.write("                            <input type=\"password\" placeholder=\"Enter your password\">\n");
      out.write("                            <input type=\"button\" value=\"Login\">\n");
      out.write("                            <!-- <button style=\"width: 100%;height: 50px;margin-top: 10px;\"><i class=\"fa-brands fa-google\"></i>Continue with Google</button> -->\n");
      out.write("                            <input type=\"button\" value=\"Continue with Google\">\n");
      out.write("                        </form>\n");
      out.write("                        <form id=\"RegForm\" style=\"text-align: left;\" action=\"\">\n");
      out.write("                            FULL NAME\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter your full name\">\n");
      out.write("                            EMAIL\n");
      out.write("                            <input type=\"email\" placeholder=\"name@email.com\">\n");
      out.write("                            PASSWORD\n");
      out.write("                            <input type=\"password\" placeholder=\"Enter your password\">\n");
      out.write("                            <input type=\"button\" value=\"Register\">\n");
      out.write("                            <input type=\"button\" value=\"Continue with Google\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\n");
      out.write("    integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\n");
      out.write("    integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\n");
      out.write("    integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"../js/account.js\"></script>\n");
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
