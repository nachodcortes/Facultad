package abstractFactory.modelo.camisa;

import abstractFactory.interfaz.ICamisa;

public class CamisaElegante implements ICamisa {
    @Override
    public boolean tieneMangasLargas() {
        System.out.println("Camisa: Tiene mangas largas");
        return false;
    }

    @Override
    public boolean tieneBotones() {
        System.out.println("Camisa: Tiene botones");
        return true;
    }
}
