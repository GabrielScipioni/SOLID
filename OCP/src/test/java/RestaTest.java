import ar.edu.utn.frc.tup.lciii.Resta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaTest {
    @Test
    public void testCalculate() {
        Resta resta = new Resta();
        double resultado = resta.calculate(23, 3);
        assertEquals(20, resultado); // Esperamos que 23 - 3 sea 20
    }
}
