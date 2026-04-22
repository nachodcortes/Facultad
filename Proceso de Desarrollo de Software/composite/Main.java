package composite;

public class Main {
    public static void main(String[] args) {
        // Archivos
        Archivo a1 = new Archivo("documento.txt", 10);
        Archivo a2 = new Archivo("foto.jpg", 20);
        Archivo a3 = new Archivo("video.mp4", 50);

        // Carpetas
        Carpeta carpeta1 = new Carpeta("Mis Documentos");
        Carpeta carpeta2 = new Carpeta("Multimedia");

        // Construcción de la estructura
        carpeta1.agregar(a1);
        carpeta1.agregar(a2);

        carpeta2.agregar(a3);
        carpeta2.agregar(carpeta1); // carpeta dentro de carpeta

        // Mostrar estructura
        carpeta2.mostrarNombre();

        System.out.println("---------------------");

        // Tamaño total
        System.out.println("Tamaño total: " + carpeta2.calcularTamanio());
    }

}
