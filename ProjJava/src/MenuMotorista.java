import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuMotorista {
    private final Menu menuPrincipal;

    public MenuMotorista(Menu menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }

    public void exibirMenuMotorista() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("|------------------------------------------|");
            System.out.println("|  O que voce deseja fazer como Motorista  |");
            System.out.println("|------------------------------------------|");
            System.out.println("|      1 - Cadastrar uma nova Viagem       |");
            System.out.println("| 2 - Consultar passageiros de uma viagem  |");
            System.out.println("|     3 - Verificar media de avaliações    |");
            System.out.println("|      4 - Verificar dados cadastrados     |");
            System.out.println("|          5 - Voltar ao inicio            |");
            System.out.println("|------------------------------------------|");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarViagem(scanner);
                    break;
                case 2:
                    // Adicione a lógica relevante
                    break;
                case 3:
                    // Adicione a lógica relevante
                    break;
                case 4:
                    // Adicione a lógica relevante
                    break;
                case 5:
                    System.out.println("Voltando ao Menu Principal...");
                    menuPrincipal.exibirMenu();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (true);
    }

    private void cadastrarViagem(Scanner scanner) {
        System.out.print("Qual a quantidade de lugares disponíveis no veículo: ");
        int lugares = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a coordenada x do local de partida: ");
        double partidaX = scanner.nextDouble();
        System.out.print("Digite a coordenada y do local de partida: ");
        double partidaY = scanner.nextDouble();
        Localidade partida = new Localidade(partidaX, partidaY);

        System.out.print("Digite a coordenada x do destino: ");
        double destinoX = scanner.nextDouble();
        System.out.print("Digite a coordenada y do destino: ");
        double destinoY = scanner.nextDouble();
        Localidade destino = new Localidade(destinoX, destinoY);

        System.out.print("Quantos locais de passagem o motorista vai ter? ");
        int numLocais = scanner.nextInt();
        scanner.nextLine();

        List<Localidade> locaisPassagem = new ArrayList<>();
        for (int i = 0; i < numLocais; i++) {
            System.out.print("Digite a coordenada x do local de passagem " + (i + 1) + ": ");
            double localX = scanner.nextDouble();
            System.out.print("Digite a coordenada y do local de passagem " + (i + 1) + ": ");
            double localY = scanner.nextDouble();
            locaisPassagem.add(new Localidade(localX, localY));
        }

        Viagem novaViagem = new Viagem(lugares, partida, destino, locaisPassagem);
        CadastroViagem.adicionarViagem(novaViagem);

        System.out.println("Viagem cadastrada com sucesso: " + novaViagem);
    }
}