package domain.services;

import java.util.List;
import domain.model.Asignatura;

public interface ServicioCalculoCargaAcademica {
    int calcularCargaTotal(List<Asignatura> asignaturas);
    boolean excedeLimite(List<Asignatura> asignaturas, int limiteMaximo);
}
