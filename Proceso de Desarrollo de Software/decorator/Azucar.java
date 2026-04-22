package decorator;

public class Azucar extends AgregadoDecorator {
    public Azucar(BebidaComponent bebida) {
        super(bebida);
    }

    @Override
    public String mostrarDescripcion()
    { return bebida.mostrarDescripcion() +  " + Azucar " ;   }

    @Override
    public Double mostrarPrecio() {
        return bebida.mostrarPrecio() + 1;
    }
}
