
import ar.edu.utn.frc.tup.lciii.Multiplicacion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicacionTest {
    @Test
    public void testCalculate() {
        Multiplicacion multiplicacion = new Multiplicacion();
        double resultado = multiplicacion.calculate(2, 3);
        assertEquals(6, resultado); // Esperamos que 2 * 3 sea 6
    }
}
