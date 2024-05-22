public class Usuario {
    private String nome;
    private String endereco;
    private String email;
    private String senha;
    private String telefone;

    public Usuario(String nome, String endereco, String email, String senha, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Endereço: " + endereco + ", Email: " + email + ", Telefone: " + telefone;
    }
}