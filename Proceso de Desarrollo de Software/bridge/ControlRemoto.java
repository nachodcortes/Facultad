package bridge;

public class ControlRemoto {
    protected Dispositivo dispositivo;

    public ControlRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void togglePower() {
        if (dispositivo.estaEncendido()) {
            dispositivo.apagar();
        } else {
            dispositivo.encender();
        }
    }

    public void volumenMas() {
        dispositivo.setVolumen(dispositivo.getVolumen() + 1);
    }

    public void volumenMenos() {
        dispositivo.setVolumen(dispositivo.getVolumen() - 1);
    }

    public void canalMas() {
        dispositivo.setCanal(dispositivo.getCanal() + 1);
    }

    public void canalMenos() {
        dispositivo.setCanal(dispositivo.getCanal() - 1);
    }

}
