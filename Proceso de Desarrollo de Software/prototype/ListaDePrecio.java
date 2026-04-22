package prototype;

import java.util.ArrayList;
import java.util.List;

public class ListaDePrecio implements IPrototype {
    private String nombre;
    private List<Producto> listaDeProductos = new ArrayList<>();

    public ListaDePrecio(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public IPrototype clonacion() {
        ListaDePrecio clon = new ListaDePrecio(this.nombre);
        clon.setListaDeProductos(this.listaDeProductos);
        return clon;
    }

    @Override
    public IPrototype clonacionProfunda() {
        ListaDePrecio listaClonado = new ListaDePrecio(this.nombre);
        List<Producto> productosClonados = new ArrayList<Producto>();
        for (Producto producto: listaDeProductos) {
            Producto productoClonado = (Producto) producto.clonacion();
            productosClonados.add(productoClonado);
        }
        listaClonado.setListaDeProductos(productosClonados);
        return listaClonado;
    }
    //


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    @Override
    public String toString() {
        return  "("+Integer.toHexString(System.identityHashCode(this))+")"+
                " - ListaDePrecio{" +
                "nombre='" + nombre + '\'' +
                ", listaDeProductos=" + listaDeProductos.toString() +
                '}';
    }
}
