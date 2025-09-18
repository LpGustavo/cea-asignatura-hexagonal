package domain.model;

public class Profesor {
    private final String id;
    private final String nombre;
    private final String areaConocimiento;

    public Profesor(String id, String nombre, String areaConocimiento) {
        this.id = id;
        this.nombre = nombre;
        this.areaConocimiento = areaConocimiento;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getAreaConocimiento() { return areaConocimiento; }
}
