import ar.edu.utn.frc.tup.lciii.Division;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivisionTest {
    @Test
    public void testCalculate() {
        Division division = new Division();

        // Caso típico
        double resultado = division.calculate(6, 2);
        assertEquals(3, resultado); // Esperamos que 6 / 2 sea 3

        // Caso con divisor igual a cero
        assertThrows(ArithmeticException.class, () -> division.calculate(6, 0));
    }
}
