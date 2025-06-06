package teste;

public class Incremental {
    private static int count = 0;
    private final int numero;
    private static Incremental instancia;

    private Incremental() {
        numero = ++count;
    }

    public static Incremental getInstancia() {
        if (instancia == null) {
            instancia = new Incremental();
        }
        return instancia;
    }

    @Override
    public String toString() {
        return "Incremental " + numero;
    }
}
