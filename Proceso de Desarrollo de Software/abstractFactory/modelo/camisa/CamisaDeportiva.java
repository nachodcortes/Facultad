package abstractFactory.modelo.camisa;

import abstractFactory.interfaz.ICamisa;

public class CamisaDeportiva implements ICamisa {
    @Override
    public boolean tieneMangasLargas() {
        System.out.println("Camisa: No viene en mangas cortas");
        return false;
    }

    @Override
    public boolean tieneBotones() {
        System.out.println("Camisa: No tiene botones");
        return true;
    }
}
