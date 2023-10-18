package Aula1010;

import java.util.ArrayList;

public class GerenciadorPlaylist {

    private ArrayList<Musica> musicas = new ArrayList<>();

    public void adicionar(Musica musica) {

        Boolean achou = false;
        String nomeMusica = musica.getNome();

        if (musicas.size() == 0) {
            this.musicas.add(musica);
        } else if (musicas.size() >= 1) {
            for (int i = 0; i < musicas.size(); i++) {
                if (musicas.get(i).getNome().equals(nomeMusica)) {
                    achou = true;
                }
            }

            if (achou != true) {
                this.musicas.add(musica);

            } else {
                Ui ui = new Ui();
                ui.saida("Tá errado", ui.avisoIcone);
            }
        }

    }

    public void remover(int posicao) {
        this.musicas.remove(posicao);

    }

    public int buscar(String musica) {
        int resul = 0;

        for (int i = 0; i < musicas.size(); i++) {

            if (musica.equals(musicas.get(i).getNome())) {
                resul = i;
                return resul;
            }
        }
        return resul;
    }

    public void exibirPlaylist() {

        String resposta = "";
        for (Musica musica : musicas) {
            resposta += "MUSICA: " + musica.getNome() + "\n" + "ARTISTA: " + musica.getArtista() + "\n\n";
        }

        Ui ui = new Ui();
        ui.saida(resposta, ui.semIcone);
    }

}
