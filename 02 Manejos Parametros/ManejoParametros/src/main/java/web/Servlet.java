package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // leer los formularios del  parametro html
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        // imprimimos las variables que obtuvimos con los parametros
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);

        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro de usuario es: " + usuario);
        out.print("<br>");
        out.print("El parametro de password es: " + password);
        out.print("</body>");
        out.print("</html>");

    }
}
