package co.edu.uniquindio.parcial1.model;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int fechaNacimiento;
    private int edad;
    private String correo;
    private int semestre;
    private double estatura;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;

    /*Constructor*/
    public Estudiante(){

    }

    public Estudiante(String nombre, String apellido, int fechaNacimiento, int edad, String correo, int semestre, double estatura, double nota1, double nota2, double nota3, double nota4, double nota5){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
        this.estatura = estatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
    }


    /*  Getters y Setters*/
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

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }



    /**
     * Metodo que retorna la informacion del estudiante
     * @return
     */
    public String obtenerInformacion() {
        String informacion = "";
        informacion = informacion +
                "nombre:"  + getNombre() + "\n" +
                "apellido:" + getApellido() + "\n" +
                "fechaNacimiento:" + getFechaNacimiento() + "\n" +
                "edad: " + getEdad() + "\n" +
                "correo: " + getCorreo() + "\n" +
                "semestre: " + getSemestre() + "\n" +
                "estatura:" + getEstatura() + "\n" +
                "nota1: " + getNota1() + "\n" +
                "nota2: " + getNota2() + "\n" +
                "nota3: " + getNota3() + "\n" +
                "nota4:" + getNota4() + "\n" +
                "nota5:" + getNota5() + "\n";

        return informacion;
    }

    public static Estudiante crearEstudiante(String nombre, String apellido, int fechaNacimiento, int edad, String correo, int semestre, double estatura, double nota1, double nota2, double nota3, double nota4, double nota5) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setFechaNacimiento(fechaNacimiento);
        estudiante.setEdad(edad);
        estudiante.setCorreo(correo);
        estudiante.setSemestre(semestre);
        estudiante.setEstatura(estatura);
        estudiante.setNota1(nota1);
        estudiante.setNota2(nota2);
        estudiante.setNota3(nota3);
        estudiante.setNota4(nota4);
        estudiante.setNota5(nota5);
        return estudiante;
    }

    public static double calcularPromedioEstudiante(double nota1, double nota2, double nota3, double nota4, double nota5) {
        double promedio = 0.0;
        promedio = (nota1 + nota2 + nota3 + nota4 + nota5)/5.0;
        return promedio;
    }

}

