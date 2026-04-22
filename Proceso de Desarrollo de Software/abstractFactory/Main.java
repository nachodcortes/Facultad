package abstractFactory;

import abstractFactory.factory.EleganteRopaFactory;
import abstractFactory.modelo.calzado.CalzadoElegante;
import abstractFactory.modelo.camisa.CamisaElegante;
import abstractFactory.modelo.pantalon.PantalonElegante;

public class Main {
    public static void main(String[] args) {
        EleganteRopaFactory fabricaRE  = new EleganteRopaFactory();
        CamisaElegante camisaE = (CamisaElegante) fabricaRE.crearCamisa();
        PantalonElegante pantalonE = (PantalonElegante) fabricaRE.crearPantalon();
        CalzadoElegante calzadoE = (CalzadoElegante) fabricaRE.crearCalzado();

        camisaE.tieneBotones();
        camisaE.tieneMangasLargas();
        pantalonE.esCorto();
        pantalonE.tieneCierre();
    }
}
