package teste;

public class Singleton {
    private static Singleton instance = null;
    private final int identificador;

    private Singleton() {
        this.identificador = 4455;
    }

    public static synchronized Singleton getInstancia() {
        if (instance == null) {
            System.out.println("Novo objeto criado!");
            instance = new Singleton();
        }
        return instance;
    }

    public int retornarInformacao() {
        return identificador;
    }
}
