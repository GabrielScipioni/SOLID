package ar.edu.utn.frc.tup.lciii.AltoNivel;

import ar.edu.utn.frc.tup.lciii.Abstracion.NotificacionService;

public class NotificacionManager {
    private NotificacionService notificacionService;
    public NotificacionManager(NotificacionService notificacionService){
        this.notificacionService=notificacionService;
    }
    public void notificar(String mensaje){
        notificacionService.enviarMensaje(mensaje);
    }
}
