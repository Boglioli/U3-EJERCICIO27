public class NotificacionPush extends Notificacion {
    String identificadorDispositivo;
    public NotificacionPush(String mensaje, String fechaEnvio, String identificadorDispositivo) {
        super(mensaje, fechaEnvio);
        this.identificadorDispositivo = identificadorDispositivo;
}

    @Override
    public void enviar() {
        System.out.println("enviando notificación push");
        System.out.println("dispositivo: " + identificadorDispositivo);
        System.out.println("mensaje: " + mensaje);
        System.out.println("fecha de envio: " + fechaEnvio);
    }
}
