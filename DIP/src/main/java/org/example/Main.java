package org.example;

import org.example.AltoNivel.NotificacionManager;
import org.example.BajoNivel.EmailService;
import org.example.Abstracion.NotificacionService;
import org.example.BajoNivel.SMSService;

public class Main {
    public static void main(String[] args) {
        NotificacionService emailService = new EmailService();
        NotificacionManager emailManager = new NotificacionManager(emailService);
        emailManager.notificar("hola Email");

        NotificacionService smsService = new SMSService();
        NotificacionManager smsManager = new NotificacionManager(smsService);
        smsManager.notificar("hola SMS");
    }
}