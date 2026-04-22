package prototype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Producto  implements IPrototype {
    private String nombre;
    private int precio;
    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public IPrototype clonacion() {
        Producto productoClonado = new Producto(nombre, precio);
        return productoClonado;
    }

    @Override
    public IPrototype clonacionProfunda() {
       return this.clonacion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  Integer.toHexString(System.identityHashCode(this))+
                " - Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
