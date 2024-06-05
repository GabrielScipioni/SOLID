package ar.edu.utc.frc.tup.lciii.OCP;

/**
 * Clase para realizar la operación de resta.
 */
public class Resta implements Operacion{
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}
