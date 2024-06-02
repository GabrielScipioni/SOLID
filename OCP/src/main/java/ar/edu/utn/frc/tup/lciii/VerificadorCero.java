package ar.edu.utn.frc.tup.lciii;

/**
 * Clase para verificar si un divisor es cero.
 */
public class VerificadorCero {
    /**
     * Verifica si el divisor es cero.
     *
     * @param divisor el divisor a verificar.
     * @throws ArithmeticException si el divisor es cero.
     */
    public void check(double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
    }
}
