package proxy;

public class Principal {
    public static <Video> void main(String[] args) {
        IVideo video1 = new ProxyVideo(20);
        video1.reproducir(); // permitido

        IVideo video2 = new ProxyVideo(15);
        video2.reproducir(); // bloqueado
    }
}
