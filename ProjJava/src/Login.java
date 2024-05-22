public class Login {

    public Login(CadastroUsuario cadastro) {
    }

    public static boolean autenticar(String email, String senha) {
        Usuario usuario = CadastroUsuario.buscarUsuarioPorEmail(email);
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return true;
        }
        return false;
    }
}