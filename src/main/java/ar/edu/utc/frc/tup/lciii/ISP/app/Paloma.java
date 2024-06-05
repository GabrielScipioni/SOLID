package ar.edu.utc.frc.tup.lciii.ISP.app;

public class Paloma implements Animal,IaveVoladora{
    private String nombre;
    public Paloma(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void comer() {
        System.out.println(nombre+" Esta comiendo");
    }

    @Override
    public void volar() {
        System.out.println(nombre+" esta volando");
    }
}
