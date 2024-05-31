package org.example.AltoNivel;

import org.example.Abstracion.NotificacionService;

public class NotificacionManager {
    private NotificacionService notificacionService;
    public NotificacionManager(NotificacionService notificacionService){
        this.notificacionService=notificacionService;
    }
    public void notificar(String mensaje){
        notificacionService.enviarMensaje(mensaje);
    }
}
