package prototype;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaDePrecio listaDePrecio = new ListaDePrecio("Lista Normal");
        List<Producto> listaDeProductos = List.of(new Producto("PC",2000),
                new Producto("Mesa", 200),
                new Producto("silla", 100));
        listaDePrecio.setListaDeProductos(listaDeProductos);

//        ListaDePrecio copiaListaDePrecio = (ListaDePrecio) listaDePrecio.clonacion();
        ListaDePrecio copiaListaDePrecio = (ListaDePrecio) listaDePrecio.clonacionProfunda();
        copiaListaDePrecio.setNombre("Con Descuento");
        for (Producto producto : copiaListaDePrecio.getListaDeProductos()) {
            producto.setPrecio((int) (producto.getPrecio()*0.5));
        }

        System.out.println(listaDePrecio);
        System.out.println("Copia...");
        System.out.println(copiaListaDePrecio);

    }
}
