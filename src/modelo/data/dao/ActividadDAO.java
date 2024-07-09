package modelo.data.dao;

import modelo.Actividad;
import java.util.List;

public interface ActividadDAO {
    void crearActividad(Actividad actividad);
    void cancelarActividad(String nombre);
    List<Actividad> listarActividades();
}

