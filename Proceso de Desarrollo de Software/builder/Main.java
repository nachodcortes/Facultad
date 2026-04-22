package builder;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado.EmpleadoBuilder()
                .setEdad(23)
                .setNombre("Juanito")
                .setGenero("f")
                .setTelefonos("123456","999")
                .setTelefonos("456789","998")
                .build();
        System.out.println(empleado);
    }
}
