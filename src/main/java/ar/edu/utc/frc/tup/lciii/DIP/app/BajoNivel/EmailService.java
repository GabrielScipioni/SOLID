package ar.edu.utc.frc.tup.lciii.DIP.app.BajoNivel;

import ar.edu.utc.frc.tup.lciii.DIP.app.Abstracion.NotificacionService;

public class EmailService implements NotificacionService {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("mensaje email: "+mensaje);
    }
}
