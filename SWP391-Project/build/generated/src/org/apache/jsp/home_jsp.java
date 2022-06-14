package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        .navbar {\n");
      out.write("            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        .form-container {\n");
      out.write("            width: 400px;\n");
      out.write("            height: 600px;\n");
      out.write("            position: relative;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px 0;\n");
      out.write("            margin: auto;\n");
      out.write("            /* box-shadow: 0 0 20px 0px rgba(0, 0, 0, 0.1); */\n");
      out.write("            overflow: hidden;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-container span {\n");
      out.write("            font-weight: bold;\n");
      out.write("            padding: 0 10px;\n");
      out.write("            color: #555;\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 100px;\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-bt {\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-container form {\n");
      out.write("            max-width: 400px;\n");
      out.write("            padding: 0 20px;\n");
      out.write("            position: absolute;\n");
      out.write("            top: 100px;\n");
      out.write("            transition: transform 1s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #LoginForm input, #RegForm input{\n");
      out.write("            width: 100%;\n");
      out.write("            height: 50px;\n");
      out.write("            margin: 10px 0;\n");
      out.write("            padding: 0 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #LoginForm {\n");
      out.write("            left: -400px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #RegForm {\n");
      out.write("            left: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #Indicator {\n");
      out.write("            width: 100px;\n");
      out.write("            border: none;\n");
      out.write("            background: blueviolet;\n");
      out.write("            height: 3px;\n");
      out.write("            margin-top: 8px;\n");
      out.write("            transform: translateX(50px);\n");
      out.write("            transition: transform 1s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-white py-3 fixed-top\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">COURSERE</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("            aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0 ml-5\">\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"What do you want\" aria-label=\"Search\">\n");
      out.write("                <button class=\"btn btn-outline-primary my-2 my-sm-0\" type=\"submit\"><i\n");
      out.write("                        class=\"fa-solid fa-magnifying-glass\"></i> </button>\n");
      out.write("            </form>\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <li class=\"nav-item mr-2\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">BLOG</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item mr-2\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">BLOG</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item mr-2\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">BLOG</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item ml-5 mr-4\">\n");
      out.write("                    <a class=\"nav-link\" style=\"border: 1px solid black;\" data-toggle=\"modal\"\n");
      out.write("                        data-target=\"#exampleModalLong\" href=\"#\">ACCOUNT</a>\n");
      out.write("                </li>\n");
      out.write("                <!-- <li class=\"nav-item dropdown ml-5 mr-4\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" style=\"border: 1px solid black;\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("                        role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        ACCOUNT\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">DASBOARD</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">PROFILE</a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">SOMETHING</a>\n");
      out.write("                    </div>\n");
      out.write("                </li> -->\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
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
      out.write("                                            <span onclick=\"login()\">Login</span>\n");
      out.write("                                            <span onclick=\"register()\">Register</span>\n");
      out.write("                                            <hr id=\"Indicator\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <form id=\"LoginForm\" style=\"text-align: left;\" action=\"\">\n");
      out.write("                                            EMAIL\n");
      out.write("                                            <input type=\"email\" placeholder=\"name@email.com\">\n");
      out.write("                                            PASSWORD\n");
      out.write("                                            <input type=\"password\" placeholder=\"Enter your password\">\n");
      out.write("                                            <input type=\"button\" value=\"Login\">\n");
      out.write("                                            <!-- <button style=\"width: 100%;height: 50px;margin-top: 10px;\"><i class=\"fa-brands fa-google\"></i>Continue with Google</button> -->\n");
      out.write("                                            <input type=\"button\" value=\"Continue with Google\">\n");
      out.write("                                        </form>\n");
      out.write("                                        <form id=\"RegForm\" style=\"text-align: left;\" action=\"\">\n");
      out.write("                                            FULL NAME\n");
      out.write("                                            <input type=\"text\" placeholder=\"Enter your full name\">\n");
      out.write("                                            EMAIL\n");
      out.write("                                            <input type=\"email\" placeholder=\"name@email.com\">\n");
      out.write("                                            PASSWORD\n");
      out.write("                                            <input type=\"password\" placeholder=\"Enter your password\">\n");
      out.write("                                            <input type=\"button\" value=\"Register\">\n");
      out.write("                                            <input type=\"button\" value=\"Continue with Google\">\n");
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
      out.write("    <section id=\"banner\" class=\"d-flex justify-content-around align-items-center\"\n");
      out.write("        style=\"width: 100%;height: 500px;background-color: blue\">\n");
      out.write("        <div style=\"color: white;font-size: 40px;\">Banner</div>\n");
      out.write("    </section>\n");
      out.write("    <section id=\"advertisement\">\n");
      out.write("        <div class=\"container mx-auto row\">\n");
      out.write("            <div class=\"col-3 d-flex justify-content-around align-items-center\"\n");
      out.write("                style=\"background-color: red;height: 100px;border:solid 1px black\">\n");
      out.write("                <div style=\"color: white;font-size: 20px;\">Advertisement</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-3 d-flex justify-content-around align-items-center\"\n");
      out.write("                style=\"background-color: red;height: 100px;border:solid 1px black\">\n");
      out.write("                <div style=\"color: white;font-size: 20px;\">Advertisement</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-3 d-flex justify-content-around align-items-center\"\n");
      out.write("                style=\"background-color: red;height: 100px;border:solid 1px black\">\n");
      out.write("                <div style=\"color: white;font-size: 20px;\">Advertisement</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-3 d-flex justify-content-around align-items-center\"\n");
      out.write("                style=\"background-color: red;height: 100px;border:solid 1px black\">\n");
      out.write("                <div style=\"color: white;font-size: 20px;\">Advertisement</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <section id=\"slider\" style=\"width: 100%;height: 200px;background-color: green;\"\n");
      out.write("        class=\"d-flex justify-content-around align-items-center\">\n");
      out.write("        <div style=\"color: white;font-size: 30px;\">Slider</div>\n");
      out.write("    </section>\n");
      out.write("    <section id=\"Post\">\n");
      out.write("        <div class=\"container-fluid mx-auto row\">\n");
      out.write("            <div class=\"col-3 d-flex justify-content-around align-items-center\"\n");
      out.write("                style=\"background-color: yellow;height: 250px;border:solid 1px black\">\n");
      out.write("                <div style=\"color: black;font-size: 20px;\">Post</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-3 d-flex justify-content-around align-items-center\"\n");
      out.write("                style=\"background-color: yellow;height: 250px;border:solid 1px black\">\n");
      out.write("                <div style=\"color: black;font-size: 20px;\">Post</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-3 d-flex justify-content-around align-items-center\"\n");
      out.write("                style=\"background-color: yellow;height: 250px;border:solid 1px black\">\n");
      out.write("                <div style=\"color: black;font-size: 20px;\">Post</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-3 d-flex justify-content-around align-items-center\"\n");
      out.write("                style=\"background-color: yellow;height: 250px;border:solid 1px black\">\n");
      out.write("                <div style=\"color: black;font-size: 20px;\">Post</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <footer style=\"width: 100%;height: 200px;background-color: black;\"\n");
      out.write("        class=\"d-flex justify-content-around align-items-center\">\n");
      out.write("        <div style=\"color: white;font-size: 20px;\">Footer</div>\n");
      out.write("    </footer>\n");
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
      out.write("    <script>\n");
      out.write("        var LoginForm = document.getElementById(\"LoginForm\");\n");
      out.write("        var RegForm = document.getElementById(\"RegForm\");\n");
      out.write("        var Indicator = document.getElementById(\"Indicator\");\n");
      out.write("\n");
      out.write("        function register() {\n");
      out.write("            RegForm.style.transform = \"translateX(0px)\";\n");
      out.write("            LoginForm.style.transform = \"translateX(0px)\";\n");
      out.write("            Indicator.style.transform = \"translateX(50px)\";\n");
      out.write("        }\n");
      out.write("        function login() {\n");
      out.write("            RegForm.style.transform = \"translateX(400px)\";\n");
      out.write("            LoginForm.style.transform = \"translateX(400px)\";\n");
      out.write("            Indicator.style.transform = \"translateX(-50px)\";\n");
      out.write("        }\n");
      out.write("    </script>\n");
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