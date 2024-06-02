package ar.edu.utn.frc.tup.lciii;

/**
 * Clase para realizar la operación de multiplicacion.
 */
public class Multiplicacion implements Operacion{
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
