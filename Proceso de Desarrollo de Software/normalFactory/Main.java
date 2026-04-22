package normalFactory;

import normalFactory.factory.VehiculoFactory;
import normalFactory.interfaz.IVehiculo;
import normalFactory.tipo.TipoDeVehiculo;

public class Main {
    public static void main(String[] args) {
        VehiculoFactory factory = new VehiculoFactory();
        //IVehiculo vehiculo = factory.crearVehiculo(String.valueOf(TipoDeVehiculo.Auto));
        IVehiculo vehiculo1 = factory.crearVehiculo(TipoDeVehiculo.AUTO.name());
        IVehiculo vehiculo2 = factory.crearVehiculo(TipoDeVehiculo.CAMION.name());
        IVehiculo vehiculo3 = factory.crearVehiculo(TipoDeVehiculo.BARCO.name());

        vehiculo1.arrancar();
        vehiculo2.arrancar();
        vehiculo3.arrancar();
    }
}
