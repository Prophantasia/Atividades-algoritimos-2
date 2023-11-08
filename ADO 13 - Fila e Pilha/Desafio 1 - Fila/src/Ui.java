import javax.swing.JOptionPane;

public class Ui {

    private String titulo = "ADO 13";
    private String menu = "                         Outback Mania\n\n1 - Adicionar reserva\n2 - Chamar Próximo \n3 - Listar Reservas\n\n0 - Sair";
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
