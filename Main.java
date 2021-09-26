import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static ArrayList <Pessoa> usuarios = new ArrayList<Pessoa>();
    public static ArrayList <Livro> acervo = new ArrayList<Livro>();
    public static ArrayList <Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    public static Pessoa p = null;
    public static Livro l = null;
    public static Emprestimo e = null;

    public static void main(String[] args) {
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Bem-Vindo ao Sistema Bibliotecário FMM!\n\n" +
                            "Digite o número referente à opção desejada:\n" +
                            "1. Cadastrar um novo usuário\n" +
                            "2. Cadastrar um novo livro\n" +
                            "3. Fazer o empréstimo de um livro do acervo\n" +
                            "4. Mostrar os usuários cadastrados\n" +
                            "5. Mostrar os livros cadastrados no acervo\n" +
                            "6. Mostrar os empréstimos em andamento\n" +
                            "7. Sair do sistema",
                    "Sistema Bibliotecário da FMM",
                    JOptionPane.PLAIN_MESSAGE));

            switch (op) {
                case 1:
                    p = new Pessoa();
                    p.setNome(JOptionPane.showInputDialog(null,
                            "Insira seu nome completo:",
                            "Sistema Bibliotecário da FMM",
                            JOptionPane.INFORMATION_MESSAGE));
                    p.setCpf(JOptionPane.showInputDialog(null,
                            "Insira seu CPF:",
                            "Sistema Bibliotecário da FMM",
                            JOptionPane.INFORMATION_MESSAGE));
                    usuarios.add(p);
                    JOptionPane.showMessageDialog(null,
                            "Usuário:\n" +
                                    p.getNome() + "\n" +
                                    p.getCpf() + "\n" +
                                    "Cadastrado com sucesso!",
                                "Sistema Bibliotecário da FMM",
                                    JOptionPane.PLAIN_MESSAGE);
                    break;
                case 2:
                    l = new Livro();
                    l.setNome(JOptionPane.showInputDialog(null,
                            "Insira o nome do livro a ser cadastrado:",
                            "Sistema Bibliotecário da FMM",
                            JOptionPane.INFORMATION_MESSAGE));
                    l.setIsbn(JOptionPane.showInputDialog(null,
                            "Insira o ISBN do livro a ser cadastrado:",
                            "Sistema Bibliotecário da FMM",
                            JOptionPane.INFORMATION_MESSAGE));
                    acervo.add(l);
                    JOptionPane.showMessageDialog(null,
                            "Livro:\n" +
                                    l.getNome() + "\n" +
                                    l.getIsbn() + "\n" +
                                    "Cadastrado com sucesso!",
                            "Sistema Bibliotecário da FMM",
                            JOptionPane.PLAIN_MESSAGE);
                    break;
                case 3:
                    int option = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Insira o número correspondente à opção desejada:\n" +
                                    "1. Busca por ISBN \n" +
                                    "2. Busca por Título",
                            "Sistema Bibliotecário da FMM",
                            JOptionPane.INFORMATION_MESSAGE));
                    switch (option) {
                        case 1:
                            String busca_de_ISBN = JOptionPane.showInputDialog(null,
                                    "Digite o ISBN desejado para busca:",
                                    "Sistema Bibliotecário da FMM",
                                    JOptionPane.INFORMATION_MESSAGE);
                            acervo.indexOf(busca_de_ISBN);
                            break;
                        case 2:
                            String busca_de_NOME = JOptionPane.showInputDialog(null,
                                    "Digite o nome desejado para busca:",
                                    "Sistema Bibliotecário da FMM",
                                    JOptionPane.INFORMATION_MESSAGE);

                            break;
                        default:
                            JOptionPane.showMessageDialog(null,
                                    "Opção Inválida\n" +
                                            "Tente novamente com outra opção do menu.",
                                    "Sistema Bibliotecário da FMM",
                                    JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    break;
                case 4:
                    p = new Pessoa();
                    p.mostraUsuario(usuarios);
                    break;
                case 5:
                    l = new Livro();
                    l.mostraLivro(acervo);
                    break;
                case 6:
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,
                            "Saindo do sistema!\n" +
                                    "Muito obrigado por utilizá-lo!",
                            "Sistema Bibliotecário da FMM",
                            JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "A opção inserida é inválida!\n" +
                                    "Tente novamente com outra opção.",
                            "Sistema Bibliotecário da FMM",
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while(op != 7);
    }
}