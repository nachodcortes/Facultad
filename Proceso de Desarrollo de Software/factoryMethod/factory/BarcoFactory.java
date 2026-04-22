package factoryMethod.factory;

import factoryMethod.interfaz.IVehiculo;
import factoryMethod.modelo.Barco;

public class BarcoFactory extends VehiculoFactory{
    @Override
    public IVehiculo crearVehiculo(){
        return new Barco();
    }

}
