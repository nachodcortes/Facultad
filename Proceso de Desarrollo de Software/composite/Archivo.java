package composite;

public class Archivo implements ElementoSistema{
    private String nombre;
    private int tamanio;

    public Archivo(String nombre, int tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    @Override
    public void mostrarNombre() {
        System.out.println("   Archivo: " + nombre + "   ("+tamanio+")");
    }

    @Override
    public int calcularTamanio() {
        return tamanio;
    }

}
