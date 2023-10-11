import java.util.ArrayList;

public class ListaTarefas {

    private String titulo;
    private ArrayList <String> itens = new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void adicionar (String novoItem) {
        itens.add(novoItem);
    } 

    public void remover (int posicao) {
        itens.remove(posicao);
    }

    public void printarLista () {

        Ui ui = new Ui();
        String nomeItens = "";
        
        for (String item : itens) {
            nomeItens += item +"\n";
    }
        ui.saida(nomeItens, ui.semIcone);    
    }
    
}
