package Aula1010;

public class Main {
    public static void main(String[] args) {

        Ui ui = new Ui();
        GerenciadorPlaylist gerenciadorPlaylist = new GerenciadorPlaylist();
        boolean rodar = true;

        // Menu
        while (rodar) {

            int opcao = ui.menu();

            // Adicionar item na lista
            if (opcao == 1) {

                Musica musica = new Musica();
                musica.setNome((ui.entrada("Adicione o nome da música: ", ui.semIcone)));
                musica.setArtista((ui.entrada("Adicione o artista da música: ", ui.semIcone)));

                gerenciadorPlaylist.adicionar(musica);
            }

            // Remover item da lista
            else if (opcao == 2) {
                gerenciadorPlaylist
                        .remover(Integer.parseInt(ui.entrada("Digite a posição que deseje remover: ", ui.semIcone)));
            }

            // Buscar da lista
            else if (opcao == 3) {
                ui.saida("O index da música é: " + Integer.toString(
                        gerenciadorPlaylist.buscar(ui.entrada("Digite a musica que deseje buscar: ", ui.semIcone))),
                        ui.semIcone);
            }

            // Exibir a lista
            else if (opcao == 4) {
                gerenciadorPlaylist.exibirPlaylist();
            }

            // Parar o Programa
            else if (opcao == 0)
                rodar = false;

            // Digitou um valor inválido
            else
                ui.saida("Você digitou um valor inválido", ui.avisoIcone);
        }

    }
}