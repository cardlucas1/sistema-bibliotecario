import javax.swing.*;
import java.util.*;
import java.time.*;

public class Emprestimo {
    private LocalDateTime data = LocalDateTime.now();
    private Livro livro = null;
    private Pessoa pessoa = null;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void mostraEmprestimo() {

    }
}
