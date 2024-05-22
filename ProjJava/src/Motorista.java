public class Motorista extends Usuario {
    private String numeroCarteira;

    public Motorista(String nome, String endereco, String email, String senha, String telefone, String numeroCarteira) {
        super(nome, endereco, email, senha, telefone);
        this.numeroCarteira = numeroCarteira;
    }

    public String getNumeroCarteira() {
        return numeroCarteira;
    }

    @Override
    public String toString() {
        return "Motorista - " + super.toString() + ", Número da Carteira: " + numeroCarteira;
    }
}