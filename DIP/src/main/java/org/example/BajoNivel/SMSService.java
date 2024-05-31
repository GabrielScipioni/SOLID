package org.example.BajoNivel;

import org.example.Abstracion.NotificacionService;

public class SMSService implements NotificacionService {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("mensaje SMS: "+mensaje);
    }
}
