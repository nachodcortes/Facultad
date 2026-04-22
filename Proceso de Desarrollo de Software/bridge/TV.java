package bridge;

public class TV implements Dispositivo{
    private boolean encendido = false;
    private int volumen = 10;
    private int canal = 1;

    @Override
    public boolean estaEncendido() {
        return encendido;
    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("TV encendida");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("TV apagada");
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public void setVolumen(int volumen) {
        this.volumen = volumen;
        System.out.println("Volumen TV: " + this.volumen);
    }

    @Override
    public int getCanal() {
        return canal;
    }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;
        System.out.println("Canal TV: " + this.canal);
    }

}
