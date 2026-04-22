package bridge;

public class Main {
    public static void main(String[] args) {
        Dispositivo tv = new TV();
        ControlRemoto controlTV = new ControlRemotoAvanzado(tv);

        controlTV.togglePower();
        controlTV.volumenMas();
        controlTV.canalMas();

        ((ControlRemotoAvanzado) controlTV).silenciar();


        System.out.println("------------------");

        Dispositivo radio = new Radio();
        ControlRemoto controlRadio = new ControlRemoto(radio);

        controlRadio.togglePower();
        controlRadio.volumenMas();
        controlRadio.canalMas();
        ControlRemotoAvanzado controlRadio2 = new ControlRemotoAvanzado(radio);
        controlRadio2.togglePower();
        controlRadio2.silenciar();

    }
}
