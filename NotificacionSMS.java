public class NotificacionSMS extends Notificacion {
    String numeroTelefono;
    public NotificacionSMS(String mensaje, String fechaEnvio, String numeroTelefono) {
        super(mensaje, fechaEnvio);
        this.numeroTelefono = numeroTelefono;
    }
    @Override
    public void enviar() {
        System.out.println("enviando mensaje SMS");
        System.out.println("destinatorio: " + numeroTelefono);
        System.out.println("mensaje: " + mensaje);
        System.out.println("fecha de envio: " + fechaEnvio);
    }
}
