import javax.swing.JOptionPane;

public class Ui {

    private String titulo = "ADO 13";
    private String menu = "                         Playlist\n\n1 - Adicionar Música\n2 - Tocar Próxima\n3 - Listar Músicas\n\n0 - Sair";
    public int semIcone = -1;
    public int avisoIcone = 2;

    public String entrada (String mensagem, int icone) {
        String entrada =JOptionPane.showInputDialog(null, mensagem, titulo, icone);
        return entrada;
    }
    
    public void saida (String mensagem, int icone) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, icone);
    }

    public int menu () {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, this.menu, titulo, semIcone));
        return opcao;
    }
}
