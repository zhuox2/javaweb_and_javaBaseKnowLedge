/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.81
 * Generated at: 2018-02-27 16:21:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=gb2312");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n");
      com.wy.CountTime countTime = null;
      countTime = (com.wy.CountTime) _jspx_page_context.getAttribute("countTime", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (countTime == null){
        countTime = new com.wy.CountTime();
        _jspx_page_context.setAttribute("countTime", countTime, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td  height=\"80\" align=\"center\" background=\"image/1.jpg\">\r\n");
      out.write("\t\r\n");
      out.write("      <table height=\"80\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" background=\"image/2.jpg\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td width=\"787\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("\t  \r\n");
      out.write(" \t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" height=\"32\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" background=\"image/3.jpg\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table width=\"786\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" background=\"image/4.jpg\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <th width=\"189\" height=\"31\" align=\"center\">\r\n");
      out.write("       \r\n");
      out.write("        &nbsp; ");
      out.print(countTime.currentlyTime());
      out.write(" </th>\r\n");
      out.write("        <th width=\"597\" height=\"31\" align=\"center\"><a href=\"index.jsp\" class=\"a1\">本站首页</a>&nbsp;|&nbsp;<a href=\"active_select.jsp\" class=\"a1\">物流动态</a>&nbsp;|&nbsp;<a href=\"knowledge_select.jsp\" class=\"a1\">物流知识</a>&nbsp;|&nbsp;<a href=\"goods_select.jsp\" class=\"a1\">货物信息</a>&nbsp;|&nbsp;<a href=\"car_select.jsp\" class=\"a1\">车辆信息</a>&nbsp;|&nbsp;<a href=\"enterprise_select.jsp\" class=\"a1\">企业信息</a>&nbsp;|&nbsp;<a href=\"tool_assistant.jsp\" class=\"a1\">辅助工具</a>&nbsp;|&nbsp;<a href=\"logout.jsp\" class=\"a1\">退出</a></th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"100%\" height=\"115\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" background=\"image/5.jpg\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td valign=\"top\"><table width=\"787\" height=\"151\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" background=\"image/6.jpg\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td><table width=\"585\" align=\"right\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"577\" height=\"109\" valign=\"top\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
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