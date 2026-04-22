package adapter;

public class MotorElectrico {
    private boolean conectado;
    private boolean activo;
    private boolean moviendo;

    public void conectar(){
        conectado = true;
        System.out.println("Motor Electrico --> Conectado al toma");
    }

    public void desconectar(){
        conectado = false;
        System.out.println("Motor Electrico --> Desconectado");
    }

    public void mover(){
        moviendo = true;
        System.out.println("Motor Electrico --> Mover");
    }

    public void acelerar(){
        System.out.println("Motor Electrico --> Acelerar");
    }
    public void desactivar(){
        System.out.println("Motor Electrico --> desactivar");
    }
    public void activar(){
        System.out.println("Motor Electrico --> Activar");
    }
    public void enchufar(){
        System.out.println("Motor Electrico --> Enchufar");
    }

}
