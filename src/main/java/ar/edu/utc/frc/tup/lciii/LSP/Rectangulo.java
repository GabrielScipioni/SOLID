package ar.edu.utc.frc.tup.lciii.LSP;

public class Rectangulo extends Forma {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public double area() {
        return ancho * alto;
    }

    @Override
    public double perimetro() {
        return (ancho+alto)*2;
    }
}
