package poo;

import com.exercicio.Main;

public class Livro {
    private String titulo;
    private int ano, edicao, numeroDeFolhas;
    private String codigoAutor, codigoEditora, codigoArea;

    public Livro(String titulo, int ano, int edicao, int numeroDeFolhas, String codigoAutor, String codigoEditora, String codigoArea) {
        this.titulo = titulo;
        this.ano = ano;
        this.edicao = edicao;
        this.numeroDeFolhas = numeroDeFolhas;
        this.codigoAutor = codigoAutor;
        this.codigoEditora = codigoEditora;
        this.codigoArea = codigoArea;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getNumeroDeFolhas() {
        return numeroDeFolhas;
    }

    public void setNumeroDeFolhas(int numeroDeFolhas) {
        this.numeroDeFolhas = numeroDeFolhas;
    }

    public String getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(String codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public String getCodigoEditora() {
        return codigoEditora;
    }

    public void setCodigoEditora(String codigoEditora) {
        this.codigoEditora = codigoEditora;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", ano=" + ano +
                ", edicao=" + edicao +
                ", numeroDeFolhas=" + numeroDeFolhas +
                ", autor='" + Main.autores.get(codigoAutor).toString() + '\'' +
                ", editora='" + Main.editoras.get(codigoEditora).toString() + '\'' +
                ", area='" + Main.areas.get(codigoArea).toString() + '\'' +
                '}';
    }
}
