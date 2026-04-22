package normalFactory.modelo;

import normalFactory.interfaz.IVehiculo;

public class Barco implements IVehiculo {
    @Override
    public void arrancar() {
        System.out.println("Barco --> arrancar");
    }

    @Override
    public void detener() {
        System.out.println("Barco --> detener");

    }
}
