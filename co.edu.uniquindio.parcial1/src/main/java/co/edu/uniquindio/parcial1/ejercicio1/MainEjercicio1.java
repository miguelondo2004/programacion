package co.edu.uniquindio.parcial1.ejercicio1;
import co.edu.uniquindio.parcial1.model.Curso;
import co.edu.uniquindio.parcial1.model.Docente;
import co.edu.uniquindio.parcial1.model.Estudiante;

import static co.edu.uniquindio.parcial1.model.Estudiante.calcularPromedioEstudiante;
import static co.edu.uniquindio.parcial1.model.Estudiante.crearEstudiante;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Estudiante estudiante1 = crearEstudiante("Juan","Londoño",2004,18,"123@",2,1.78,4.5,2.0, 3.5, 5.0, 1.5 );
        Estudiante estudiante2 = crearEstudiante("Pedro","Garcia",1996,26,"1234@",3,1.70,3.0, 4.0,5.0,3.5,3.0);
        Estudiante estudiante3 = crearEstudiante("Ana","Ospina",2002,19,"12345@",4,1.58,5.0, 3.0,2.0,3.5,4.5);
        Docente docente = new Docente("Carlos", "Zuluaga", 30, "567@");
        Docente docenteAuxiliar = new Docente("Luisa","Nunez", 23,"5678@");
        Curso curso = new Curso("Programacion1",2,"2N",3, "Nocturna","Ingenieria de Sistemas","Ingenieria");
        curso.setEstudiante1(estudiante1);
        curso.setEstudiante2(estudiante2);
        curso.setEstudiante3(estudiante3);
        curso.setDocente(docente);
        curso.setDocenteAuxiliar(docenteAuxiliar);
    }

    double notaPromedioE1 = calcularPromedioEstudiante(estudiante1.getnota1)
}
