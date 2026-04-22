package adapter;

public class Main {
    public static void main(String[] args) {
        Motor motor1= new MotorNaftero();
        motor1.arrancar();
        motor1.acelerar();
        motor1.apagar();
        motor1.cargarCombustible();
        Motor motor2= new MotorAdapter();
        motor2.arrancar();
        motor2.acelerar();
        motor2.apagar();
        motor2.cargarCombustible();
    }
}
