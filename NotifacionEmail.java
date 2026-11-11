public class NotifacionEmail extends Notificacion {
    String direccionCorreo;
    public NotifacionEmail(String mensaje, String fechaEnvio, String direccionCorreo) {
        super(mensaje, fechaEnvio);
        this.direccionCorreo = direccionCorreo;
    }
    @Override
    public void enviar() {
        System.out.println("enviando correo electronico");
        System.out.println("destinatorio: " + direccionCorreo);
        System.out.println("mensaje: " + mensaje);
        System.out.println("fecha de envio: " + fechaEnvio);
    }
}
