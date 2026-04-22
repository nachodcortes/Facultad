package builder;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
       private String nombre;
    private int edad;
    private String genero;
    private Direccion direccion;
    List<Telefono> telefonos = new ArrayList<>();
    List<Contacto> contactos = new ArrayList<>();

    public Empleado() {
    }

    public Empleado(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = new Direccion();

    }

    public Empleado(String nombre, int edad, String genero, Direccion direccion, List<Telefono> telefonos, List<Contacto> contactos) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.contactos = contactos;
    }
    public static class EmpleadoBuilder  implements IBuilder <Empleado>{

        private String nombre;
        private int edad;
        private String genero;
        private Direccion direccion = new Direccion();
        List<Telefono> telefonos = new ArrayList<>();
        List<Contacto> contactos = new ArrayList<>();

        public EmpleadoBuilder() {
        }
        public EmpleadoBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }
        public EmpleadoBuilder setEdad(int edad){
            this.edad = edad;
            return this;
        }
        public EmpleadoBuilder setGenero(String genero) {
            this.genero = genero;
            return this;
        }
        public  EmpleadoBuilder setDireccion(Direccion direccion) {
            this.direccion = direccion;
            return this;
        }
        public  EmpleadoBuilder setDireccion(String calle, int numero, String barrio, String localidad, String partido, int codigoPostal) {
            this.direccion = new Direccion(calle,numero,barrio,localidad,partido,codigoPostal);
            return this;
        }
        public EmpleadoBuilder setTelefonos(Telefono telefono) {
            telefonos.add(telefono);
            return this;
        }
        public EmpleadoBuilder setTelefonos(String numero, String prefijo){
            telefonos.add(new Telefono(numero,prefijo));
            return this;
        }
        public EmpleadoBuilder setContactos(Contacto contacto) {
            contactos.add(contacto);
            return this;
        }
        public EmpleadoBuilder setContactos(String nombre, String apellido, Telefono telefono, Direccion direccion){
            contactos.add(new Contacto(nombre,apellido,telefono,direccion));
            return this;
        }


        @Override
        public Empleado build() {
            return new Empleado(nombre,edad,genero,direccion,telefonos,contactos);
        }
    }

    ////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "Empleado ----> " +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                "\n" + direccion +
                "\n" + telefonos +
                "\nContacto: " + contactos;
    }

}
