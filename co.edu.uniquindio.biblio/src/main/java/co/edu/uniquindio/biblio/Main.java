package co.edu.uniquindio.biblio;
import co.edu.uniquindio.biblio.model.Libro;
public class Main {
    public static void main(String[] args) {
        // 5 libros
        Libro libro1 = new Libro();
        libro1.setTitulo("El Principito");
        libro1.setAutor("Antoine de Saint Exupery");
        libro1.setGenero("Literatura infantil");
        libro1.setAnioPublicacion(6 / 4 / 1943);
        libro1.setEditorial("Reynal");
        libro1.setNumeroPaginas(120);

        Libro libro2 = new Libro();
        libro2.setTitulo("Calculo Integral");
        libro2.setAutor("JAmes Stewart");
        libro2.setGenero("Matematicas");
        libro2.setAnioPublicacion(1991);
        libro2.setEditorial("Cengage Learning");
        libro2.setNumeroPaginas(1200);

        Libro libro3 = new Libro();
        libro3.setTitulo("Cien años de Soledad");
        libro3.setAutor("Gabriel Garcia Marquez");
        libro3.setGenero("Novela historica");
        libro3.setAnioPublicacion(1967);
        libro3.setEditorial("Sudamericana");
        libro3.setNumeroPaginas(490);

        Libro libro4 = new Libro();
        libro4.setTitulo("El señor de los anillos");
        libro4.setAutor("Tolkien");
        libro4.setGenero("Fantasia epica");
        libro4.setAnioPublicacion(1954);
        libro4.setEditorial("George Allen");
        libro4.setNumeroPaginas(1500);

        Libro libro5 = new Libro();
        libro5.setTitulo("Orgullo y prejuicio");
        libro5.setAutor("Jane Austen");
        libro5.setGenero("Novela Romantica");
        libro5.setAnioPublicacion(1813);
        libro5.setEditorial("Egerton");
        libro5.setNumeroPaginas(300);

        //obtener la cantidad de libros en los que el titulo inicie con una vocal y con una consonante
        int contadorVocal = 0;
        int contadorConsonante = 0;

        if(Libro.esVocal(libro1.getTitulo().charAt(0))) {
            contadorVocal = contadorVocal + 1;
        }else{
            contadorConsonante = contadorConsonante + 1;
        }



        if(Libro.esVocal(libro2.getTitulo().charAt(0))) {
            contadorVocal = contadorVocal + 1;
        }else{
            contadorConsonante = contadorConsonante + 1;
        }


        if(Libro.esVocal(libro3.getTitulo().charAt(0))) {
            contadorVocal = contadorVocal + 1;
        }else{
            contadorConsonante = contadorConsonante + 1;
        }



        if(Libro.esVocal(libro4.getTitulo().charAt(0))) {
            contadorVocal = contadorVocal + 1;
        }else{
            contadorConsonante = contadorConsonante + 1;
        }


        if(Libro.esVocal(libro5.getTitulo().charAt(0))) {
            contadorVocal = contadorVocal + 1;
        }else{
            contadorConsonante = contadorConsonante + 1;
        }
        System.out.println("Cantidad de vocales es: "+ contadorVocal);
        System.out.println("Cantidad de consonantes es: "+ contadorConsonante);

        //modificar Libro
        String tituloActual = "Calculo Integral";
        String tituloNuevo = "Calculo Integral y Diferencial";
        if(libro1.getTitulo().equalsIgnoreCase(tituloActual)) {
            libro1.setTitulo(tituloNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: "+ libro1);
        }
        if(libro2.getTitulo().equalsIgnoreCase(tituloActual)) {
            libro2.setTitulo(tituloNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: " + libro2);
        }
        if(libro3.getTitulo().equalsIgnoreCase(tituloActual)) {
            libro3.setTitulo(tituloNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: " + libro3);
        }
        if(libro4.getTitulo().equalsIgnoreCase(tituloActual)) {
            libro4.setTitulo(tituloNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: " + libro4);
        }
        if(libro5.getTitulo().equalsIgnoreCase(tituloActual)) {
            libro5.setTitulo(tituloNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: " + libro5);
        }

        // Cantidad de libros con mas de 500 paginas y con menos de 500 paginas

        int contadorLibrosMayores = 0;
        int contadorLibrosMenores = 0;
        if(libro1.getNumeroPaginas()> 500){
            contadorLibrosMayores = contadorLibrosMayores + 1;
        }else{
            contadorLibrosMenores = contadorLibrosMenores + 1;
        }

        if(libro2.getNumeroPaginas()> 500){
            contadorLibrosMayores = contadorLibrosMayores + 1;
        }else {
            contadorLibrosMenores = contadorLibrosMenores + 1;
        }

        if(libro3.getNumeroPaginas()> 500){
            contadorLibrosMayores = contadorLibrosMayores + 1;
        }else {
            contadorLibrosMenores = contadorLibrosMenores + 1;
        }

        if(libro4.getNumeroPaginas()> 500){
            contadorLibrosMayores = contadorLibrosMayores + 1;
        }else {
            contadorLibrosMenores = contadorLibrosMenores + 1;
        }

        if(libro5.getNumeroPaginas()> 500){
            contadorLibrosMayores = contadorLibrosMayores + 1;
        }else {
            contadorLibrosMenores = contadorLibrosMenores + 1;
        }
        System.out.println("Cantidad de libros con numero de paginas mayor a 500 es: "+ contadorLibrosMayores);
        System.out.println("Cantidad de libros con numero de paginas menor a 500 es: "+ contadorLibrosMenores);
    }
}
