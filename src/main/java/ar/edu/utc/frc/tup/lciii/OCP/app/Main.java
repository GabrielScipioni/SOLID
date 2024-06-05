package ar.edu.utc.frc.tup.lciii.OCP.app;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.addOperation("suma", new Suma());
        calculadora.addOperation("resta", new Resta());
        calculadora.addOperation("multiplicacion", new Multiplicacion());
        calculadora.addOperation("division", new Division());

        double a = 2;
        double b = 6;

        System.out.println("suma: " + calculadora.calculate("suma", a, b));
        System.out.println("resta: " + calculadora.calculate("resta", a, b));
        System.out.println("multiplicacion: " + calculadora.calculate("multiplicacion", a, b));
        System.out.println("division: " + calculadora.calculate("division", a, b));
    }
}