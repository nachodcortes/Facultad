package proxy;

public class ProxyVideo implements IVideo{
    private int edadUsuario;
    private VideoReal videoReal;

    public ProxyVideo(int edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

    @Override
    public void reproducir() {
        if (edadUsuario >= 18) {
            if (videoReal == null) {
                videoReal = new VideoReal(); // lazy loading
            }
            videoReal.reproducir();
        } else {
            System.out.println("Acceso denegado: contenido para mayores de edad");
        }
    }
}


