package modelo.data.dao;

import modelo.Actividad;
import java.util.ArrayList;
import java.util.List;

public class ActividadDAOImpl implements ActividadDAO {
    private List<Actividad> actividades = new ArrayList<>();

    @Override
    public void crearActividad(Actividad actividad) {
        actividades.add(actividad);
    }

    @Override
    public void cancelarActividad(String nombre) {
        actividades.removeIf(actividad -> actividad.getNombre().equals(nombre));
    }

    @Override
    public List<Actividad> listarActividades() {
        return new ArrayList<>(actividades);
    }
}

