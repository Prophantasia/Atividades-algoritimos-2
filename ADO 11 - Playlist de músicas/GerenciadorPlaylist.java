
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
            resposta += "MUSICA: " + musica.getNome() + "\n" + "ARTISTA: " + musica.getArtista() + "\n" + "NOTA: "
                    + musica.getAvaliacao() + "\n" + "TEMPO: " + musica.getTempo() + "\n\n";
        }

        Ui ui = new Ui();
        ui.saida(resposta, ui.semIcone);
    }

    public void ordenar(int criterio) {

        if (criterio == 1) {
            this.ordenarPorNome();
        } else if (criterio == 2) {
            this.ordenarPorTempo();
        } else if (criterio == 3) {
            this.ordenarPorAvaliacao();
        }
    }

    private void ordenarPorTempo() {

        int totalItems = this.musicas.size();

        for (int i = 0; i < totalItems - 1; i++) {
            int posMenorItem = i;
            for (int j = i + 1; j < totalItems; j++) {
                if (this.musicas.get(j).getTempo() < this.musicas.get(posMenorItem).getTempo())
                    posMenorItem = j;
            }

            Musica temp = this.musicas.get(posMenorItem);
            this.musicas.set(posMenorItem, this.musicas.get(i));
            this.musicas.set(i, temp);
        }
    }

    private void ordenarPorAvaliacao() {

        int totalItems = this.musicas.size();

        for (int i = 0; i < totalItems - 1; i++) {
            int posMenorItem = i;
            for (int j = i + 1; j < totalItems; j++) {
                if (this.musicas.get(j).getAvaliacao() < this.musicas.get(posMenorItem).getAvaliacao())
                    posMenorItem = j;
            }

            Musica temp = this.musicas.get(posMenorItem);
            this.musicas.set(posMenorItem, this.musicas.get(i));
            this.musicas.set(i, temp);
        }

    }

    private void ordenarPorNome() {

        int totalItems = this.musicas.size();

        for (int i = 0; i < totalItems - 1; i++) {
            int posMenorItem = i;

            for (int j = i + 1; j < totalItems; j++) {
                int x = this.musicas.get(j).getNome().compareTo(this.musicas.get(posMenorItem).getNome());

                if (x < 0) {
                    posMenorItem = j;
                }
            }

            if (posMenorItem != i) {
                Musica temp = this.musicas.get(posMenorItem);
                this.musicas.set(posMenorItem, this.musicas.get(i));
                this.musicas.set(i, temp);
            }
        }

    }
}
