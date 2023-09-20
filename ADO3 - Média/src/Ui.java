import javax.swing.JOptionPane;

public class Ui {

    boolean rodar = true;
    String menu = "1- Calcular Boletim \n2- Sair";
    String titulo = "Programa da Média";
    int semIcone = -1;
    int erroIcone = 2;

    public String entrada(String mensagem, String titulo, int tipoMensagem) {
        return JOptionPane.showInputDialog(null, mensagem, titulo, tipoMensagem);
    }

    public void saida(String mensagem, String titulo, int tipoMensagem) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, tipoMensagem);
    }
}
