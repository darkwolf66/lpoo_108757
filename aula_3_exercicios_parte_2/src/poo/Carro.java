package poo;

public class Carro {
    String tipo;
    String cor;
    String placa;
    int numPortas;
    Pessoa dono;

    public Carro(String tipo, String cor, String placa, int numPortas, Pessoa dono) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;
        this.dono = dono;
    }
    public Carro(){}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void manobrar(){

    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tipo='" + tipo + '\'' +
                ", cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                ", numPortas=" + numPortas +
                '}';
    }
}
