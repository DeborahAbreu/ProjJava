import java.util.List;

public class CadastroUsuario {
    public static void adicionarUsuario(Usuario usuario) {
        Repositorio.adicionarUsuario(usuario);
    }

    public static Usuario buscarUsuarioPorEmail(String email) {
        return Repositorio.buscarUsuarioPorEmail(email);
    }

    public static boolean usuarioJaCadastrado(String nome, String endereco, String email, String senha, String telefone) {
        return Repositorio.usuarioJaCadastrado(nome, endereco, email, senha, telefone);
    }

    public static void listarUsuarios() {
        List<Motorista> motoristas = Repositorio.getMotoristas();
        List<Passageiro> passageiros = Repositorio.getPassageiros();

        System.out.println("Motoristas:");
        for (Motorista motorista : motoristas) {
            System.out.println(motorista);
        }

        System.out.println("Passageiros:");
        for (Passageiro passageiro : passageiros) {
            System.out.println(passageiro);
        }
    }
}