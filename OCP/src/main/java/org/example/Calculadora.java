package org.example;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase Calculadora que utiliza operaciones matemáticas.
 */
public class Calculadora {
    private Map<String, Operacion> operacion = new HashMap<>();


    /**
     * Agrega una operación a la calculadora.
     *
     * @param operationName el nombre de la operación.
     * @param operation la implementación de la operación.
     */
    public void addOperation(String operationName, Operacion operation) {
        operacion.put(operationName, operation);
    }

    /**
     * Realiza el cálculo basado en la operación especificada.
     *
     * @param operationName el nombre de la operación.
     * @param a primer operando.
     * @param b segundo operando.
     * @return el resultado de la operación.
     * @throws UnsupportedOperationException si la operación no está soportada.
     */
    public double calculate(String operationName, double a, double b) {
        Operacion operation = operacion.get(operationName);

        if (operation != null) {
            return operation.calculate(a, b);
        } else {
            throw new UnsupportedOperationException("Operation not supported");
        }
    }
}
