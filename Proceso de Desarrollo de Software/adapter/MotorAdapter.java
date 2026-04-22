package adapter;

public class MotorAdapter extends Motor{

    MotorElectrico motorElectrico =  new MotorElectrico();
    @Override
    public void arrancar() {
        System.out.println("Motor --> arrancando");
        motorElectrico.activar();
        System.out.println(".......................");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor --> acelerar");
        motorElectrico.mover();
        motorElectrico.acelerar();
        System.out.println("............................");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando Motor.......");
        motorElectrico.desactivar();
        System.out.println("......................");
    }

    @Override
    public void cargarCombustible() {
        System.out.println("Cargando .......");
        motorElectrico.enchufar();
        System.out.println("....................");
    }
}
