package Singleton_BDD;

public class Main {
    public static void main(String[] args) {
        DataBaseConnector databaseConnector = DataBaseConnector.getInstance();
        System.out.println("databaseConnector = " + databaseConnector);

        DataBaseConnector databaseConnector1 = DataBaseConnector.getInstance();
        System.out.println("databaseConnector1 = " + databaseConnector1);

        System.out.println("\n");
        databaseConnector.connectDatabase();
        databaseConnector1.connectDatabase();
        System.out.println("\n");

        databaseConnector.disconnectDatabase();
        databaseConnector1.disconnectDatabase();
    }
}
