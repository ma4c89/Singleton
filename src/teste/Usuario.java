package teste;

public class Usuario {
    private static int contador = 0;
    private int id;
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
        this.id = ++contador;
        Logger.getInstance().log("Novo usuário criado: " + nome + " (ID: " + id + ")");
    }

    public String toString() {
        return "Usuário: " + nome + " | ID: " + id;
    }
}
