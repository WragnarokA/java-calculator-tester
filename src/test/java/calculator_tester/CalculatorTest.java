package calculator_tester;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        float result = calculator.add(5, 3);
        assertEquals(8, result, 0.001);
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        float result = calculator.subtract(5, 3);
        assertEquals(2, result, 0.001);
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        float result = calculator.divide(10, 2);
        assertEquals(5, result, 0.001); // Verifica che la divisione funzioni correttamente

        // Verifica che il metodo divide sollevi un'eccezione se il dividendo è 0
        try {
            calculator.divide(8, 0);
            fail("Dovrebbe sollevare un'eccezione per divisione per zero");
        } catch (IllegalArgumentException e) {
            assertEquals("Impossible to divide by zero!", e.getMessage());
        }
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        float result = calculator.multiply(5, 3);
        assertEquals(15, result, 0.001); // Verifica che la moltiplicazione funzioni correttamente
    }

}