/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-03-11 06:00:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sathya.tech.Productdao;
import java.util.Base64;

public final class __0020editform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1709622881131L));
    _jspx_dependants.put("jar:file:/D:/advancejavaprograms/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ProductManagement/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425958870000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.sathya.tech.Productdao");
    _jspx_imports_classes.add("java.util.Base64");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<title>Add product</title>\r\n");
      out.write("<!--Bootstrap CDN link to get the support of Bootstrap -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("	<script src=\"formvalidation.js\"></script>\r\n");
      out.write("	\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container mt-5 text-center\">\r\n");
      out.write("		<h1 class=\"text-center font-italic mb-1\">EDIT FORM</h1>\r\n");
      out.write("		<form method=\"post\" action=\"./UpdateServlet\" enctype=\"multipart/form-data\" onsubmit=\"return validateform()\">\r\n");
      out.write("		\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("    		<label class=\"font-italic font-weight-bold\" for=\"prodId\">Product ID</label>\r\n");
      out.write("    		<input type=\"text\" class=\"form-control-sm\" id=\"prodId\" name=\"proId\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${existingproduct.proId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"  required>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label class=\"font-italic font-weight-bold\"\r\n");
      out.write("					for=\"proname\">Product name</label>\r\n");
      out.write("				<input type=\"text\" class=\"form-control-sm\" id=\"prodname\"\r\n");
      out.write("					name=\"proname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${existingproduct.proName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label class=\"font-italic font-weight-bold\"\r\n");
      out.write("					for=\"proprice\">Product price</label>\r\n");
      out.write("				<input type=\"text\" class=\"form-control-sm\" id=\"prodprice\"\r\n");
      out.write("					name=\"proprice\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${existingproduct.proprice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label class=\"font-italic font-weight-bold\"\r\n");
      out.write("					for=\"probrand\">Product Brand</label>\r\n");
      out.write("				<input type=\"text\" class=\"form-control-sm\" id=\"prodbrand\"\r\n");
      out.write("					name=\"probrand\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${existingproduct.proBrand}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label class=\"font-italic font-weight-bold\"\r\n");
      out.write("					for=\"promadein\">Product MadeIn</label>\r\n");
      out.write("				<input type=\"text\" class=\"form-control-sm\" id=\"promadein\"\r\n");
      out.write("					name=\"promadein\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${existingproduct.proMadeIn}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"   required>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label class=\"font-italic font-weight-bold\"\r\n");
      out.write("					for=\"promfg\">Product MFG DATE</label>\r\n");
      out.write("				<input type=\"date\" class=\"form-control-sm\" id=\"promfg\"\r\n");
      out.write("					name=\"promfg\"   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${existingproduct.proMfgDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"  required>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label class=\"font-italic font-weight-bold\"\r\n");
      out.write("					for=\"proexpy\">Product EXPIRY DATE</label>\r\n");
      out.write("				<input type=\"date\" class=\"form-control-sm\" id=\"proexpy\"\r\n");
      out.write("					name=\"proexpy\"   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${existingproduct.proExpDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"  required>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<!-- Display the current product  image -->\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("				<label class=\"font-italic font-weight-bold\"\r\n");
      out.write("					for=\"proimage\">current Image</label>\r\n");
      out.write("				<image id=\"currentImage\"\r\n");
      out.write("					src=\"data:image/jpeg;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Base64.getEncoder().encodeToString(existingproduct.proImage)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"current product image\" \r\n");
      out.write("							style=\"max-widht: 100px; max-height: 100px;\">\r\n");
      out.write("				<input type=\"hidden\" class=\"form-control-sm\" id=\"existingImage\"\r\n");
      out.write("					name=\"existingImage\" accept=\"image/*\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Base64.getEncoder().encodeToString(existingproduct.proImage)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<!-- Allow the user to upload a new image -->\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"form-group\">\r\n");
      out.write("			<label class=\"font-italic font-weight-bold\" for=\"newproImage\">New product</label>\r\n");
      out.write("			<input type=\"file\" class=\"form-control-file-sm\" id=\"newImage\" name=\"newproImage\"\r\n");
      out.write("			  accept=\"image/*\">\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div>\r\n");
      out.write("				<input type=\"submit\" class=\"btn btn-success\" value=\"update product\"/>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html> ");
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