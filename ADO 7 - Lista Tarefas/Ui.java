import javax.swing.JOptionPane;

public class Ui {

    private String titulo = "Lista Tarefa";
    private String menu = "1 - Adicionar tarefa\n2 - Remover tarefa\n3 - Exibir lista\n0 - Sair";
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
