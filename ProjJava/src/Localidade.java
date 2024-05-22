public class Localidade {
    private String nome;
    private double x;
    private double y;

    public Localidade(double x, double y) {
        this.nome = nome;
        this.x = x;
        this.y = y;
    }

    public String getNome() {
        return nome;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Localidade{" +
                "nome='" + nome + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}