package ar.edu.utn.frc.tup.lciii;

import ar.edu.utn.frc.tup.lciii.Abstracion.NotificacionService;
import ar.edu.utn.frc.tup.lciii.AltoNivel.NotificacionManager;
import ar.edu.utn.frc.tup.lciii.BajoNivel.EmailService;
import ar.edu.utn.frc.tup.lciii.BajoNivel.SMSService;

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