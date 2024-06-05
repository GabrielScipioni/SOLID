package ar.edu.utc.frc.tup.lciii.LSP.app;

public class Cuadrado extends Forma {
    private double lado;

    public Cuadrado(double side) {
        this.lado = side;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return lado*4;
    }
}
