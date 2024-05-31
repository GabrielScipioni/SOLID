package org.example;

public class Pinguino implements Animal,IaveNadadora{
    private String nombre;
    public Pinguino(String nombre){
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
    public void nadar() {
        System.out.println(nombre+" esta nadando");
    }
}
