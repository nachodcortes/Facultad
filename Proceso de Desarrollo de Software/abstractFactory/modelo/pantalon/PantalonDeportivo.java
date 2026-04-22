package abstractFactory.modelo.pantalon;

import abstractFactory.interfaz.IPantalon;

public class PantalonDeportivo implements IPantalon {
    @Override
    public boolean esCorto() {
        System.out.println("Pantalon: Es corto");
        return true;
    }

    @Override
    public boolean tieneCierre() {
        System.out.println("Pantalon: No tiene cierre");
        return false;
    }

    @Override
    public boolean tieneTelaAjustable() {
        System.out.println("Pantlaon: Es con tela ajustable");
        return true;
    }
}
