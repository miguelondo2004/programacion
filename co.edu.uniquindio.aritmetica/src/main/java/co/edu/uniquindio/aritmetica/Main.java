package co.edu.uniquindio.aritmetica;

import co.edu.uniquindio.aritmetica.model.Aritmetica;

public class Main {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.multiplicar(2.0, 8.0);
        aritmetica.sumar(5.0,6.5);
        aritmetica.restar(7.5,4.0);
        aritmetica.dividir(10,2);
    }
}