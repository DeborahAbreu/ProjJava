import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuPassageiro {

    private static Menu menuPrincipal;

    public MenuPassageiro(Menu menuPrincipal) {
        MenuPassageiro.menuPrincipal = menuPrincipal;
    }

    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("|------------------------------------------|");
            System.out.println("|  O que você deseja fazer como Passageiro |");
            System.out.println("|------------------------------------------|");
            System.out.println("|            1 - Buscar Viagem             |");
            System.out.println("|          2 - Avaliar uma viagem          |");
            System.out.println("|      3 - Verificar dados cadastrados     |");
            System.out.println("|          4 - Voltar ao início            |");
            System.out.println("|------------------------------------------|");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    buscarViagem(scanner);
                    break;
                case 2:
                    System.out.println("Escolha abaixo qual viagem você deseja avaliar...");
                    // Implementar como avaliar uma viagem
                    break;
                case 3:
                    // Implementar verificação de dados cadastrados
                    break;
                case 4:
                    System.out.println("Voltando ao Menu Principal...");
                    menuPrincipal.exibirMenu();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void buscarViagem(Scanner scanner) {
        System.out.print("Para onde você deseja ir? Digite o destino desejado: ");
        String destinoDesejado = scanner.nextLine();

        List<Viagem> viagens = CadastroViagem.getViagens();

        List<Viagem> viagensComDestino = new ArrayList<>();

        for (Viagem viagem : viagens) {
            if (viagem.getDestino().getNome().equalsIgnoreCase(destinoDesejado) ||
                    viagem.getLocaisPassagem().stream().anyMatch(localidade -> localidade.getNome().equalsIgnoreCase(destinoDesejado))) {
                viagensComDestino.add(viagem);
            }
        }

        if (viagensComDestino.isEmpty()) {
            System.out.println("Não há viagens disponíveis para o destino especificado.");
            return;
        }

        System.out.println("Viagens disponíveis para o destino " + destinoDesejado + ":");
        for (int i = 0; i < viagensComDestino.size(); i++) {
            Viagem viagem = viagensComDestino.get(i);
            System.out.println("Viagem " + (i + 1) + ":");
            System.out.println("  - Quantidade de lugares: " + viagem.getLugares());
            System.out.println("  - Ponto inicial: " + viagem.getPartida());
            System.out.println("  - Ponto final: " + viagem.getDestino());
            System.out.println("  - Locais de passagem: " + viagem.getLocaisPassagem());
            System.out.println();
        }

        System.out.print("Escolha o número da viagem que você deseja pegar carona: ");
        int escolhaViagem = scanner.nextInt();
        scanner.nextLine();

        if (escolhaViagem < 1 || escolhaViagem > viagensComDestino.size()) {
            System.out.println("Escolha inválida.");
            return;
        }

        Viagem viagemEscolhida = viagensComDestino.get(escolhaViagem - 1);
        System.out.println("Você escolheu a Viagem " + escolhaViagem);
        System.out.println("  - Quantidade de lugares: " + viagemEscolhida.getLugares());
        System.out.println("  - Ponto inicial: " + viagemEscolhida.getPartida());
        System.out.println("  - Ponto final: " + viagemEscolhida.getDestino());
        System.out.println("  - Locais de passagem: " + viagemEscolhida.getLocaisPassagem());
    }

    public static void main(String[] args) {
        MenuPassageiro menu = new MenuPassageiro(new Menu());
        menu.exibirMenu();
    }
}