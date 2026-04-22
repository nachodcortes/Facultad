package builder;

public class Telefono {
    private String numero;
    private String prefijo;

    public Telefono(String numero, String prefijo) {
        this.numero = numero;
        this.prefijo = prefijo;
    }

    public Telefono() {
        this.numero = "";
        this.prefijo = "";
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    @Override
    public String toString() {
        return "Telefono: " +
                " (" + prefijo + ") " +
                " numero='" + numero + '\'' ;

    }
}
