package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_005fus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>About Us</title>\n");
      out.write("<meta name=\"description\" content=\"A customized about us page design using bootstrap framework, HTML and CSS. If you need to use this attractive and responsive bootstrap about us page design go back to article and click download button to download it.\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,700' rel='stylesheet'>\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js></script>\n");
      out.write("<script src=https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js></script>\n");
      out.write("<![endif]-->\n");
      out.write("<script>!function(e,a,t,n,c,o,s){e.GoogleAnalyticsObject=c,e[c]=e[c]||function(){(e[c].q=e[c].q||[]).push(arguments)},e[c].l=1*new Date,o=a.createElement(t),s=a.getElementsByTagName(t)[0],o.async=1,o.src=n,s.parentNode.insertBefore(o,s)}(window,document,\"script\",\"//www.google-analytics.com/analytics.js\",\"ga\"),ga(\"create\",\"UA-47210639-2\",\"auto\"),ga(\"send\",\"pageview\")</script><script type=application/ld+json>{ \"@context\": \"http://schema.org/\",\"@type\": \"Review\",\"itemReviewed\": {\"@type\": \"Thing\",\"name\": \"Article\"},\"author\": {\"@type\": \"Person\",\"name\": \"Md Ashraf Malik\"}, \"reviewRating\": {\"@type\": \"Rating\",\"ratingValue\": \"5\",\"bestRating\": \"5\"}, \"publisher\": { \"@type\": \"Organization\", \"name\": \"Web Developer Bareilly\" } }</script>\n");
      out.write("<style>\n");
      out.write("body{font-family:'Open Sans Condensed',sans-serif;font-size:20px; background:#f8f8f8}\n");
      out.write("/* header */\n");
      out.write("html,body{height:100%; width:100%}\n");
      out.write("h1,h2,h3{font-weight:700}\n");
      out.write("header{position:relative; width:100%; background-size:cover; background-position:center; background-image:url(images/header.jpg); text-align:center}\n");
      out.write("header .wel{position: relative;text-align: center;padding: 100px 15px 100px;width: 100%; color:#eee}\n");
      out.write(".wel h1{font-weight:700; color:#fff}.brk{height:4px; border-radius:4px; background:#d9534f; margin:25px auto; display:block; width:60px}\n");
      out.write(".abs-back{background:rgba(29, 21, 24, 0.4); position:absolute; height:100%; width:100%; left:0; top:0}\n");
      out.write("/* who we */\n");
      out.write(".who-we{margin-top:50px; margin-bottom:50px}\n");
      out.write(".who-we h2{color:#d9534f;}\n");
      out.write("/* cards*/\n");
      out.write(".cards-row{padding-top:70px; padding-bottom:50px; background:#eee}\n");
      out.write(".thumbnail{padding:0; border-radius:0; border:none; box-shadow:0 2px 2px 0 rgba(0,0,0,.14),0 3px 1px -2px rgba(0,0,0,.2),0 1px 5px 0 rgba(0,0,0,.12)}\n");
      out.write(".thumbnail>img{width:100%; display:block}\n");
      out.write(".thumbnail h3{font-size:26px; color:#336}\n");
      out.write(".thumbnail h3,.card-description{margin:0; padding:8px 0; border-bottom:solid 1px #eee; text-align:center}\n");
      out.write(".thumbnail p{padding-top:8px; font-size:20px}\n");
      out.write(".thumbnail .btn{border-radius:0; box-shadow:0 2px 5px 0 rgba(0,0,0,.16),0 2px 10px 0 rgba(0,0,0,.12); font-size:20px}\n");
      out.write(".team-pic{height:150px !important; width:150px !important; border-radius:50%; margin-top:-75px; box-shadow:0 2px 5px 0 rgba(0,0,0,.4),0 2px 10px 0 rgba(0,0,0,.5); transition:all .2s ease-out}\n");
      out.write(".thumbnail:hover .team-pic{height:200px !important; width:200px !important; margin-top:-100px}\n");
      out.write(".thumbnail p.social{padding-top:15px; text-align:center}\n");
      out.write(".social a{color:#FFF; font-size:18px !important}\n");
      out.write(".social i.fa{height:36px; width:36px; text-align:center; line-height:36px; background:#069; border-radius:50%}\n");
      out.write(".social i.fa.fa-facebook{background:#43609C}\n");
      out.write(".social i.fa.fa-twitter{background:#2CA8D2}\n");
      out.write(".social i.fa.fa-linkedin{background:#428099}\n");
      out.write(".social i.fa.fa-google-plus{background:#ce4d39}\n");
      out.write("\n");
      out.write("/* footer*/\n");
      out.write("#footer{background:#336; padding-top:30px; padding-bottom:30px; text-align:center; border-top:solid 4px #303}\n");
      out.write("#footer p{padding:10px; color:#fff}\n");
      out.write(".dont-remove{color:#fff !important; text-decoration:none !important; font-weight:700}\n");
      out.write(".rights{display:inline-block; border-top:solid 1px rgba(103, 58, 183, 0.3)}\n");
      out.write("\n");
      out.write("/* media */\n");
      out.write("@media (min-width:768px) { \n");
      out.write("header{ min-height: 100%} \n");
      out.write("header .wel{position:absolute; top:50%; transform:translateY(-50%); -moz-transform:translateY(-50%); -webkit-transform: translateY(-50%); -ms-transform: translateY(-50%); padding: 0 50px;}\n");
      out.write(".wel-info{max-width:850px; margin-left:auto; margin-right:auto} .who-we \n");
      out.write("h2{font-size:42px} .wel h1{font-size:65px} header .wel{font-size:26px} \n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid top_bar\" id=\"homeID\">\n");
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
      out.write("        <li><a href=\"buy_product.jsp\">Buy Products</a></li>\n");
      out.write("        <li><a href=\"sale_products.jsp\">Sale Products</a></li>\n");
      out.write("        <li class=\"active\"><a href=\"about_us.jsp\">About Us</a></li>\n");
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
      out.write("<!-- User Logout Button -->\n");
      out.write("\t<li ><a href=\"loginform.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<!--navigation section end -->\n");
      out.write("        <header id=\"full\">\n");
      out.write("<div class=\"abs-back\"></div>\n");
      out.write("<div class=\"wel\">\n");
      out.write("<div class=\"wel-info\">\n");
      out.write("\n");
      out.write("<h1>Know About Us</h1>\n");
      out.write("<span class=\"brk\"></span>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<div class=\"container who-we\">\n");
      out.write("\n");
      out.write("<div class=\"wel-info text-center\">\n");
      out.write("\n");
      out.write("<h2>Who We Are?</h2>\n");
      out.write("<span class=\"brk\"></span>\n");
      out.write("<p><b>we are Web Developer</b>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid cards-row\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"row\">\n");
      out.write("\n");
      out.write("  <div class=\"col-sm-6 col-md-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("     \n");
      out.write("       \n");
      out.write("      <div class=\"caption\">\n");
      out.write("        <h3>FrontEnd Developer</h3>\n");
      out.write("        <p class=\"card-description\">Kasim Siddiqui</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("    <div class=\"col-sm-6 col-md-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("      \n");
      out.write("        \n");
      out.write("      <div class=\"caption\">\n");
      out.write("        <h3>MiddleWare Developer</h3>\n");
      out.write("        <p class=\"card-description\">Kasim Siddiqui</p>\n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("    <div class=\"col-sm-6 col-md-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("      \n");
      out.write("       \n");
      out.write("      <div class=\"caption\">\n");
      out.write("        <h3>BackEnd Developer</h3>\n");
      out.write("        <p class=\"card-description\">Kasim Siddiqui</p>\n");
      out.write("          </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer id=\"footer\">\n");
      out.write("<div class=\"container\">\n");
      out.write("        <p class=\"social\"><a href=\"\"><i class=\"fa fa-facebook\"></i></a> <a href=\"\"><i class=\"fa fa-twitter\"></i></a> <a href=\"\"><i class=\"fa fa-linkedin\"></i></a> <a href=\"\"><i class=\"fa fa-google-plus\"></i></a></p>\n");
      out.write("\n");
      out.write("<p class=\"rights\"><!-- dont remove link --><a class=\"dont-remove\" href=\"http://webdeveloperbareilly.in\" target=\"_blank\">www.Salemaster.com</a></p>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</footer>\n");
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
