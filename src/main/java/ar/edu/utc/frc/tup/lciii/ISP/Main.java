package ar.edu.utc.frc.tup.lciii.ISP;

public class Main {
    public static void main(String[] args) {
        Loro loro=new Loro("pepe el loro");
        Paloma paloma=new Paloma("jose la paloma");
        Pinguino pinguino=new Pinguino("Ramon Carlos Boyer Garcia Sanches Santa Maria La Niña Pinta Pasion");

        loro.comer();
        loro.volar();
        System.out.println();
        paloma.comer();
        paloma.volar();
        System.out.println();
        pinguino.comer();
        pinguino.nadar();
    }
}