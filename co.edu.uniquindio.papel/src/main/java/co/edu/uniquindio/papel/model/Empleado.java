package co.edu.uniquindio.papel.model;

public class Empleado {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    Banco ownedByBanco;

    //Constructor

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
    }

    // Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Banco getOwnedByBanco() {
        return ownedByBanco;
    }

    public void setOwnedByBanco(Banco ownedByBanco) {
        this.ownedByBanco = ownedByBanco;
    }
}
