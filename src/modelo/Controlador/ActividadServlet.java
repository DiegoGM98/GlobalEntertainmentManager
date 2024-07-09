package modelo.Controlador;

import modelo.data.dao.ActividadDAO;
import modelo.data.dao.ActividadDAOImpl;
import modelo.Actividad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/ActividadServlet")
public class ActividadServlet extends HttpServlet {
    private ActividadDAO actividadDAO = new ActividadDAOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("crear".equals(action)) {
            crearActividad(request, response);
        } else if ("cancelar".equals(action)) {
            cancelarActividad(request, response);
        }
    }

    private void crearActividad(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nombre = request.getParameter("nombre");
        String fechaStr = request.getParameter("fecha");
        String lugar = request.getParameter("lugar");
        String detalles = request.getParameter("detalles");

        try {
            Date fecha = new SimpleDateFormat("yyyy-MM-dd").parse(fechaStr);
            Actividad actividad = new Actividad(nombre, fecha, lugar, detalles);
            actividadDAO.crearActividad(actividad);
            response.sendRedirect("actividades.jsp");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private void cancelarActividad(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nombre = request.getParameter("nombre");
        actividadDAO.cancelarActividad(nombre);
        response.sendRedirect("actividades.jsp");
    }
}

