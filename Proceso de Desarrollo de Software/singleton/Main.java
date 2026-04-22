package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("singleton: " + singleton);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton2: " + singleton2);
        Singleton singleton3 = Singleton.getInstance();
        System.out.println("singleton3: " + singleton3);
    }
}
