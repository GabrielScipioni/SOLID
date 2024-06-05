package ar.edu.utc.frc.tup.lciii.DIP.AltoNivel;

import ar.edu.utc.frc.tup.lciii.DIP.Abstracion.NotificacionService;

public class NotificacionManager {
    private NotificacionService notificacionService;
    public NotificacionManager(NotificacionService notificacionService){
        this.notificacionService=notificacionService;
    }
    public void notificar(String mensaje){
        notificacionService.enviarMensaje(mensaje);
    }
}
