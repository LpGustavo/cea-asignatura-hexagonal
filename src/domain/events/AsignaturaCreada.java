package domain.events;

import java.time.LocalDateTime;

public class AsignaturaCreada {
    private final String asignaturaId;
    private final String nombre;
    private final LocalDateTime fecha;

    public AsignaturaCreada(String asignaturaId, String nombre) {
        this.asignaturaId = asignaturaId;
        this.nombre = nombre;
        this.fecha = LocalDateTime.now();
    }

    public String getAsignaturaId() { return asignaturaId; }
    public String getNombre() { return nombre; }
    public LocalDateTime getFecha() { return fecha; }
}
