package normalFactory.factory;

import normalFactory.interfaz.IVehiculo;
import normalFactory.modelo.Auto;
import normalFactory.modelo.Barco;
import normalFactory.modelo.Camion;

public class VehiculoFactory {
    public IVehiculo crearVehiculo(String tipoDeVehiculo){
        if (tipoDeVehiculo.equalsIgnoreCase("Auto")){
            return new Auto();
        }
        if (tipoDeVehiculo.equalsIgnoreCase("Camion")){
            return new Camion();
        }
        if (tipoDeVehiculo.equalsIgnoreCase("Barco")){
            return new Barco();
        }
       return null;
    }

}
