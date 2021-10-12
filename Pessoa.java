import javax.swing.*;
import java.util.*;

public class Pessoa {
    private String nome;
    private String cpf;
    private String mostradora = "";

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostraUsuario(ArrayList<Pessoa>usuarios) {
        for (int i = 0; i < usuarios.size(); i++) {
            mostradora = mostradora + "Nome: " + usuarios.get(i).getNome() + "\n" + "CPF: " + usuarios.get(i).getCpf() + "\n\n";
        }
        JOptionPane.showMessageDialog(null,
                mostradora,
                "Sistema Bibliotecário da FMM.",
                JOptionPane.PLAIN_MESSAGE);
    }
}