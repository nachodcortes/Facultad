package abstractFactory.modelo.pantalon;

import abstractFactory.interfaz.IPantalon;

public class PantalonElegante implements IPantalon {
    @Override
    public boolean esCorto() {
        System.out.println("Pantalon: No es corto");
        return false;
    }

    @Override
    public boolean tieneCierre() {
        System.out.println("Pantalon: Tiene cierre frontal superior");
        return true;
    }

    @Override
    public boolean tieneTelaAjustable() {
        System.out.println("Pantalon: No es con tela ajustable");
        return true;
    }
}
