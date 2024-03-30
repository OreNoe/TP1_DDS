package domain;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class AlumnoTest extends TestCase {

    public void testInscripcionDenegada() {
        // Arrange
        Materia materia1 = new Materia("Matematica");
        Materia materia2 = new Materia("Fisica");
        materia2.setCorrelativas(List.of(materia1));

        Alumno alumno = new Alumno("Juan", "Perez", 123);
        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.setMaterias(List.of(materia2));

        assertFalse(inscripcion.aprobada());
    }

    public void testInscripcionAprobada() {
        // Arrange
        Materia materia1 = new Materia("Matematica");
        Materia materia2 = new Materia("Fisica");
        materia2.setCorrelativas(List.of(materia1));

        Alumno alumno = new Alumno("Juan", "Perez", 123);
        alumno.setMateriasAprobadas(List.of(materia1));

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.setMaterias(List.of(materia2));

        assertTrue(inscripcion.aprobada());
    }

    public void testInscripcionConVariasMaterias() {
        // Arrange
        Materia materia1 = new Materia("Matematica");
        Materia materia2 = new Materia("Fisica");
        Materia materia3 = new Materia("Quimica");

        Alumno alumno = new Alumno("Juan", "Perez", 123);
        alumno.setMateriasAprobadas(List.of(materia1, materia2));

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.setMaterias(List.of(materia3));
        assertTrue(inscripcion.aprobada());
    }
}