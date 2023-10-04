package co.edu.uniquindio.parcial1.model;

public class Docente {
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;

    public Docente(String nombre, String apellido, int edad, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }


}
