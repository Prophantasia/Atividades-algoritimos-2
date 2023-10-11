public class Main {
    public static void main(String[] args) {


        Ui ui = new Ui();
        ListaTarefas listaTarefa = new ListaTarefas();
        boolean rodar = true;

        // Menu
        while(rodar) {

            int opcao = ui.menu();            

            // Adicionar item na lista
            if (opcao == 1) {
                listaTarefa.adicionar(ui.entrada("Adicione a nova tarefa: ", ui.semIcone));
            } 
            // Remover item da lista
            else if (opcao == 2) {
                listaTarefa.remover(Integer.parseInt(ui.entrada("Digite a posição que deseje remover: ", ui.semIcone)));
            } 
            // Exibir itens da lista
            else if (opcao == 3) {
                listaTarefa.printarLista();
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