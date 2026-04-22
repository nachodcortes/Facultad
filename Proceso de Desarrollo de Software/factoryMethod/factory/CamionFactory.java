package factoryMethod.factory;

import factoryMethod.modelo.Camion;
import factoryMethod.interfaz.IVehiculo;

public class CamionFactory extends VehiculoFactory{
    @Override
    public IVehiculo crearVehiculo(){
        return new Camion();
    }
}
