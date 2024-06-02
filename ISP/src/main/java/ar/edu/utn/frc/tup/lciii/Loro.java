package ar.edu.utn.frc.tup.lciii;

public class Loro implements Animal,IaveVoladora{
    private String nombre;
    public Loro(String nombre){
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
