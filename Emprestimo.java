import javax.swing.*;
import java.text.*;
import java.util.*;

public class Emprestimo {
    private Date dataAtual = new Date();
    private DateFormat parametro_formatacao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private String data_emprestimo = parametro_formatacao.format(dataAtual);
    private Livro livro = null;
    private Pessoa pessoa = null;
    private String mostradora = "";

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void mostraEmprestimo(ArrayList<Emprestimo>emprestimos) {
        for (int i = 0; i < emprestimos.size(); i++) {
            mostradora += "Livro emprestado: " + emprestimos.get(i).livro.getNome() + "\n" +
                            "Nome do usuário: " + emprestimos.get(i).pessoa.getNome() + "\n" +
                            "Data e hora do empréstimo: " + emprestimos.get(i).data_emprestimo + "\n\n";
        }
        JOptionPane.showMessageDialog(null,
                mostradora,
                "Sistema Bibliotecário da FMM",
                JOptionPane.PLAIN_MESSAGE);
    }
}
