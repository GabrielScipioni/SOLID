package org.example;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.addOperation("suma", new Suma());
        calculadora.addOperation("resta", new Resta());
        calculadora.addOperation("multiplicacion", new Multiplicacion());
        calculadora.addOperation("division", new Division());

        double a = 0;
        double b = 0;

        System.out.println("suma: " + calculadora.calculate("suma", a, b));
        System.out.println("resta: " + calculadora.calculate("resta", a, b));
        System.out.println("multiplicacion: " + calculadora.calculate("multiplicacion", a, b));
        System.out.println("division: " + calculadora.calculate("division", a, b));
    }
}