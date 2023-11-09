
public class Contagem {

    public void contar (int inicio, int fim) {

        Ui ui = new Ui();
        if (inicio != fim) {
            ui.saida(""+inicio, ui.semIcone);
            contar(inicio +1, fim);

        } else  
        ui.saida("Acabou :D", ui.semIcone);


    }

    public void contarPares (int inicio, int fim) {

        Ui ui = new Ui();
        if (inicio != fim) {
            ui.saida(""+inicio, ui.semIcone);
            contar(inicio +2, fim);

        } else  
        ui.saida("Acabou :D", ui.semIcone);

        

    }
}
