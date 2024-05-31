package org.example.BajoNivel;

import org.example.Abstracion.NotificacionService;

public class EmailService implements NotificacionService {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("mensaje email: "+mensaje);
    }
}
