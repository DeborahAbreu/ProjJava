public class Passageiro extends Usuario {

    public Passageiro(String nome, String endereco, String email, String senha, String telefone) {
        super(nome, endereco, email, senha, telefone);
    }

    @Override
    public String toString() {
        return "Passageiro - " + super.toString();
    }
}