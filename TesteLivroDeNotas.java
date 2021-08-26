import javax.swing.JOptionPane;

public class TesteLivroDeNotas {

public static void main(String[] args) {
    
    LivroDeNotas livroDeNotas; // poderia ser qualquer um o nome da variavel
    livroDeNotas = new LivroDeNotas();
    String nomeDoCurso = JOptionPane.showInputDialog("digite o nome do curso"); //poderia ser qualquer um o nome da variavel
    livroDeNotas.nomeDoCurso = nomeDoCurso;
    livroDeNotas.ExibirMensagem();

    LivroDeNotas outroLivro = new LivroDeNotas();
    String outroNome = JOptionPane.showInputDialog("Nome do segundo curso");
    outroLivro.nomeDoCurso = outroNome;
    outroLivro.ExibirMensagem();

    System.out.println("terminado...");
    }
   
}
