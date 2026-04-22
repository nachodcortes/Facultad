package facade;

public class TiendaFacade {
    private Inventario inventario;
    private Pago pago;
    private Envio envio;
    private Notificacion notificacion;

    public TiendaFacade() {
        inventario = new Inventario();
        pago = new Pago();
        envio = new Envio();
        notificacion = new Notificacion();
    }

    public void realizarCompra(String producto, double monto) {

        System.out.println("---- Iniciando compra ----");

        if (inventario.verificarStock(producto)) {

            if (pago.procesarPago(monto)) {
                envio.enviarProducto(producto);
                notificacion.enviarConfirmacion();
                System.out.println("Compra realizada con éxito");
            } else {
                System.out.println("Error en el pago");
            }

        } else {
            System.out.println("Producto sin stock");
        }
    }

}
