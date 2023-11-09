
public class ContagemRegressiva {

    public void contar (int inicio) {
        Ui ui = new Ui();
        if (inicio != 0) {
            ui.saida(""+inicio, ui.semIcone);
            contar(inicio-1);
        } else
        ui.saida("Acabou :D", ui.semIcone);
        

    }
}
