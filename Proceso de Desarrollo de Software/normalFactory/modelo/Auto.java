package normalFactory.modelo;

import normalFactory.interfaz.IVehiculo;

public class Auto implements IVehiculo {
    @Override
    public void arrancar() {
        System.out.println("Auto --> arrancar");
    }

    @Override
    public void detener() {
        System.out.println("Auto --> detener");

    }
}
