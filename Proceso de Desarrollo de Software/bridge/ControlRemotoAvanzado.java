package bridge;

public class ControlRemotoAvanzado extends ControlRemoto{
    public ControlRemotoAvanzado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void silenciar() {
        dispositivo.setVolumen(0);
        System.out.println("Dispositivo silenciado");
    }

}
