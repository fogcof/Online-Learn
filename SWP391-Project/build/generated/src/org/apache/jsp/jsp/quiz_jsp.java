package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class quiz_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"../css/quiz.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <section id=\"quiz-title\" class=\"container-fluid mb-3 row mx-auto\">\n");
      out.write("        <div class=\"quiz-title-detail col-12 py-3\">\n");
      out.write("            <h3>Mathematics for Engineering - MAE101</h3>\n");
      out.write("            <div class=\"quiz-link\">\n");
      out.write("                <a href=\"#\">Home</a>\n");
      out.write("                <i class=\"fa-solid fa-angle-right mx-2\"></i>\n");
      out.write("                <a href=\"#\">My courses</a>\n");
      out.write("                <i class=\"fa-solid fa-angle-right mx-2\"></i>\n");
      out.write("                <a href=\"#\">Course</a>\n");
      out.write("                <i class=\"fa-solid fa-angle-right mx-2\"></i>\n");
      out.write("                <a href=\"#\">Quiz</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <section id=\"quiz-content\" class=\"container-fluid row mx-auto\">\n");
      out.write("        <div class=\"quiz-question col-lg-9 col-12\">\n");
      out.write("<!--            <table class=\"generaltable quizreviewsummary\">\n");
      out.write("                <tbody>\n");
      out.write("                  <tr>\n");
      out.write("                    <th class=\"cell\" scope=\"row\">Start on</th>\n");
      out.write("                    <td class=\"cell\">Friday, 10 June 2022, 2:20 PM</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th class=\"cell\" scope=\"row\">State</th>\n");
      out.write("                    <td class=\"cell\">Finished</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th class=\"cell\" scope=\"row\">Completed on</th>\n");
      out.write("                    <td class=\"cell\">Friday, 10 June 2022, 2:21 PM</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th class=\"cell\" scope=\"row\">Time taken</th>\n");
      out.write("                    <td class=\"cell\">1 min 16 secs</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th class=\"cell\" scope=\"row\">Marks</th>\n");
      out.write("                    <td class=\"cell\">0.00/15.00</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <th class=\"cell\" scope=\"row\">Grade</th>\n");
      out.write("                    <td class=\"cell\"><b>0.00</b> out of 10.00 (<b>0</b>%)</td>\n");
      out.write("                  </tr>\n");
      out.write("                </tbody>\n");
      out.write("              </table>-->\n");
      out.write("            <div class=\"row quiz-question-detail\">\n");
      out.write("                <div class=\"col-2 question-num my-5\">\n");
      out.write("                    <h4>Question 1</h4>\n");
      out.write("                    <p>Not yet answered</p>\n");
      out.write("                    <p>Marked out of 1.00</p>\n");
      out.write("                    <p><i class=\"fa-solid fa-flag\"></i> Flag question</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 question-wrapper\">\n");
      out.write("                    <div class=\"question-content pt-5 pb-5\">\n");
      out.write("                        From the graph of y = f(x), how do we obtain the graph of y = f(x+3) -2?\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"question-answer pt-5\">\n");
      out.write("                        <p>Select one:</p>\n");
      out.write("                        <input type=\"radio\"> a. Shift to the right by 2, and then shift up by 3 <br>\n");
      out.write("                        <input type=\"radio\"> b. Shift to the right by 2, and then shift up by 3 <br>\n");
      out.write("                        <input type=\"radio\"> c. Shift to the right by 2, and then shift up by 3 <br>\n");
      out.write("                        <input type=\"radio\"> d. Shift to the right by 2, and then shift up by 3 <br>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"quiz-next d-flex justify-content-between my-5\">\n");
      out.write("                        <button>Previous</button>\n");
      out.write("                        <button>Next</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"quiz-nav col-lg-3 col-12\">\n");
      out.write("            <div class=\"col-12 quiz-nav-detail py-5\">\n");
      out.write("                <h6>Quiz navigation</h6>\n");
      out.write("                <div class=\"quiz-button d-flex my-4\">\n");
      out.write("                    <a href=\"\">1</a>\n");
      out.write("                    <a href=\"\">2</a>\n");
      out.write("                    <a href=\"\">3</a>\n");
      out.write("                    <a href=\"\">4</a>\n");
      out.write("                    <a href=\"\">5</a>\n");
      out.write("                    <a href=\"\">6</a>\n");
      out.write("                    <a href=\"\">7</a>\n");
      out.write("                    <a href=\"\">8</a>\n");
      out.write("                    <a href=\"\">9</a>\n");
      out.write("                    <a href=\"\">10</a>\n");
      out.write("                    <a href=\"\">11</a>\n");
      out.write("                </div>\n");
      out.write("                <h6 class=\"my-4\">Finish attempt ...</h6>\n");
      out.write("                <h6>Time left 0:37:48</h6>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
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
