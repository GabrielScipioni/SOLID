package ar.edu.utn.frc.tup.lciii;

public class TrianguloRectangulo extends Forma {
    public double cateto1;
    public double cateto2;
    public double hipotenusa;

    public TrianguloRectangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        hipotenusa = Math.sqrt(cateto1*cateto1+cateto2+cateto2);
    }

    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }

    @Override
    public double area() {
        return ((cateto1*cateto2)/2);
    }

    @Override
    public double perimetro() {
        return hipotenusa+cateto2+cateto1;
    }
}
