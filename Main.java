public class Main {
    public static void main(String[] args) {
       Notificacion[] notificaciones = new Notificacion[3];
       notificaciones[0] = new NotifacionEmail("hola, tiene un nuevo correo", "2026-10-01", "usuario@gamil.com");
       notificaciones[1] = new NotificacionSMS("hola, su codigo es 1234", "2026-10-01", "26347675849");
       notificaciones[2] = new NotificacionPush("hola, tiene una nueva alerta", "2026-10-01", "DISPO01");
       for (int i = 0; i < notificaciones.length; i++) {
           System.out.println("---- notificacion ----");
           notificaciones[i].enviar();
       }
    }
}
