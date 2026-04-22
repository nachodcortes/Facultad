package bridge;

public class Radio implements Dispositivo{
    private boolean encendido = false;
    private int volumen = 5;
    private int canal = 101;

    @Override
    public boolean estaEncendido() {
        return encendido;
    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Radio encendida");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Radio apagada");
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public void setVolumen(int volumen) {
        this.volumen = volumen;
        System.out.println("Volumen Radio: " + this.volumen);
    }

    @Override
    public int getCanal() {
        return canal;
    }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;
        System.out.println("Frecuencia Radio: " + this.canal);
    }

}
