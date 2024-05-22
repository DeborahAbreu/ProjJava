import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("|----------------------------------|");
            System.out.println("| Olá, Você já conhece o carOne-M ?|");
            System.out.println("|----------------------------------|");
            System.out.println("|          01- SIM - Login         |");
            System.out.println("|        02- NÃO - Cadastrar       |");
            System.out.println("|----------------------------------|");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Email: ");
                    String emailLogin = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senhaLogin = scanner.nextLine();
                    if (Login.autenticar(emailLogin, senhaLogin)) {
                        System.out.println("Login bem-sucedido!");
                        Usuario usuario = CadastroUsuario.buscarUsuarioPorEmail(emailLogin);
                        if (usuario instanceof Passageiro) {
                            MenuPassageiro.exibirMenu();
                        } else if (usuario instanceof Motorista) {
                            new MenuMotorista(this).exibirMenuMotorista();
                        }
                        return;
                    } else {
                        System.out.println("Email ou senha incorretos.");
                    }
                    break;
                case 2:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    if (CadastroUsuario.usuarioJaCadastrado(nome, endereco, email, senha, telefone)) {
                        System.out.println("Usuário já cadastrado. Redirecionando para login.");
                        System.out.print("Email: ");
                        emailLogin = scanner.nextLine();
                        System.out.print("Senha: ");
                        senhaLogin = scanner.nextLine();
                        if (Login.autenticar(emailLogin, senhaLogin)) {
                            System.out.println("Login bem-sucedido!");
                            Usuario usuario = CadastroUsuario.buscarUsuarioPorEmail(emailLogin);
                            if (usuario instanceof Passageiro) {
                                MenuPassageiro.exibirMenu();
                            } else if (usuario instanceof Motorista) {
                                new MenuMotorista(this).exibirMenuMotorista();
                            }
                            return;
                        } else {
                            System.out.println("Email ou senha incorretos.");
                        }
                    } else {
                        boolean escolhaValida = false;
                        while (!escolhaValida) {
                            System.out.println("|----------------------------------|");
                            System.out.println("|     Como você deseja logar?      |");
                            System.out.println("|----------------------------------|");
                            System.out.println("|          01- Passageiro          |");
                            System.out.println("|          02- Motorista           |");
                            System.out.println("|----------------------------------|");
                            int tipoUsuario = scanner.nextInt();
                            scanner.nextLine(); // Limpar o buffer

                            if (tipoUsuario == 1) {
                                Usuario passageiro = new Passageiro(nome, endereco, email, senha, telefone);
                                CadastroUsuario.adicionarUsuario(passageiro);
                                escolhaValida = true;
                                System.out.println("Cadastro realizado com sucesso!");
                                MenuPassageiro.exibirMenu();
                            } else if (tipoUsuario == 2) {
                                System.out.print("Número da Carteira: ");
                                String numeroCarteira = scanner.nextLine();
                                Usuario motorista = new Motorista(nome, endereco, email, senha, telefone, numeroCarteira);
                                CadastroUsuario.adicionarUsuario(motorista);
                                escolhaValida = true;
                                System.out.println("Cadastro realizado com sucesso!");
                                new MenuMotorista(this).exibirMenuMotorista();
                            } else {
                                System.out.println("Opção inválida. Por favor, escolha novamente.");
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 1 && opcao != 2);

        scanner.close();
    }
}