package ar.edu.utn.frc.tup.lciii.BajoNivel;

import ar.edu.utn.frc.tup.lciii.Abstracion.NotificacionService;

public class EmailService implements NotificacionService {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("mensaje email: "+mensaje);
    }
}
