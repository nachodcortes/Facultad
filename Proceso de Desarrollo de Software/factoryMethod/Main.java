package factoryMethod;

import factoryMethod.factory.AutoFactory;
import factoryMethod.factory.BarcoFactory;
import factoryMethod.factory.CamionFactory;
import factoryMethod.factory.VehiculoFactory;
import factoryMethod.interfaz.IVehiculo;

public class Main {
    public static void main(String[] args) {

        IVehiculo auto = new AutoFactory().crearVehiculo();
        IVehiculo barco = new BarcoFactory().crearVehiculo();
        IVehiculo camion = new CamionFactory().crearVehiculo();
        auto.arrancar();
        barco.arrancar();
        camion.arrancar();
    }
}
