package domain;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombres) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
    public List<Materia> getCorrelativa() {
        return correlativas;
    }
}
