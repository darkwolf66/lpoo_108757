package poo;

public class Area {
    private String nome;

    public Area(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Area{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
