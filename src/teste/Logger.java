package teste;

public class Logger {
    private static Logger instance;

    private Logger() {
        // Construtor privado
    }

    public static Logger getInstance() {
        if (instance == null) {
            System.out.println("Logger criado!");
            instance = new Logger();
        }
        return instance;
    }

    public void log(String mensagem) {
        System.out.println("[LOG] " + mensagem);
    }
}
