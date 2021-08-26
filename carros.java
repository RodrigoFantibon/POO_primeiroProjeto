import javax.swing.JOptionPane;

public class carros {
    public static void main(String[] args) {
        
        atributosCarros especificacoesCarros = new atributosCarros();
        especificacoesCarros.setmodeloCarro(JOptionPane.showInputDialog("Digite o modelo do carro"));
        System.out.println(especificacoesCarros.getmodeloCarro());
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do carro: "));
        especificacoesCarros.setprecoCarro(a);
        System.out.println(especificacoesCarros.getprecoCarro());

        especificacoesCarros.ExibirMensagem();


        
    }
}
