import javax.swing.*;
import java.util.*;

public class Livro {
    private String nome;
    private String isbn;
    private String mostradora = "";

    public String getNome() {
        return nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void mostraLivro(ArrayList<Livro>acervo) {
        for (int i = 0; i < acervo.size(); i++) {
            mostradora = mostradora + "Nome: " + acervo.get(i).getNome() + "\n" + "ISBN: " + acervo.get(i).getIsbn() + "\n\n";
        }
        JOptionPane.showMessageDialog(null,
                mostradora,
                "Sistema Bibliotecário da FMM",
                JOptionPane.PLAIN_MESSAGE);
    }
}