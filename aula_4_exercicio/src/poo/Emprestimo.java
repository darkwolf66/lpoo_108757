package poo;

import java.util.Date;

public class Emprestimo {
    private Date dataDoEmprestimo;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Date dataDoEmprestimo, Livro livro, Usuario usuario) {
        this.dataDoEmprestimo = dataDoEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
    }

    public Date getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(Date dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "dataDoEmprestimo=" + dataDoEmprestimo +
                ", livro=" + livro +
                ", usuario=" + usuario +
                '}';
    }
}
