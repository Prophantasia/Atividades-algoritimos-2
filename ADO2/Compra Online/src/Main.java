import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {

        Ui ui = new Ui();
        Compra compra = new Compra();
        Pagamento pag = new Pagamento();

        while (ui.rodar) {

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, ui.menu, ui.titulo, -1));

            if (opcao == 1) {
                compra.setTotal(Double
                        .parseDouble(JOptionPane.showInputDialog(null, "Digite o total da compra: ", ui.titulo, -1)));
                compra.setParcelas(Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Digite o número de parcelas: ", ui.titulo, -1)));

            } else if (opcao == 2) {
                JOptionPane.showMessageDialog(null, String.format(
                        "########################################\n                        EXTRATO DA COMPRA\n########################################\nVALOR TOTAL: R$%.2f\nQUANTIDADE DE PARCELAS: %d\nO VALOR TOTAL COM JUROS: R$%.2f \nVALOR DA PARCELA COM JUROS: R$%.2f\n########################################\n",
                        compra.getTotal(), compra.getParcelas(), pag.calcularTotal(compra),
                        pag.calcularParcelas(pag.calcularTotal(compra), compra.getParcelas())), ui.titulo, -1);
            } else if (opcao == 3)
                ui.rodar = false;
            else
                JOptionPane.showMessageDialog(null, "Você digitou um valor inexistente", "Compra Online", 2);
        }
    }
}
