package application.usecases;

import domain.model.Asignatura;
import domain.model.NumeroCreditos;
import domain.model.Profesor;
import domain.events.AsignaturaCreada;
import domain.exceptions.ExcepcionNumeroCreditosInvalido;

public class CrearAsignaturaService {
    // Aquí iría un repositorio inyectado (puedes poner interfaz en domain)
    // private final AsignaturaRepository repo;

    public void ejecutar(String codigo, String nombre, int creditos, Profesor profesor) {
        NumeroCreditos nc = new NumeroCreditos(creditos);
        Asignatura a = new Asignatura(codigo, nombre, nc, profesor);
        // repo.save(a);
        // publicar evento AsignaturaCreada...
    }
}
