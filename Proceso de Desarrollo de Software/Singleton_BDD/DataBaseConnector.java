package Singleton_BDD;

public class DataBaseConnector {
    private static DataBaseConnector databaseConnectorInstance;

    private DataBaseConnector(){
        System.out.println("Creating object");
    }

    public static DataBaseConnector getInstance(){

        if(databaseConnectorInstance == null){
            databaseConnectorInstance = new DataBaseConnector();
        }
        return databaseConnectorInstance;
    }

    public void connectDatabase(){

        if(databaseConnectorInstance == null){
            throw new NullPointerException("La instancia no ha sido creada");
        }

        System.out.println("Connecting to Database " + databaseConnectorInstance);
    }

    public void disconnectDatabase(){

        if(databaseConnectorInstance == null){
            throw new NullPointerException("La instancia no ha sido creada");
        }

        System.out.println("Disconnecting to Database " + databaseConnectorInstance);
    }
}
