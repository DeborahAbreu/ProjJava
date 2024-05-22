import java.util.ArrayList;
import java.util.List;

public class CadastroViagem {
    private static List<Viagem> viagens = new ArrayList<>();

    public static void adicionarViagem(Viagem viagem) {
        viagens.add(viagem);
    }

    public static List<Viagem> getViagens() {
        return viagens;
    }
}