public class Cliente {

    private int id;
    private String nome;
    private String email;
    private boolean ativo;

    @Override
    public String toString() {
        return "Cliente{" +
                "ativo=" + ativo +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Cliente(boolean ativo, String email, int id, String nome) {
        this.ativo = ativo;
        this.email = email;
        this.id = id;
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
