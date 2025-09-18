package domain.model;

public class Asignatura {
    private String codigo;           // identidad
    private String nombre;
    private String nombreCompleto;
    private String descripcion;
    private String areaConocimiento;
    private String carrera;
    private NumeroCreditos numeroCreditos;
    private String contenidoTematico;
    private int semestre;
    private Profesor profesor;       // referencia a entidad Profesor

    public Asignatura(String codigo, String nombre, NumeroCreditos numeroCreditos, Profesor profesor) {
        if (codigo == null || codigo.isEmpty()) throw new IllegalArgumentException("Código requerido");
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.profesor = profesor;
    }

    public String getCodigo() { return codigo; }

    public void cambiarNumeroCreditos(NumeroCreditos nuevosCreditos) {
        if (nuevosCreditos == null) throw new RuntimeException("Creditos inválidos");
        this.numeroCreditos = nuevosCreditos;
    }

    // getters / setters y demás comportamientos del dominio...
}

