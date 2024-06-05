package ar.edu.utc.frc.tup.lciii.LSP;

public class Main {
    public static void main(String[] args) {
        Forma rectangulo = new Rectangulo(5, 10);
        Forma cuadrado = new Cuadrado(6);
        Forma trianguloRectangulo = new TrianguloRectangulo(6,5);

        System.out.println("Área del rectángulo: " + rectangulo.area());
        System.out.println("Área del rectángulo: " + rectangulo.perimetro());
        System.out.println();
        System.out.println("Área del cuadrado: " + cuadrado.area());
        System.out.println("Área del cuadrado: " + cuadrado.perimetro());
        System.out.println();
        System.out.println("Área del triangulo: " + trianguloRectangulo.area());
        System.out.println("Área del triangulo: " + trianguloRectangulo.perimetro());
    }
}