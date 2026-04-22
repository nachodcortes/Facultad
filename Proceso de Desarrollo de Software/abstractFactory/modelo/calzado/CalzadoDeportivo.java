package abstractFactory.modelo.calzado;

import abstractFactory.interfaz.ICalzado;

public class CalzadoDeportivo implements ICalzado {
    @Override
    public boolean tieneTacos() {
        System.out.println("Calzado: No tiene tacos");
        return false;
    }

    @Override
    public boolean sirveParaCorrer() {
        System.out.println("Calzado: Es apto para correr");
        return true;
    }
}
