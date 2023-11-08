import java.io.IOException;
import java.util.Stack;

public class Playlist {

    private Stack<Musica> itens = new Stack<Musica>();


    public void adicionar(Musica musica) {
        this.itens.push(musica);
    }

    public void tocarProxima() throws IOException {

        Runtime.getRuntime().exec("cmd.exe /C start microsoft-edge:https://www.youtube.com/watch?v="+this.itens.pop().getCodYoutube());
        
    }

    public void exibirMusicas() {

        String musicas = "                      Playlist\n";
        for (Musica musica : itens) {
            musicas += "\n"+"Nome: "+musica.getNome()+"\nArtista: "+musica.getArtista()+"\n"+"Codigo: "+musica.getCodYoutube()+"\n";

        }
        Ui ui = new Ui();
        ui.saida(musicas, ui.semIcone);
    }
    
}
