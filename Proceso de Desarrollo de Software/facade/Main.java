package facade;

public class Main {
    public static void main(String[] args) {
        TiendaFacade tienda = new TiendaFacade();
        tienda.realizarCompra("Laptop", 1500);
    }

}
