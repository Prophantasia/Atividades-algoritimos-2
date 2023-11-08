public class Main {
    public static void main(String[] args) throws Exception {

        Ui ui = new Ui();
        boolean rodar = true;
        ControladorReserva contRes = new ControladorReserva();

        // Menu
        while(rodar != false) {
            int opcao = ui.menu();

            if (opcao == 1) {
                
                // Insiro informações na minha classe Reserva
                Reserva reserva = new Reserva();
                reserva.setResponsavel(ui.entrada("Nome da reserva: ", ui.semIcone));
                reserva.setLugares(Integer.parseInt(ui.entrada("Quantos lugares: ", ui.semIcone)));
                
                // Adiciono na minha fila
                contRes.adicionar(reserva);   

            } else if (opcao == 2) {
                
                Reserva reserva = contRes.proximo();
                
                // Chama o proximo
                ui.saida("Nome: "+ reserva.getResponsavel() + "\nLugares: "+ reserva.getLugares(), opcao);


            } else if (opcao == 3) {

                // Mostrar a fila
                contRes.exibirReservas();

            } else if (opcao == 0) {
                
                // Fechar o menu
                rodar = false;
            } else

                // Digitou um valor que não estava no menu
                ui.saida("Você digitou um valor inválido", ui.avisoIcone);
        }
    }
}
