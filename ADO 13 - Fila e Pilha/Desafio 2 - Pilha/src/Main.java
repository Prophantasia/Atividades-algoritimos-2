public class Main {
    public static void main(String[] args) throws Exception {

        Ui ui = new Ui();
        boolean rodar = true;
        Playlist play = new Playlist();

        // Menu
        while(rodar != false) {
            int opcao = ui.menu();

            if (opcao == 1) {
                
                // Insiro informações na minha classe Musica
                Musica musica = new Musica();
                musica.setNome(ui.entrada("Nome da música: ", ui.semIcone));
                musica.setArtista(ui.entrada("Nome do artista: ", ui.semIcone));
                musica.setCodYoutube(ui.entrada("Código da música: ", ui.semIcone));
                
                // Adiciono na minha playlist
                play.adicionar(musica);   

            } else if (opcao == 2) {
                
                play.tocarProxima();

            } else if (opcao == 3) {

                // Mostrar a fila
                play.exibirMusicas();

            } else if (opcao == 0) {
                
                // Fechar o menu
                rodar = false;
            } else

                // Digitou um valor que não estava no menu
                ui.saida("Você digitou um valor inválido", ui.avisoIcone);
        }
    }
}
