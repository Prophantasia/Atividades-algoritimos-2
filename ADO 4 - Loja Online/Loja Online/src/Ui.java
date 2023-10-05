import javax.swing.JOptionPane;

public class Ui {

    boolean rodar = true;
    String menu = "1- Inserir dados e calcular nota fiscal (Terminal) \n2- Sair";
    String titulo = "Loja Online";
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

    public void pularLinha() {
        System.out.println("\n");
    }

    public void NotaFiscal(NotaFiscal notaFiscal, Item[] itemLista, Compra compra) {
        pularLinha();
        pularLinha();
        System.out.println("################################");
        System.out.println("      NOTA FISCAL GERADA     ");
        System.out.println("################################");
        System.out.printf("\nNome: %s", notaFiscal.getCliente().getNome());
        System.out.printf("\nEMAIL: %s", notaFiscal.getCliente().getEmail());

        for (int i = 0; i < itemLista.length; i++) {
            System.out.printf("\n\nNOME PRODUTO: %s", itemLista[i].getNome());
            System.out.printf("\nPREÇO: R$%.2f", itemLista[i].getPreco());
        }

        pularLinha();
        System.out.printf("VALOR A PAGAR");
        System.out.printf("\nCOD. NOTA: %d", notaFiscal.getCodNota());
        System.out.printf("\nPARCELAS: %s", compra.getParcelas());
        System.out.printf("\nCUPOM: %s", compra.getCupom());
        System.out.printf("\nFORMA DE PAG: %s", compra.getFormaPag());
        System.out.printf("\nVALOR FINAL: R$%.2f", notaFiscal.getTotal());
        System.out.println("\n################################");

    }
}