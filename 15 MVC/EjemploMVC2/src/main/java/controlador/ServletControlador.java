
package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        // 1. procesamos los parametros
        String accion = request.getParameter("accion");
        // 2. Creamos los JavaBeans
        Rectangulo recRequest =  new Rectangulo(1,2);
        Rectangulo recSesion =  new Rectangulo(1,2);
        Rectangulo recAplicacion =  new Rectangulo(1,2);

        // 3. Agregamos  el javabeans a algun alcance
        
        // revisamos la accion proporcionada
        if("agregarVariables".equals(accion)){
            //Alcance request
            request.setAttribute("rectanguloRequest", recRequest);
            
            //Alcance sesion
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSesion",recSesion);
            
            //Alcance application
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloAplicacion",recAplicacion);
            
            //Agregamos un mensaje
            request.setAttribute("mensaje","Las variables fueron agregadas");
            
            // redireccionamos al JSP de index
            request.getRequestDispatcher("index.jsp").forward(request,response);

        }
        else if("listarVariables".equals(accion)){
        // 4. Redireccionamos al jsp que despliegue las variables     
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request,response);
        }
        else{
        // 5. Redireccionamos a la pagina de inicio
        request.setAttribute("mensaje","Accion no proporcionada ó desconocida");
        request.getRequestDispatcher("index.jsp").forward(request,response);
        
        // Esta linea no agregaria  informacion al JSP,ya que no propaga los objetos request y response
        // response.sendRedirect("index.jsp");
        }
        
        
    }
}
