public class Main {
    public static void main(String[] args) throws Exception {

        // Ui
        Ui ui = new Ui();
        while (ui.rodar) {

            // Menu
            int opcao = Integer.parseInt(ui.entrada(ui.menu, ui.semIcone));

            // Dados do cliente e nota fiscal
            if (opcao == 1) {

                // Inicialização dos meus objetos
                Cliente cliente = new Cliente();
                Compra compra = new Compra();

                // Entradas
                cliente.setNome(ui.entrada("Digite o nome do cliente: ", ui.semIcone));
                cliente.setEmail(ui.entrada("Digite o Email do cliente: ", ui.semIcone));
                compra.setCupom(ui.entrada("Insira o cupom: ", ui.semIcone));

                compra.setQtdItem(Integer.parseInt(ui.entrada("Quantos itens o cliente comprou: ", ui.semIcone)));
                Item[] item = new Item[compra.getQtdItem()];

                for (int i = 0; i < compra.getQtdItem(); i++) {

                    String nome = ui.entrada("Nome do item: ", ui.semIcone);
                    double preco = Double.parseDouble(ui.entrada("Preco do item ", ui.semIcone));

                    // POR ALGUM MOTIVO O PROGRAMA PARA
                    // item[i].setNome(nome);
                    // item[i].setPreco(preco);
                }

                compra.setCliente(cliente);
                compra.setCarrinho(item);

                compra.setFormaPag(ui.entrada(
                        "Formas de pagamento: \n\n- pix\n- credito\n- debito\n\nSelecione a forma de pagamento",
                        ui.semIcone));
                if (compra.getFormaPag().equals("credito")) {
                    compra.setParcelas(Integer.parseInt(ui.entrada("Digite a quantidade de parcelas: ", opcao)));
                }

                // Processamento
                LojaOnline lojaOnline = new LojaOnline();

                NotaFiscal notaFiscal = lojaOnline.efetuarCompra(compra);

                ui.saidaFinal(notaFiscal, ui.semIcone);

            }

            // Sair
            if (opcao == 2)
                ui.rodar = false;
            else
                ui.saida("Você digitou uma opção inválida!", ui.erroIcone);
        }
    }
}
