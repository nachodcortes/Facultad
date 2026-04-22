package facade;

public class Pago {
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto);
        return true;
    }

}
