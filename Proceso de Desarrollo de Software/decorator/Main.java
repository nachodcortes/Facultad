package decorator;

public class Main {
    public static void main(String[] args) {
        BebidaComponent cafe = new CafeSolo();
        System.out.println(cafe.mostrarDescripcion() + " --> "+ cafe.mostrarPrecio());
        cafe = new Crema(cafe);
        System.out.println(cafe.mostrarDescripcion() + " --> "+ cafe.mostrarPrecio());
        cafe = new Azucar(cafe);
        System.out.println(cafe.mostrarDescripcion() + " --> "+ cafe.mostrarPrecio());
    }
}
