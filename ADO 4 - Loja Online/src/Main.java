public class Main {
    public static void main(String[] args) throws Exception {

        // Ui
        Ui ui = new Ui();
        while (ui.rodar) {

            // Menu
            int opcao = Integer.parseInt(ui.entrada(ui.menu, ui.titulo, ui.semIcone));

            // Dados do cliente e nota fiscal
            if (opcao == 1) {

                // Entradas
                
                
            }

            // Sair
            if (opcao == 2)
                ui.rodar = false;
            else
                ui.saida("Você digitou uma opção inválida!", ui.titulo, ui.erroIcone);
        }
    }
}
