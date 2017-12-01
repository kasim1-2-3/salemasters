package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>AdminPanel</title>\n");
      out.write("\n");
      out.write("    <link media=\"all\" rel=\"stylesheet\" type=\"text/css\" href=\"css/all.css\" />\n");
      out.write("    <script type=\"text/javascript\" src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">window.jQuery || document.write('<script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"><\\/script>');</script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.main.js\"></script>\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/styleadmin.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("    <!-- font-awesome icons -->\n");
      out.write("    <link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/mystyle.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css\" />\n");
      out.write("    <!--[if lt IE 9]><link rel=\"stylesheet\" type=\"text/css\" href=\"css/ie.css\" /><![endif]-->\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write(".pagination {\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write(".pagination a {\n");
      out.write("    color: black;\n");
      out.write("    float: left;\n");
      out.write("    padding: 8px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pagination a.active {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pagination a:hover:not(.active) {background-color: #ddd;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <div class=\"c1\">\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <nav class=\"links\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\" class=\"ico2\">User Registered<span class=\"num\"><b id=\"RegisCount\">0</b></span></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"ico2\">Products<span class=\"num\"><b id=\"AdetalsCount\">0</b></span></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"ico2\">User Products<span class=\"num\"><b id=\"usds\">0</b></span></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"ico2\">User Car Booking<span class=\"num\" id=\"bdc\">0</span></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"ico1\">Contact Us<span class=\"num\"><b id=\"contctCount\">0</b></span></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                    <div class=\"profile-box\">\n");
      out.write("                        <span class=\"profile\">\n");
      out.write("                            <a href=\"#\" class=\"section\">\n");
      out.write("                               \n");
      out.write("                                <span class=\"text-box\">\n");
      out.write("                                    Welcome\n");
      out.write("                                    <strong class=\"name\">Kasim Siddiqui</strong>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#\" class=\"opener\">opener</a>\n");
      out.write("                        </span>\n");
      out.write("                        <a href=\"loginform.jsp\" class=\"btn-on\">On</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"tabs\">\n");
      out.write("                    <!--tab 1 started-->\n");
      out.write("                    <div id=\"tab-1\" class=\"tab\">\n");
      out.write("                        <article>\n");
      out.write("                            <div class=\"text-section\">\n");
      out.write("                                <h1>Dashboard</h1>\n");
      out.write("                                <p>Seel All Detail at Here</p>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"states\">\n");
      out.write("                                <!-- four-grids -->\n");
      out.write("                                <div class=\"row four-grids\" style=\"margin-left: 20px;\">\n");
      out.write("                                    <div class=\"col-md-3 ticket-grid\" style=\"width: 20%\">\n");
      out.write("                                        <div class=\"tickets\">\n");
      out.write("                                            <div class=\"grid-left\">\n");
      out.write("                                                <div class=\"book-icon\">\n");
      out.write("                                                    <i class=\"fa fa-book\"></i>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"grid-right\">\n");
      out.write("                                                <h3>User <span>Registerd</span></h3><br><br>\n");
      out.write("                                                <p><b id=\"rc\">0</b></p><br><br>\n");
      out.write("                                                <button type=\"submit\" onclick=\"countImg()\" style=\"width:100%\">Get Data</button>\n");
      out.write("                                                <script>\n");
      out.write("                                                    function countImg() {\n");
      out.write("                                                        var ccd = document.getElementById(\"RegisU\").getElementsByTagName(\"tr\").length;\n");
      out.write("                                                        document.getElementById(\"rc\").innerHTML = ccd - 2;\n");
      out.write("\n");
      out.write("                                                    }\n");
      out.write("                                                </script>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"clearfix\"> </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-3 ticket-grid\" style=\"width: 20%\">\n");
      out.write("                                        <div class=\"tickets\">\n");
      out.write("                                            <div class=\"grid-left\">\n");
      out.write("                                                <div class=\"book-icon\">\n");
      out.write("                                                    <i class=\"fa fa-bar-chart\"></i>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"grid-right\">\n");
      out.write("                                                <h3>Products</h3><br><br>\n");
      out.write("                                                <p><b id=\"cpo\">0</b></p><br><br>\n");
      out.write("                                                <button type=\"submit\" style=\"width: 100%\" onclick=\"myPro()\">Get Data</button>\n");
      out.write("                                                <script>\n");
      out.write("                                                    function myPro() {\n");
      out.write("                                                        var ccd = document.getElementById(\"AdminTabDL\").getElementsByTagName(\"tr\").length;\n");
      out.write("                                                        document.getElementById(\"cpo\").innerHTML = ccd - 2;\n");
      out.write("\n");
      out.write("                                                    }\n");
      out.write("                                                </script>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"clearfix\"> </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-3 ticket-grid\" style=\"width: 20%\">\n");
      out.write("                                        <div class=\"tickets\">\n");
      out.write("                                            <div class=\"grid-left\">\n");
      out.write("                                                <div class=\"book-icon\">\n");
      out.write("                                                    <i class=\"fa fa-rocket\"></i>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"grid-right\">\n");
      out.write("                                                <h3>User Products</h3><br><br>\n");
      out.write("                                                <p><b id=\"upd\">0</b></p><br><br>\n");
      out.write("                                                <button type=\"submit\" style=\"width: 100%\" onclick=\"myUp()\">Get Data</button>\n");
      out.write("                                                <script>\n");
      out.write("                                                    function myUp() {\n");
      out.write("                                                        var ccd = document.getElementById(\"ste\").getElementsByTagName(\"tr\").length;\n");
      out.write("                                                        document.getElementById(\"upd\").innerHTML = ccd - 2;\n");
      out.write("\n");
      out.write("                                                    }\n");
      out.write("                                                </script>                                               \n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"clearfix\"> </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-3 ticket-grid\" style=\"width: 20%\">\n");
      out.write("                                        <div class=\"tickets\">\n");
      out.write("                                            <div class=\"grid-left\">\n");
      out.write("                                                <div class=\"book-icon\">\n");
      out.write("                                                    <i class=\"fa fa-rocket\"></i>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"grid-right\">\n");
      out.write("                                                <h3>User Car Booking</h3><br><br>\n");
      out.write("                                                <p><b id=\"ucbd\">0</b></p><br><br>\n");
      out.write("                                                <button type=\"submit\" style=\"width: 100%\" onclick=\"myCbd()\">Get Data</button>\n");
      out.write("                                                <script>\n");
      out.write("                                                    function myCbd() {\n");
      out.write("                                                        var ccd = document.getElementById(\"bdi\").getElementsByTagName(\"tr\").length;\n");
      out.write("                                                        document.getElementById(\"ucbd\").innerHTML = ccd - 2;\n");
      out.write("\n");
      out.write("                                                    }\n");
      out.write("                                                </script>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"clearfix\"> </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-3 ticket-grid\" style=\"width: 20%\">\n");
      out.write("                                        <div class=\"tickets\">\n");
      out.write("                                            <div class=\"grid-left\">\n");
      out.write("                                                <div class=\"book-icon\">\n");
      out.write("                                                    <i class=\"fa fa-user\"></i>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"grid-right\">\n");
      out.write("                                                <h3>Contact Us</h3><br><br>\n");
      out.write("                                                <p><b id=\"maco\">0</b></p><br><br>\n");
      out.write("                                                <button type=\"submit\" style=\"width: 100%\" onclick=\"gco()\">Get Data</button>\n");
      out.write("                                                <script>\n");
      out.write("                                                    function gco() {\n");
      out.write("                                                        var ccd = document.getElementById(\"ContactUsTable\").getElementsByTagName(\"tr\").length;\n");
      out.write("                                                        document.getElementById(\"maco\").innerHTML = ccd - 2;\n");
      out.write("\n");
      out.write("                                                    }\n");
      out.write("                                                </script>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"clearfix\"> </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clearfix\"> </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- //four-grids -->\n");
      out.write("                            </ul>\n");
      out.write("                        </article>\n");
      out.write("                    </div> <!--tab 1 end-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--tab 2 started-->\n");
      out.write("                    <div id=\"tab-2\" class=\"tab\">\n");
      out.write("                        <article>\n");
      out.write("                            <div class=\"text-section\">\n");
      out.write("                                <h1>Upload Image</h1>\n");
      out.write("                                <p>You have to upload image here for products.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"states\">\n");
      out.write("                                <div>\n");
      out.write("                                    <form id=\"upload-image-form\" action=\"AdminImgData\" method=\"post\" enctype=\"multipart/form-data\" style=\"border:1px solid\"><br><br>\n");
      out.write("                                        <div id=\"image-preview-div\" style=\"display: none\">\n");
      out.write("                                            <label for=\"exampleInputFile\">Selected image:</label>\n");
      out.write("                                            <br>\n");
      out.write("                                            <img id=\"preview-img\" src=\"noimage\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"file\" name=\"file21\" id=\"file\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                        <button class=\"btn btn-primary\" id=\"upload-button\" type=\"submit\" style=\"width: 10%\">Upload image</button>\n");
      out.write("                                    </form><br><br>\n");
      out.write("                                    <br>\n");
      out.write("                                    <div class=\"alert alert-info\" id=\"loading\" style=\"display: none;\" role=\"alert\">\n");
      out.write("                                        Uploading image...\n");
      out.write("                                        <div class=\"progress\">\n");
      out.write("                                            <div class=\"progress-bar progress-bar-striped active\" role=\"progressbar\" aria-valuenow=\"45\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 100%\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"message\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <li class=\"error\">Error : This is an error placed text message.</li>\n");
      out.write("                                <li class=\"warning\">Warning: This is a warning placed text message.</li>\n");
      out.write("                                <li class=\"succes\">Succes : This is a succes placed text message.</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </article>\n");
      out.write("                    </div>\n");
      out.write("                    <!--tab 2 End-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--tab 3 started-->\n");
      out.write("                    <div id=\"tab-3\" class=\"tab\">\n");
      out.write("                        <article>\n");
      out.write("                            <div class=\"text-section\">\n");
      out.write("                                <h1>Product Details</h1>\n");
      out.write("                                <p>Please fill all details about product inside the form</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"container\" style=\"width:50%;\">    \n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-4\" style=\"margin-left:200px;\">\n");
      out.write("                                        <div class=\"panel panel-primary\">\n");
      out.write("                                            <div class=\"panel-heading\">Fill All Details of Car</div>\n");
      out.write("                                            <form action=\"admincdsuccess.jsp\">\n");
      out.write("                                                <div class=\"container\" style=\"width:190%;\"><br>\n");
      out.write("                                                    <label><b>Car Name : </b></label><br>\n");
      out.write("                                                    <input type=\"text\" placeholder=\"Enter Car Name\" requires name=\"cname\" /><br><br>\n");
      out.write("                                                    <label><b>Ex-Showroom Price : </b></label><br>\n");
      out.write("                                                    <input type=\"text\" placeholder=\"Enter Ex-Showroom Price\" required  name=\"csprice\"/><br><br>\n");
      out.write("                                                    <label><b>RTO Price : </b></label><br>\n");
      out.write("                                                    <input type=\"text\" placeholder=\"Enter RTO Price\" required  name=\"crto\"/><br><br>\n");
      out.write("                                                    <label><b>Insurance Price : </b></label><br>\n");
      out.write("                                                    <input type=\"text\" placeholder=\"Enter Insurance Price\" required  name=\"cinsurance\"/><br><br>\n");
      out.write("                                                    <label><b>Other Charges : </b></label><br>\n");
      out.write("                                                    <input type=\"text\" placeholder=\"Enter Other Charges\" required  name=\"cocharge\"/><br><br>                                                 \n");
      out.write("                                                    <label><b>Car on EMI : </b></label><br>\n");
      out.write("                                                    <input type=\"text\" placeholder=\"Enter EMI\" required name=\"cemi\"/><br><br>\n");
      out.write("                                                    <label><b>Car on Road Price : </b></label><br>\n");
      out.write("                                                    <input type=\"text\" placeholder=\"Enter Road Price\" required name=\"croadp\"/><br><br>\n");
      out.write("                                                    <label><b>Car Registration Year: </b></label><br>\n");
      out.write("                                                    <input type=\"text\" placeholder=\"Enter Registration Year\" required name=\"cryear\"/><br><br>\n");
      out.write("                                                    <label><b>Car Brand/Model : </b></label><br>\n");
      out.write("                                                    <input type=\"text\" placeholder=\"Enter Brand/Model\" required name=\"cbrand\"/><br><br>\n");
      out.write("                                                    <label><b>Car Color : </b></label><br>\n");
      out.write("                                                    <input type=\"text\" placeholder=\"Enter Color\" required name=\"ccolor\"/><br><br>\n");
      out.write("                                                    <label><b>Car Ownership : </b></label><br>\n");
      out.write("                                                    <input type=\"text\" placeholder=\"Enter Ownership\" required name=\"cownership\"/><br><br>\n");
      out.write("\n");
      out.write("                                                    <button type=\"submit\" style=\"width: 10%\">Submit</button>\n");
      out.write("                                                </div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </article>\n");
      out.write("                    </div>\n");
      out.write("                    <!--tab 3 end-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--tab 4 started-->\n");
      out.write("                    <div id=\"tab-4\" class=\"tab\">\n");
      out.write("                        <article>\n");
      out.write("                            <div class=\"text-section\">\n");
      out.write("                                <h1>All User Details</h1>\n");
      out.write("                                <p>There are all detail of the users.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"states\">\n");
      out.write("                                ");

                                    String id = request.getParameter("mail");
                                    String driverName = "org.apache.derby.jdbc.ClientDriver";
                                    String connectionUrl = "jdbc:derby://localhost:1527/";
                                    String dbName = "sample";
                                    String userId = "app";
                                    String password = "app";

                                    try {
                                        Class.forName(driverName);
                                    } catch (ClassNotFoundException e) {
                                        e.printStackTrace();
                                    }

                                    Connection connection = null;
                                    Statement statement = null;
                                    ResultSet resultSet = null;
                                
      out.write("\n");
      out.write("                                <h2 align=\"center\"><font><strong>All Registered Users Detail</strong></font></h2><br><br>\n");
      out.write("                                <table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"1\"id=\"RegisU\" >\n");
      out.write("                                    <tr>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr bgcolor=\"#808B96\" style=\"color:white\">\n");
      out.write("                                        <td><b>Name</b></td>\n");
      out.write("                                        <td><b>Contact</b></td>\n");
      out.write("                                        <td><b>Email-Id</b></td>\n");
      out.write("                                        <td><b>Password</b></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");

                                        try {
                                            connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
                                            statement = connection.createStatement();
                                            String sql = "SELECT * FROM registerdata";

                                            resultSet = statement.executeQuery(sql);
                                            while (resultSet.next()) {
                                    
      out.write("\n");
      out.write("                                    <tr bgcolor=\"#DEB887\" style=\"color:white\">\n");
      out.write("\n");
      out.write("                                        <td>");
      out.print(resultSet.getString("name"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(resultSet.getString("contact"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(resultSet.getString("mail"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(resultSet.getString("pass"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    ");

                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                                <div class=\"pagination\">\n");
      out.write("                                    <a href=\"#\">&laquo;</a>\n");
      out.write("                                    <a href=\"#\">1</a>\n");
      out.write("                                    <a class=\"active\" href=\"#\">2</a>\n");
      out.write("                                    <a href=\"#\">3</a>\n");
      out.write("                                    <a href=\"#\">4</a>\n");
      out.write("                                    <a href=\"#\">5</a>\n");
      out.write("                                    <a href=\"#\">6</a>\n");
      out.write("                                    <a href=\"#\">&raquo;</a>\n");
      out.write("                                </div>\n");
      out.write("                                <center><button type=\"submit\" style=\"width: 10%\" onclick=\"myRegisUser()\">Count Data</button></center>\n");
      out.write("                                <script>\n");
      out.write("                                    function myRegisUser() {\n");
      out.write("                                        var ccd = document.getElementById(\"RegisU\").getElementsByTagName(\"tr\").length;\n");
      out.write("                                        document.getElementById(\"RegisCount\").innerHTML = ccd - 2;\n");
      out.write("                                    }\n");
      out.write("                                </script>\n");
      out.write("                            </ul>\n");
      out.write("                        </article>\n");
      out.write("                    </div>\n");
      out.write("                    <!--tab 4 end-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--tab 5 started-->\n");
      out.write("                    <div id=\"tab-5\" class=\"tab\">\n");
      out.write("                        <article>\n");
      out.write("                            <div class=\"text-section\">\n");
      out.write("                                <h1>All Product Details</h1>\n");
      out.write("                                <p>There are detail of All Cars</p>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"states\">\n");
      out.write("                                ");

                                    String idcd = request.getParameter("cemi");
                                    String driverNamecd = "org.apache.derby.jdbc.ClientDriver";
                                    String connectionUrlcd = "jdbc:derby://localhost:1527/";
                                    String dbNamecd = "sample";
                                    String userIdcd = "app";
                                    String passwordcd = "app";

                                    try {
                                        Class.forName(driverNamecd);
                                    } catch (ClassNotFoundException e) {
                                        e.printStackTrace();
                                    }

                                    Connection connectioncd = null;
                                    Statement statementcd = null;
                                    ResultSet resultSetcd = null;
                                
      out.write("\n");
      out.write("                                <h2 align=\"center\"><font><strong>All Cars Detail Store by Admin</strong></font></h2><br><br>\n");
      out.write("                                <table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"1\" id=\"AdminTabDL\">\n");
      out.write("                                    <tr>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr bgcolor=\"#808B96\" style=\"color:white\">\n");
      out.write("                                        <td><b>Car Name</b></td>\n");
      out.write("                                        <td><b>Car Ex-Showroom Price</b></td>\n");
      out.write("                                        <td><b>RTO Charge</b></td>\n");
      out.write("                                        <td><b>Insurance Charge</b></td>\n");
      out.write("                                        <td><b>Other Charge</b></td>\n");
      out.write("                                        <td><b>Car EMI</b></td>\n");
      out.write("                                        <td><b>Car on Road Price</b></td>\n");
      out.write("                                        <td><b>Car Registration Year</b></td>\n");
      out.write("                                        <td><b>Car Brand/Model</b></td>\n");
      out.write("                                        <td><b>Car Color</b></td>\n");
      out.write("                                        <td><b>Car Ownership</b></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");

                                        try {
                                            connectioncd = DriverManager.getConnection(connectionUrlcd + dbNamecd, userIdcd, passwordcd);
                                            statementcd = connection.createStatement();
                                            String sqlcd = "SELECT * FROM admincdl";

                                            resultSetcd = statement.executeQuery(sqlcd);
                                            while (resultSetcd.next()) {
                                    
      out.write("\n");
      out.write("                                    <tr bgcolor=\"#DEB887\" style=\"color:white\">\n");
      out.write("\n");
      out.write("                                        <td>");
      out.print(resultSetcd.getString("cname"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(resultSetcd.getString("csprice"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(resultSetcd.getString("crto"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(resultSetcd.getString("cinsurance"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(resultSetcd.getString("cocharge"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(resultSetcd.getString("cemi"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(resultSetcd.getString("croadp"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(resultSetcd.getString("cryear"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(resultSetcd.getString("cbrand"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(resultSetcd.getString("ccolor"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(resultSetcd.getString("cownership"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    ");

                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                                <center><button type=\"submit\" style=\"width: 10%\" onclick=\"myAdl()\">Count Data</button></center>\n");
      out.write("                                <script>\n");
      out.write("                                    function myAdl() {\n");
      out.write("                                        var ccd = document.getElementById(\"AdminTabDL\").getElementsByTagName(\"tr\").length;\n");
      out.write("                                        document.getElementById(\"AdetalsCount\").innerHTML = ccd - 2;\n");
      out.write("\n");
      out.write("                                    }\n");
      out.write("                                </script>\n");
      out.write("                            </ul>\n");
      out.write("                        </article>\n");
      out.write("                    </div>\n");
      out.write("                    <!--tab 5 end-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--tab 6 started-->\n");
      out.write("                    <div id=\"tab-6\" class=\"tab\">\n");
      out.write("                        <article>\n");
      out.write("                            <div class=\"text-section\">\n");
      out.write("                                <h1>All Sale Details</h1>\n");
      out.write("                                <p>This is a quick overview of some features</p>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"states\">\n");
      out.write("                                ");

                                    String sid = request.getParameter("cry");
                                    String sdriverName = "org.apache.derby.jdbc.ClientDriver";
                                    String sconnectionUrl = "jdbc:derby://localhost:1527/";
                                    String sdbName = "sample";
                                    String suserId = "app";
                                    String spassword = "app";

                                    try {
                                        Class.forName(sdriverName);
                                    } catch (ClassNotFoundException e) {
                                        e.printStackTrace();
                                    }

                                    Connection sconnection = null;
                                    Statement sstatement = null;
                                    ResultSet sresultSet = null;
                                
      out.write("\n");
      out.write("                                <h2 align=\"center\"><font><strong>All Products Detail for Sale by User Inserted</strong></font></h2><br><br>\n");
      out.write("                                <table align=\"center\" cellpadding=\"1\" cellspacing=\"2\" border=\"1\" id=\"ste\">\n");
      out.write("                                    <tr>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr bgcolor=\"#808B96\" style=\"color:white;overflow-x:auto;\">\n");
      out.write("                                        <td><b>Car_Registration_Year</b></td>\n");
      out.write("                                        <td><b>Car Brand</b></td>\n");
      out.write("                                        <td><b>Car Varient</b></td>\n");
      out.write("                                        <td><b>Kilometer Driven</b></td>\n");
      out.write("                                        <td><b>Car Color</b></td>\n");
      out.write("                                        <td><b>Car Ownership</b></td>\n");
      out.write("                                        <td><b>City</b></td>\n");
      out.write("                                        <td><b>Pincode</b></td>\n");
      out.write("                                        <td><b>Expected Price</b></td>\n");
      out.write("                                        <td><b>Seller Name</b></td>\n");
      out.write("                                        <td><b>Seller Mail</b></td>\n");
      out.write("                                        <td><b>Seller Contact</b></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");

                                        try {
                                            sconnection = DriverManager.getConnection(sconnectionUrl + sdbName, suserId, spassword);
                                            sstatement = sconnection.createStatement();
                                            String ssql = "SELECT * FROM salersellingdata";

                                            sresultSet = sstatement.executeQuery(ssql);
                                            while (sresultSet.next()) {
                                    
      out.write("\n");
      out.write("                                    <tr bgcolor=\"#DEB887\" style=\"color:white\">\n");
      out.write("\n");
      out.write("                                        <td>");
      out.print(sresultSet.getString("cry"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(sresultSet.getString("cb"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(sresultSet.getString("cv"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(sresultSet.getString("ckd"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(sresultSet.getString("cc"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(sresultSet.getString("co"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(sresultSet.getString("ccity"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(sresultSet.getString("cpin"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(sresultSet.getString("xe"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(sresultSet.getString("naam"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(sresultSet.getString("gmail"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(sresultSet.getString("mobile"));
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    ");

                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                                <center><button type=\"submit\" style=\"width: 10%\" onclick=\"mus()\">Count Data</button></center>\n");
      out.write("                                <script>\n");
      out.write("                                    function mus() {\n");
      out.write("                                        var usd = document.getElementById(\"ste\").getElementsByTagName(\"tr\").length;\n");
      out.write("                                        document.getElementById(\"usds\").innerHTML = usd - 2;\n");
      out.write("\n");
      out.write("                                    }\n");
      out.write("                                </script>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </article>\n");
      out.write("                    </div>\n");
      out.write("                    <!--tab 6 end-->\n");
      out.write("\n");
      out.write("                    <!--tab 7 started-->\n");
      out.write("                    <div id=\"tab-7\" class=\"tab\">\n");
      out.write("                        <article>\n");
      out.write("                            <div class=\"text-section\">\n");
      out.write("                                <h1>All Contact_us Details</h1>\n");
      out.write("                                <p>Detail of the users who want to Contact Us</p>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"states\">\n");
      out.write("                                ");

                                    String cuid = request.getParameter("name");
                                    String cudriverName = "org.apache.derby.jdbc.ClientDriver";
                                    String cuconnectionUrl = "jdbc:derby://localhost:1527/";
                                    String cudbName = "sample";
                                    String cuuserId = "app";
                                    String cupassword = "app";

                                    try {
                                        Class.forName(cudriverName);
                                    } catch (ClassNotFoundException e) {
                                        e.printStackTrace();
                                    }

                                    Connection cuconnection = null;
                                    Statement custatement = null;
                                    ResultSet curesultSet = null;
                                
      out.write("\n");
      out.write("                                <h2 align=\"center\"><font><strong>All Users Details who want to Contact Us</strong></font></h2><br><br>\n");
      out.write("                                <table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"1\" id=\"ContactUsTable\">\n");
      out.write("                                    <tr>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr bgcolor=\"#808B96\" style=\"color:white\">\n");
      out.write("                                        <td><b>Name</b></td>\n");
      out.write("                                        <td><b>Contact</b></td>\n");
      out.write("                                        <td><b>Email</b></td>\n");
      out.write("                                        <td><b>Message</b></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");

                                        try {
                                            connectioncd = DriverManager.getConnection(cuconnectionUrl + cudbName, cuuserId, cupassword);
                                            custatement = connection.createStatement();
                                            String cusql = "SELECT * FROM contactus";

                                            curesultSet = custatement.executeQuery(cusql);
                                            while (curesultSet.next()) {
                                    
      out.write("\n");
      out.write("                                    <tr bgcolor=\"#DEB887\" style=\"color:white\">\n");
      out.write("\n");
      out.write("                                        <td>");
      out.print(curesultSet.getString("name"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(curesultSet.getString("contact"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(curesultSet.getString("email"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(curesultSet.getString("message"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    ");

                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    
      out.write("\n");
      out.write("                                </table>\n");
      out.write("\n");
      out.write("                                <center><button type=\"submit\" style=\"width: 10%\" onclick=\"myContact()\">Count Data</button></center>\n");
      out.write("                                <script>\n");
      out.write("                                    function myContact() {\n");
      out.write("                                        var ccd = document.getElementById(\"ContactUsTable\").getElementsByTagName(\"tr\").length;\n");
      out.write("                                        document.getElementById(\"contctCount\").innerHTML = ccd - 2;\n");
      out.write("\n");
      out.write("                                    }\n");
      out.write("                                </script>\n");
      out.write("                            </ul>\n");
      out.write("                        </article>\n");
      out.write("                    </div>\n");
      out.write("                    <!--tab 7 end-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!--tab 8 started-->\n");
      out.write("                    <div id=\"tab-8\" class=\"tab\">\n");
      out.write("                        <article>\n");
      out.write("                            <div class=\"text-section\">\n");
      out.write("                                <h1>All Buyers Detail</h1>\n");
      out.write("                                <p>There are details of the buyer who want to buy car</p>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"states\">\n");
      out.write("\n");
      out.write("                                ");

                                    String bduid = request.getParameter("name");
                                    String bddriverName = "org.apache.derby.jdbc.ClientDriver";
                                    String bdconnectionUrl = "jdbc:derby://localhost:1527/";
                                    String bddbName = "sample";
                                    String bduserId = "app";
                                    String bdpassword = "app";

                                    try {
                                        Class.forName(bddriverName);
                                    } catch (ClassNotFoundException e) {
                                        e.printStackTrace();
                                    }

                                    Connection bdconnection = null;
                                    Statement bdstatement = null;
                                    ResultSet bdresultSet = null;
                                
      out.write("\n");
      out.write("                                <h2 align=\"center\"><font><strong>All Buyers Detail who want to Buy Car</strong></font></h2><br><br>\n");
      out.write("                                <table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"1\" id=\"bdi\">\n");
      out.write("                                    <tr>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr bgcolor=\"#808B96\" style=\"color:white\">\n");
      out.write("                                        <td><b>Buyer Name</b></td>\n");
      out.write("                                        <td><b>Buyer Email</b></td>\n");
      out.write("                                        <td><b>Buyer Contact</b></td>\n");
      out.write("                                        <td><b>Buyer Message</b></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");

                                        try {
                                            bdconnection = DriverManager.getConnection(bdconnectionUrl + bddbName, bduserId, bdpassword);
                                            bdstatement = bdconnection.createStatement();
                                            String bdsql = "SELECT * FROM finalbooking";

                                            bdresultSet = bdstatement.executeQuery(bdsql);
                                            while (bdresultSet.next()) {
                                    
      out.write("\n");
      out.write("                                    <tr bgcolor=\"#DEB887\" style=\"color:white\">\n");
      out.write("\n");
      out.write("                                        <td>");
      out.print(bdresultSet.getString("bname"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(bdresultSet.getString("bemail"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(bdresultSet.getString("bnumber"));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(bdresultSet.getString("bcomment"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    ");

                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                                <center><button type=\"submit\" style=\"width: 10%\" onclick=\"bsd()\">Count Data</button></center>\n");
      out.write("                                <script>\n");
      out.write("                                    function bsd() {\n");
      out.write("                                        var usd = document.getElementById(\"bdi\").getElementsByTagName(\"tr\").length;\n");
      out.write("                                        document.getElementById(\"bdc\").innerHTML = usd - 2;\n");
      out.write("\n");
      out.write("                                    }\n");
      out.write("                                </script>                            </ul>\n");
      out.write("                        </article>\n");
      out.write("                    </div>\n");
      out.write("                    <!--tab 8 end-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <aside id=\"sidebar\">\n");
      out.write("            <strong class=\"logo\"><a href=\"#\">lg</a></strong>\n");
      out.write("            <ul class=\"tabset buttons\">\n");
      out.write("                <li class=\"active\">\n");
      out.write("                    <a href=\"#tab-1\" class=\"ico1\"><span>Dashboard</span><em></em></a>\n");
      out.write("                    <span class=\"tooltip\"><span>Dashboard</span></span>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#tab-2\" class=\"ico2\"><span>Upload Image</span><em></em></a>\n");
      out.write("                    <span class=\"tooltip\"><span>Image Upload</span></span>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#tab-3\" class=\"ico3\"><span>Upload Product Details</span><em></em></a>\n");
      out.write("                    <span class=\"tooltip\"><span>Upload Product Details</span></span>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#tab-4\" class=\"ico4\"><span>All User Details</span><em></em></a>\n");
      out.write("                    <span class=\"tooltip\"><span>All User Details</span></span>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#tab-5\" class=\"ico5\"><span>All Car Details</span><em></em></a>\n");
      out.write("                    <span class=\"tooltip\"><span>All Car Details</span></span>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#tab-6\" class=\"ico6\">\n");
      out.write("                        <span>All Sale Details</span><em></em>\n");
      out.write("                    </a>\n");
      out.write("                    <span class=\"tooltip\"><span>All Sale Details</span></span>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#tab-7\" class=\"ico7\"><span>All Contact us Details</span><em></em></a>\n");
      out.write("                    <span class=\"tooltip\"><span>All Contact us Details</span></span>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#tab-8\" class=\"ico8\"><span>All Buyers Detail</span><em></em></a>\n");
      out.write("                    <span class=\"tooltip\"><span>All Buyers Detail</span></span>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <span class=\"shadow\"></span>\n");
      out.write("        </aside>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
