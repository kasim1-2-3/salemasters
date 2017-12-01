package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buy_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <c:import url=\"head-meta.jsp\"/>\n");
      out.write("     \n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/jquerys.js\"></script>\n");
      out.write("  <script src=\"js/myscript.js\"></script>\n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/mystyle.css\" />\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\" />\n");
      out.write("        <title>Buy Product</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div class=\"container-fluid top_bar\" id=\"homeID\">\n");
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
      out.write("\n");
      out.write("\n");
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
      out.write("<a class=\"navbar-brand\" href=\"#\" style=\"color:#17A589\">Sale Master</a>\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("        <li class=\"active\"><a href=\"buy_product.jsp\">Buy Products</a></li>\n");
      out.write("        <li><a href=\"sale_products.jsp\">Sale Products</a></li>\n");
      out.write("        <li><a href=\"about_us.jsp\">About Us</a></li>\n");
      out.write("        <li><a href=\"contact_us.jsp\">Contact Us</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("          <!-- User Nmae -->\n");
      out.write("          <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> <b style=\"color:green\">Welcome </b><b style=\"color:Orange\"> ");
      out.print( request.getSession().getAttribute("userdb") );
      out.write("</b></a></li>\n");
      out.write("    \t\n");
      out.write("\n");
      out.write("<!-- User Registration Button -->\n");
      out.write("\t<li ><a href=\"loginform.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("<!--navigation section end -->\n");
      out.write("\n");
      out.write("<!--Product PAGE Searching Bar-->  \n");
      out.write("<div class=\"container\"> \n");
      out.write("<div row=\"row\">\n");
      out.write("<form>\n");
      out.write("  <input type=\"text\" name=\"search\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Search Car...\"> <img src=\"images/searchcar.jpg\" width=\"15%\"/>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<hr><br>\n");
      out.write("<!--Product PAGE Searching Bar END-->\n");
      out.write("<!--PRODUCT PAGE -->\n");
      out.write("<!--products section start-->\n");
      out.write("<div class=\"container\" id=\"myUL\">    \n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\" >Nano Car</div>\n");
      out.write("        <a href=\"nano_inner.jsp\"><div class=\"panel-body\"><img src=\"images/nano_car.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>2.25 - 3.22 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Swift-Desire Car</div>\n");
      out.write("        <a href=\"swift_inner.jsp\"><div class=\"panel-body\"><img src=\"images/swift_car.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>5.27 - 8.58 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Honda City Car</div>\n");
      out.write("        <a href=\"honda_inner.jsp\"><div class=\"panel-body\"><img src=\"images/city_car.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>12.85 - 13.53 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div><br>\n");
      out.write("\n");
      out.write("<div class=\"container\">    \n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Baleno<i>RS</i> Car</div>\n");
      out.write("        <a href=\"baleno_inner.jsp\"><div class=\"panel-body\"><img src=\"images/baleno_car.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>5.99 - 8.69 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Audi Car</div>\n");
      out.write("        <a href=\"audi_inner.jsp\"><div class=\"panel-body\"><img src=\"images/audi_car.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>30.0 - 39.0 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\t<div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Scorepio Car</div>\n");
      out.write("        <a href=\"scorepio_inner.jsp\"><div class=\"panel-body\"><img src=\"images/score_car.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\" ><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>9.17 - 10.16 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\t<div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Pajero Car</div>\n");
      out.write("        <a href=\"pajero_inner.jsp\"><div class=\"panel-body\"><img src=\"images/jag_old.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>28.1 - 28.59 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("<div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Alto<i>K-10</i> Car</div>\n");
      out.write("        <a href=\"alto_inner.jsp\"><div class=\"panel-body\"><img src=\"images/alto_car.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>3.8 - 4.13 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div><div class=\"col-sm-4\"> \n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">Innova Car</div>\n");
      out.write("        <a href=\"innova_inner.jsp\"><div class=\"panel-body\"><img src=\"images/innova_car.png\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div></a>\n");
      out.write("        <div class=\"panel-footer\"><b style=\"color:red;\">Buy at  </b><img src=\"images/ic.png\"/><b>17.99 - 21.19 Lakhs</b></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\t</div>\n");
      out.write("</div><br><br>\n");
      out.write("<!--products section end -->\n");
      out.write("\n");
      out.write("<!--Footer section start -->\n");
      out.write("<footer class=\"container-fluid text-center\">\n");
      out.write("  <h4><i><b>Online b&s cars</b></i></h4>  \n");
      out.write("  <form class=\"form-inline\"><b>Get deals:</b>\n");
      out.write("    <input type=\"email\" class=\"form-control\" size=\"50\" placeholder=\"Enter your email-id\" required>\n");
      out.write("    <button type=\"button\" class=\"btn btn-danger lastbtn\">Subscribe now</button>\n");
      out.write("  </form>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<!--latest footer at bottom start -->\n");
      out.write("<div class=\"container-fluid footer\" style=\"background-color:#145A32;\">\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("<div class=\"col-sm-4\">\n");
      out.write("<img src=\"images/footpic.jpg\" alt=\"\" class=\"img-responsive\" />\n");
      out.write("<p>At Scrubs, we know your time is valuable. Having to take your car in to get washed and detailed is typically a hassle. Even going out without your vehicle for a few hours can be inconvenient at the best of times....</p>\n");
      out.write("\n");
      out.write("<p><a href=\"#\" class=\"btn btn-danger\" >Read More...</a></p>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-4 midfooter\">\n");
      out.write("<h3>Quick Links</h3>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"index.jsp\">&raquo; Home </a></li>\n");
      out.write("<li><a href=\"buy_product.jsp\">&raquo; Buy Products</a></li>\n");
      out.write("<li><a href=\"about_us.jsp\">&raquo; About Us</a></li>\n");
      out.write("<li><a href=\"contact_us.jsp\">&raquo; Contact Us</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-4\"></div>\n");
      out.write("<h3>Contact Details</h3>\n");
      out.write("<p>Address : </strong> Chhattarpur new delhi(Delhi,India)(Delhi,India)</p>\n");
      out.write("<p>Email : </strong> Carliker@gmail.com</p>\n");
      out.write("<p>Phone : </strong> 9560739311</p>\n");
      out.write("<p style=\"text-align: right; margin-right: 60px;\">Timing : </strong> 9:30am to 6:30pm</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!--latest footer at bottom ending -->\n");
      out.write("<!--footer section end -->\n");
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
