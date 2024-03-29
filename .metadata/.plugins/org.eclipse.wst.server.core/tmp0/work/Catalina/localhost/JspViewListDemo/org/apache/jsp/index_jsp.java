/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2018-02-26 11:53:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import entity.Items;
import dao.ItemsDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'index.jsp' starting page</title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t   div{\r\n");
      out.write("\t      float:left;\r\n");
      out.write("\t      margin: 10px;\r\n");
      out.write("\t   }\r\n");
      out.write("\t   div dd{\r\n");
      out.write("\t      margin:0px;\r\n");
      out.write("\t      font-size:10pt;\r\n");
      out.write("\t   }\r\n");
      out.write("\t   div dd.dd_name\r\n");
      out.write("\t   {\r\n");
      out.write("\t      color:blue;\r\n");
      out.write("\t   }\r\n");
      out.write("\t   div dd.dd_city\r\n");
      out.write("\t   {\r\n");
      out.write("\t      color:#000;\r\n");
      out.write("\t   }\r\n");
      out.write("\t</style>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <h1>商品展示</h1>\r\n");
      out.write("    <hr>\r\n");
      out.write("  \r\n");
      out.write("    <center>\r\n");
      out.write("    <table width=\"750\" height=\"60\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("          \r\n");
      out.write("          <!-- 商品循环开始 -->\r\n");
      out.write("           ");
 
               ItemsDAO itemsDao = new ItemsDAO(); 
               ArrayList<Items> list = itemsDao.getAllItems();
               if(list!=null&&list.size()>0)
               {
	               for(int i=0;i<list.size();i++)
	               {
	                  Items item = list.get(i);
           
      out.write("   \r\n");
      out.write("          <div>\r\n");
      out.write("             <dl>\r\n");
      out.write("               <dt>\r\n");
      out.write("                 <a href=\"details.jsp?id=");
      out.print(item.getId());
      out.write("\"><img src=\"images/");
      out.print(item.getPicture());
      out.write("\" width=\"120\" height=\"90\" border=\"1\"/></a>\r\n");
      out.write("               </dt>\r\n");
      out.write("               <dd class=\"dd_name\">");
      out.print(item.getName() );
      out.write("</dd> \r\n");
      out.write("               <dd class=\"dd_city\">产地:");
      out.print(item.getCity() );
      out.write("&nbsp;&nbsp;价格:￥ ");
      out.print(item.getPrice() );
      out.write("</dd> \r\n");
      out.write("             </dl>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- 商品循环结束 -->\r\n");
      out.write("        \r\n");
      out.write("          ");

                   }
              } 
          
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    </center>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
