package ar.edu.utc.frc.tup.lciii.OCP;

/**
 * Clase para realizar la operación de suma.
 */
public class Suma implements Operacion {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
