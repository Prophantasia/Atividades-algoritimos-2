import javax.swing.JOptionPane;

public class Ui {

    private String titulo = "Mooozika";
    private String menu = "                              Playlist\n\n1 - Adicionar musica na playlit\n2 - Remover \n3 - Buscar\n4 - Exibir Playlist\n5 - Ordernar\n0 - Sair";
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
