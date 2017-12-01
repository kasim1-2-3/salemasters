package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admincdsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.kasim.AdminCarDetail myAdminBean = null;
      synchronized (session) {
        myAdminBean = (org.kasim.AdminCarDetail) _jspx_page_context.getAttribute("myAdminBean", PageContext.SESSION_SCOPE);
        if (myAdminBean == null){
          try {
            myAdminBean = (org.kasim.AdminCarDetail) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "org.kasim.AdminCarDetail");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "org.kasim.AdminCarDetail", exc);
          }
          _jspx_page_context.setAttribute("myAdminBean", myAdminBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("myAdminBean"), "cname", request.getParameter("cname"), request, "cname", false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("myAdminBean"), "csprice", request.getParameter("csprice"), request, "csprice", false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("myAdminBean"), "crto", request.getParameter("crto"), request, "crto", false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("myAdminBean"), "cinsurance", request.getParameter("cinsurance"), request, "cinsurance", false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("myAdminBean"), "cocharge", request.getParameter("cocharge"), request, "cocharge", false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("myAdminBean"), "cemi", request.getParameter("cemi"), request, "cemi", false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("myAdminBean"), "croadp", request.getParameter("croadp"), request, "croadp", false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("myAdminBean"), "cryear", request.getParameter("cryear"), request, "cryear", false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("myAdminBean"), "cbrand", request.getParameter("cbrand"), request, "cbrand", false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("myAdminBean"), "ccolor", request.getParameter("ccolor"), request, "ccolor", false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("myAdminBean"), "cownership", request.getParameter("cownership"), request, "cownership", false);
      out.write("\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            var a=myAdminBean.store();\n");
      out.write("            if(a === 1){\n");
      out.write("            alert(\"Registration Successfully\");\n");
      out.write("        }else {\n");
      out.write("            alert(\"Registration Failed\");\n");
      out.write("        }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        ");
        
        int a=myAdminBean.store();
        if(a==1){
            //out.print("Value Stored");
        }else {
            //out.print("Value not Stored");
        }
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            response.sendRedirect("admin.jsp");
            
            
      out.write("\n");
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
