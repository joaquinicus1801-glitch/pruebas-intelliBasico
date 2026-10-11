import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
//importamos la biblioteca de junit

public class CalculadoraTest {
@Test //Indica que el metodo es una prueba JUnit.
 void probarSuma() { //metodo que contiene nuestra prueba

    Calculadora calculadora = new Calculadora();

    int resultado = calculadora.sumar(5, 3);

    assertEquals(8, resultado); //comprueba que 2 valores sean iguales
     //dara un boolean?
}


}
