package factoryMethod.factory;

import factoryMethod.modelo.Auto;
import factoryMethod.interfaz.IVehiculo;

public class AutoFactory extends VehiculoFactory{
    @Override
    public IVehiculo crearVehiculo(){
        return new Auto();
    }
}
