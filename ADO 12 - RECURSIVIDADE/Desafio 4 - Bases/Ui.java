import javax.swing.JOptionPane;

public class Ui {

    private String titulo = "ADO 12";
    public int semIcone = -1;
    public int avisoIcone = 2;

    public String entrada (String mensagem, int icone) {
        String entrada =JOptionPane.showInputDialog(null, mensagem, titulo, icone);
        return entrada;
    }
    
    public void saida (String mensagem, int icone) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, icone);
    }
}