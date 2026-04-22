package builder;

public class Direccion {
    private String calle;
    private int numero;
    private String barrio;
    private String localidad;
    private String partido;
    private int codigoPostal;

    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.barrio = "";
        this.localidad = "";
        this.partido = "";
        this.codigoPostal = 0;
    }

    public Direccion(String calle, int numero, String barrio, String localidad, String partido, int codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
        this.localidad = localidad;
        this.partido = partido;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Direccion: (" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", barrio='" + barrio + '\'' +
                ", localidad='" + localidad + '\'' +
                ", partido='" + partido + '\'' +
                ", codigoPostal=" + codigoPostal +
                ')';
    }
}

