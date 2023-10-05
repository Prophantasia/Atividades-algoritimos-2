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
                Item[] itemLista = new Item[compra.getQtdItem()];

                for (int i = 0; i < compra.getQtdItem(); i++) {
                    Item item = new Item();

                    item.setNome(ui.entrada("Nome do item: ", ui.semIcone));
                    item.setPreco(Double.parseDouble(ui.entrada("Preco do item: ", ui.semIcone)));

                    itemLista[i] = item;
                }

                compra.setCliente(cliente);
                compra.setCarrinho(itemLista);

                compra.setFormaPag(ui.entrada(
                        "Formas de pagamento: \n\n- pix\n- credito\n- debito\n\nSelecione a forma de pagamento",
                        ui.semIcone));

                if (compra.getFormaPag().equals("credito")) {
                    compra.setParcelas(Integer.parseInt(ui.entrada("Digite a quantidade de parcelas: ", opcao)));
                }

                // Processamento
                LojaOnline lojaOnline = new LojaOnline();

                NotaFiscal notaFiscal = lojaOnline.efetuarCompra(compra);

                // Saida
                String saidaFinal = "Nota Fiscal\n\n"+"- Cliente"+"\nNome: "+notaFiscal.getCliente().getNome()+"\nEmail: "+notaFiscal.getCliente().getEmail()+"\n";
                String saidaFinal2 = "\nValor a pagar: ";

                ui.saida(saidaFinal, ui.semIcone);

                for (Item item: notaFiscal.getItem()) {
                
                    ui.saida("\n\nNOME DO PRODUTO: "+ item.getNome(), ui.semIcone);
                    ui.saida("\n\nPREÇO DO PRODUTO: "+ item.getPreco(), ui.semIcone);
                }

                ui.saida(saidaFinal2, ui.semIcone);


            }

            // Sair
            if (opcao == 2)
                ui.rodar = false;
            else
                ui.saida("Você digitou uma opção inválida!", ui.erroIcone);
        }
    }
}
