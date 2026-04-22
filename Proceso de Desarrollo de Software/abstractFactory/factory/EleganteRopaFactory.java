package abstractFactory.factory;

import abstractFactory.interfaz.ICalzado;
import abstractFactory.interfaz.ICamisa;
import abstractFactory.interfaz.IPantalon;
import abstractFactory.interfaz.IRopaFactory;
import abstractFactory.modelo.calzado.CalzadoElegante;
import abstractFactory.modelo.camisa.CamisaElegante;
import abstractFactory.modelo.pantalon.PantalonElegante;

public class EleganteRopaFactory implements IRopaFactory {
    @Override
    public ICalzado crearCalzado() {
        return new CalzadoElegante();
    }

    @Override
    public ICamisa crearCamisa() {
        return new CamisaElegante();
    }

    @Override
    public IPantalon crearPantalon() {
        return new PantalonElegante();
    }
}
