package com.vmwork.pw1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "simpleHttpServlet", value = "/simple-Http-Servlet")
public class SimpleHttpServlet extends HttpServlet {
  public int counter = 0;

  public void init() {
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html");

    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    out.println("<ul>");
    out.println("Метод getContextPath(): " + request.getContextPath() + "<br/>");
    out.println("Метод getServletPath(): " + request.getServletPath() + "<br/>");
    out.println("Метод getPathInfo(): " + request.getPathInfo() + "<br/>");
    out.println("Метод getQueryString(): " + request.getQueryString() + "<br/>");
    out.println("Метод getParameter(param1): " + request.getParameter("param1") + "<br/>");
    out.println("Метод getParameter(param2): " + request.getParameter("param2") + "<br/>");
    out.println("Метод getHeader(User-Agent): " + request.getHeader("User-Agent") + "<br/>");
    out.println("Метод getSession(true): " + request.getSession(true) + "<br/>");
    out.println(++counter);
    out.println("</ul>");
    out.println("</body></html>");
  }

  public void destroy() {
  }
}
