package ar.edu.utn.frc.tup.lciii;

/**
 * Clase para realizar la operación de suma.
 */
public class Suma implements Operacion {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
