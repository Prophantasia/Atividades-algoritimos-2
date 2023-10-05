import javax.swing.JOptionPane;

public class Ui {

    boolean rodar = true;
    String menu = "1- Inserir dados e calcular nota fiscal \n2- Sair";
    String titulo = "Programa da Média";
    int semIcone = -1;
    int erroIcone = 2;

    public String entrada(String mensagem, int tipoMensagem) {
        Ui ui = new Ui();
        return JOptionPane.showInputDialog(null, mensagem, ui.titulo, tipoMensagem);
    }

    public void saida(String mensagem, int tipoMensagem) {
        Ui ui = new Ui();
        JOptionPane.showMessageDialog(null, mensagem, ui.titulo, tipoMensagem);
    }

}
