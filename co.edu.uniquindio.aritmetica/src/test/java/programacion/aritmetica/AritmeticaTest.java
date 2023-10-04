package programacion.aritmetica;

import co.edu.uniquindio.aritmetica.model.Aritmetica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AritmeticaTest {

    @Test
    public void sumaTest(){
        Aritmetica aritmetica = new Aritmetica();
        double resultado = aritmetica.sumar(3.0,5.0);
        double esperado = 8.0;
        Assertions.assertEquals();
    }
}
