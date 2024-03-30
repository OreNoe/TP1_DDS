package domain;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private int legajo;
    private List<Materia> materiasAprobadas;


    public Alumno(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
    public boolean aproboCorrelativas(Materia materia) {
        return materiasAprobadas.containsAll(materia.getCorrelativa());
    }
}
