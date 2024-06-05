package ar.edu.utc.frc.tup.lciii.DIP.app;

import ar.edu.utc.frc.tup.lciii.DIP.app.Abstracion.NotificacionService;
import ar.edu.utc.frc.tup.lciii.DIP.app.AltoNivel.NotificacionManager;
import ar.edu.utc.frc.tup.lciii.DIP.app.BajoNivel.EmailService;
import ar.edu.utc.frc.tup.lciii.DIP.app.BajoNivel.SMSService;

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