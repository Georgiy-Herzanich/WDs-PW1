package com.vmwork.pw1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "listServlet", value = "/list-Servlet")
public class ListServlet extends HttpServlet {

  public void init() {
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html");

    List<Product> products = new ArrayList<>();
    products.add(new Product(1, "яблуко", 7f));
    products.add(new Product(2, "груша ", 9f));
    products.add(new Product(3, "ківі", 9f));
    products.add(new Product(4, "апельсин", 10f));
    products.add(new Product(5, "банан", 10f));
    products.add(new Product(6, "маракуя", 30f));
    products.add(new Product(7, "10г болі", 0f));
    products.add(new Product(8, "3ч.л страданія", 0f));
    products.add(new Product(9, "3т багів", 0f));
    products.add(new Product(10, "мандаринка", 7f));

    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    out.println("<ul>");
    products.forEach(product -> {
      out.println("<li>" + product.getTitle() + " Ціна: " + product.getCost() + " грн" + "</li>");
    });
    out.println("</ul>");
    out.println("</body></html>");
  }

  public void destroy() {
  }

}
