package decorator;

public class CafeSolo extends BebidaComponent{

    public CafeSolo() {
    }

    @Override
    public String mostrarDescripcion() {
        return "Cafe" ;
    }

    @Override
    public Double mostrarPrecio() {
        return 10.0;
    }

}
