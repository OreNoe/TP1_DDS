package domain;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
    public boolean aprobada() {
        return materias.stream().allMatch(m -> alumno.aproboCorrelativas(m));
    }
}
