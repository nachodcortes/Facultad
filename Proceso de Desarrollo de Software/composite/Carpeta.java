package composite;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements ElementoSistema{
    private String nombre;
    private List<ElementoSistema> elementos;

    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.elementos = new ArrayList<>();
    }

    public void agregar(ElementoSistema elemento) {
        elementos.add(elemento);
    }

    public void eliminar(ElementoSistema elemento) {
        elementos.remove(elemento);
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Carpeta: " + nombre);
        for (ElementoSistema e : elementos) {
            e.mostrarNombre();
        }
    }

    @Override
    public int calcularTamanio() {
        int total = 0;
        for (ElementoSistema e : elementos) {
            total += e.calcularTamanio();
        }
        return total;
    }

}
