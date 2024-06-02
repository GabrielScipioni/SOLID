import ar.edu.utn.frc.tup.lciii.Suma;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaTest {
    @Test
    public void testCalculate() {
        Suma suma = new Suma();
        double resultado = suma.calculate(2, 3);
        assertEquals(5, resultado); // Esperamos que 2 + 3 sea 5
    }
}
