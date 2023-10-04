package co.edu.uniquindio.aritmetica.model;

public class Aritmetica {

    /**
     * metodo para multiplicar 2 numeros
     * @param numero1
     * @param numero2
     * @return double
     */
    public double multiplicar(double numero1, double numero2) {

        double multiplicacion = 0.0;
        multiplicacion = numero1 * numero2;
        return multiplicacion;

    }

    /**
     * metodo para sumar 2 numeros
     * @param numero1
     * @param numero2
     * @return double
     */

    public double sumar(double numero1, double numero2) {

        double suma = 0.0;
        suma = numero1 + numero2;
        return suma;
    }

    /**
     * metodo para restar 2 numeros
     * @param numero1
     * @param numero2
     * @return double
     */
    public double restar(double numero1, double numero2) {

        double resta = 0.0;
        resta = numero1 - numero2;
        return resta;
    }

    /**
     * metodo para dividir 2 numeros
     * @param numero1
     * @param numero2
     * @return int
     */
    public int dividir(int numero1, int numero2) {

        int division = 0;
        division = numero1 / numero2;
        return division;
    }
}