package model;

public class Materia {
    private Integer id;
    private String nombre;

    public Materia(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Materia() {
    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
