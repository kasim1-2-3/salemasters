package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nav_002dall_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("             <c:import url=\"head-meta.jsp\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"container-fluid top_bar\" id=\"homeID\">\n");
      out.write("<div class=\"container\"> \n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-sm-3\">\n");
      out.write(" <a href=\"https://www.facebook.com\" class= \"social_icon\"> <i class=\"fa fa-facebook\" style =\"color:#fff; size:17px; font-size:17px\"></i></a>\n");
      out.write(" <a href=\"https://www.twitter.com\" class= \"social_icon\"> <i class=\"fa fa-twitter\" style =\"color:#fff; size:17px; font-size:17px\"></i></a>\n");
      out.write(" <a href=\"https://www.youtube.com\" class= \"social_icon\"> <i class=\"fa fa-youtube-play\" style =\"color:#fff; size:17px; font-size:17px\"></i></a>\n");
      out.write(" <a href=\"https://www.gmail.com\" class= \"social_icon\"> <i class=\"fa fa-google-plus\" style =\"color:#fff; size:17px; font-size:17px\"></i></a>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-9 text-right contact_info\">\n");
      out.write("<span class=\"glyphicon glyphicon-envelope\"></span>  salemaster@gmail.com,    \n");
      out.write("<span class=\"glyphicon glyphicon-earphone\"></span>  +91-9560739311\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div> <!--end of header-->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("        <div class=\" col-sm-12 row\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"row thumbnail text-center\">\n");
      out.write("                 <img alt=\"\" class=\"img-responsive\" src=\"images/navback.png\" width=\"100%\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\t\t</div>\n");
      out.write("    </div>\n");
      out.write("\t\t\t\n");
      out.write("<!--navigation section end -->\n");
      out.write("<nav class=\"navbar navbar-inverse\" style=\"margin-bottom:0px;\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"indexBook.html\">Home</a></li>\n");
      out.write("        <li><a href=\"buy_product.html\">Buy Products</a></li>\n");
      out.write("        <li><a href=\"about_us.html\">About Us</a></li>\n");
      out.write("        <li><a href=\"contact_us.html\">Contact Us</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-shopping-cart\"></span> Cart</a></li>\n");
      out.write("\t\t<li><a href=\"#\" onclick=\"document.getElementById('id01').style.display='block'\"><span class=\"glyphicon glyphicon-user\"></span> Login</a></li>\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<div id=\"id01\" class=\"modal\">\n");
      out.write("  \n");
      out.write("  <form class=\"modal-content animate\" action=\"LogS.jsp\">\n");
      out.write("    <div class=\"imgcontainer\">\n");
      out.write("      <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("      <img src=\"images/myprofile.png\" alt=\"Login Pic\" class=\"avatar\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("      <!-- Login Form Started -->\n");
      out.write("    <div class=\"container \">\n");
      out.write("        <label><b>Mobile Number</b></label><br>\n");
      out.write("      <input type=\"text\" placeholder=\"Enter Mobile Number\" name=\"mono\" required><br><br>\n");
      out.write("\n");
      out.write("      <label><b>Password</b></label><br>\n");
      out.write("      <input type=\"password\" placeholder=\"Enter Password\" name=\"passw\" required><br><br>\n");
      out.write("        \n");
      out.write("      <button type=\"submit\">Login</button><br><br>\n");
      out.write("\t<a href=\"#\" onclick=\"document.getElementById('id02').style.display='block',document.getElementById('id01').style.display='none' \" ><b>Click for Registration</b></a><br><br>\n");
      out.write("      <input type=\"checkbox\" checked=\"checked\"> Remember me<br><br>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div  style=\"background-color:#f1f1f1\">\n");
      out.write("      <button type=\"button\" onclick=\"document.getElementById('id01').style.display='none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("      <span class=\"psw\">Forgot <a href=\"#\">password?</a></span>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<li><a href=\"#\" onclick=\"document.getElementById('id02').style.display='block'\"><span class=\"glyphicon glyphicon-registration-mark\"></span> Registration</a></li>\n");
      out.write("\t\t<div id=\"id02\" class=\"modal\">\n");
      out.write("  \n");
      out.write("  <form class=\"modal-content animate\" action=\"hello.jsp\" method=\"POST\">\n");
      out.write("    <div class=\"imgcontainer\">\n");
      out.write("      <span onclick=\"document.getElementById('id02').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("      <img src=\"images/noprofileup.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("      <!-- Registration Form  started-->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <label><b>Name</b></label><br>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Name\" name=\"name\" required><br>\n");
      out.write("    \n");
      out.write("    <label><b>Mobile</b></label><br>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Mobile Number\" name=\"contact\" required><br>\n");
      out.write("    \n");
      out.write("\t<label><b>Email</b></label><br>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Email\" name=\"mail\" required><br>\n");
      out.write("\n");
      out.write("    <label><b>Password</b></label><br>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"pass\" required><br>\n");
      out.write("\n");
      out.write("    <label><b>Repeat Password</b></label><br>\n");
      out.write("    <input type=\"password\" placeholder=\"Repeat Password\" name=\"repass\" required><br>\n");
      out.write("    <input type=\"checkbox\" checked=\"checked\"> Remember me\n");
      out.write("    <p>By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p><br>\n");
      out.write("\n");
      out.write("    <div class=\"clearfix\">\n");
      out.write("\t      <button type=\"submit\" class=\"signupbtn\">Sign Up</button><br>\n");
      out.write("      <button type=\"button\" onclick=\"document.getElementById('id02').style.display='none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("    </div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<!--navigation section end -->\n");
      out.write("    </body>\n");
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
