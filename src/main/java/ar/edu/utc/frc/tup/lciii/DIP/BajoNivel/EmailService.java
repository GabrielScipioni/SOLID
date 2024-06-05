package ar.edu.utc.frc.tup.lciii.DIP.BajoNivel;

import ar.edu.utc.frc.tup.lciii.DIP.Abstracion.NotificacionService;

public class EmailService implements NotificacionService {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("mensaje email: "+mensaje);
    }
}
