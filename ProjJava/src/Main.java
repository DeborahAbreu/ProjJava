public class Main {

    public static void main(String[] args) {
        CadastroUsuario cadastro = new CadastroUsuario();
        Login login = new Login(cadastro);
        Menu menu = new Menu();

        menu.exibirMenu();
    }
}
