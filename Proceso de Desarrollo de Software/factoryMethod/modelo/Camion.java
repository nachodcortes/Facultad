package factoryMethod.modelo;

import factoryMethod.interfaz.IVehiculo;

public class Camion implements IVehiculo {
    @Override
    public void arrancar() {
        System.out.println("Camion --> arrancar");
    }

    @Override
    public void detener() {
        System.out.println("Camion --> detener");

    }
}
