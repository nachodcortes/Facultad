package adapter;

public class MotorNaftero extends Motor{

    @Override
    public void arrancar() {
        System.out.println("Motor Naftero --> arrancando");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor Naftero --> acelerando");
    }

    @Override
    public void apagar() {
        System.out.println("Motor Naftero --> apagando"); }

    @Override
    public void cargarCombustible() {
        System.out.println("Motor Naftero --> Desbloquear tapa y cargarCombustible"); }

}
