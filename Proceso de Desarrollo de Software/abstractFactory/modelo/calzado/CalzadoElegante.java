package abstractFactory.modelo.calzado;

import abstractFactory.interfaz.ICalzado;

public class CalzadoElegante implements ICalzado {
    @Override
    public boolean tieneTacos() {
        System.out.println("Calzado: Viene con tacos");
        return true;
    }

    @Override
    public boolean sirveParaCorrer() {
        System.out.println("Calzado: Es apto para correr");
        return false;
    }
}
