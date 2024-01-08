import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteCalculadora {
    @Test
    public void testSoma() {
        
        double a = 5.0;
        double b = 7.5;
        Calculadora calculadora = new Calculadora(a, b);


        double resultado = calculadora.soma();


        assertEquals(12.5, resultado); // Verifica se a soma está correta
    }
}

