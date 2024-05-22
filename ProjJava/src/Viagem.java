import java.util.List;

public class Viagem {
    private int lugares;
    private Localidade partida;
    private Localidade destino;
    private List<Localidade> locaisPassagem;

    public Viagem(int lugares, Localidade partida, Localidade destino, List<Localidade> locaisPassagem) {
        this.lugares = lugares;
        this.partida = partida;
        this.destino = destino;
        this.locaisPassagem = locaisPassagem;
    }

    public int getLugares() {
        return lugares;
    }

    public Localidade getPartida() {
        return partida;
    }

    public Localidade getDestino() {
        return destino;
    }

    public List<Localidade> getLocaisPassagem() {
        return locaisPassagem;
    }

    public void reservarLugar() {
        if (lugares > 0) {
            lugares--;
        } else {
            throw new IllegalStateException("Não há lugares disponíveis na viagem.");
        }
    }

    @Override
    public String toString() {
        return "Viagem{" +
                "lugares=" + lugares +
                ", partida=" + partida +
                ", destino=" + destino +
                ", locaisPassagem=" + locaisPassagem +
                '}';
    }
}