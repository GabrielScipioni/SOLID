package org.example;

/**
 * Interfaz para definir una operación matemática.
 */
public interface Operacion {
    /**
     * Método para realizar el cálculo de la operación.
     *
     * @param a primer operando.
     * @param b segundo operando.
     * @return el resultado de la operación.
     */
    double calculate(double a, double b);
}
