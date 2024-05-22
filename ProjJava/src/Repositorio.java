import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private static final List<Motorista> motoristas = new ArrayList<>();
    private static final List<Passageiro> passageiros = new ArrayList<>();

    public static void inicializarCadastrosProntos() {
        Motorista motorista1 = new Motorista("Motorista 1", "Endereço 1", "motorista1@example.com", "senha123", "123456789", "ABC123");
        Motorista motorista2 = new Motorista("Motorista 2", "Endereço 2", "motorista2@example.com", "senha456", "987654321", "DEF456");
        Motorista motorista3 = new Motorista("Motorista 3", "Endereço 3", "motorista3@example.com", "senha789", "111222333", "GHI789");
        Motorista motorista4 = new Motorista("Motorista 4", "Endereço 4", "motorista4@example.com", "senhaabc", "444555666", "JKL012");

        adicionarMotorista(motorista1);
        adicionarMotorista(motorista2);
        adicionarMotorista(motorista3);
        adicionarMotorista(motorista4);

        Passageiro passageiro1 = new Passageiro("Passageiro 1", "Endereço 1", "passageiro1@example.com", "senha123", "123456789");
        Passageiro passageiro2 = new Passageiro("Passageiro 2", "Endereço 2", "passageiro2@example.com", "senha456", "987654321");
        Passageiro passageiro3 = new Passageiro("Passageiro 3", "Endereço 3", "passageiro3@example.com", "senha789", "111222333");
        Passageiro passageiro4 = new Passageiro("Passageiro 4", "Endereço 4", "passageiro4@example.com", "senhaabc", "444555666");

        adicionarPassageiro(passageiro1);
        adicionarPassageiro(passageiro2);
        adicionarPassageiro(passageiro3);
        adicionarPassageiro(passageiro4);
    }

    public static List<Motorista> getMotoristas() {
        return motoristas;
    }

    public static List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public static void adicionarMotorista(Motorista motorista) {
        motoristas.add(motorista);
    }

    public static void adicionarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public static void adicionarUsuario(Usuario usuario) {
    }

    public static Usuario buscarUsuarioPorEmail(String email) {
        return null;
    }

    public static boolean usuarioJaCadastrado(String nome, String endereco, String email, String senha, String telefone) {
        return false;
    }
}