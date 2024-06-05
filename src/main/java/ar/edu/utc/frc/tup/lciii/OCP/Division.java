package ar.edu.utc.frc.tup.lciii.OCP;

/**
 * Clase para realizar la operación de division.
 */
public class Division implements Operacion{
    VerificadorCero verificadorCero = new VerificadorCero();
    @Override
    public double calculate(double a, double b) {
        verificadorCero.check(b);
        return a / b;
    }
}
