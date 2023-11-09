
public class Main {
    public static void main(String[] args) {
        
        Ui ui = new Ui();
        Contagem cont = new Contagem();

        // Entrada, processamento e saída
        cont.contar(Integer.parseInt(ui.entrada("Digite um valor de inicio: ", ui.semIcone)), Integer.parseInt(ui.entrada("Digite um valor de fim: ", ui.semIcone)));
        cont.contarPares(Integer.parseInt(ui.entrada("Digite um valor de inicio: ", ui.semIcone)), Integer.parseInt(ui.entrada("Digite um valor de fim: ", ui.semIcone)));
        

    }
}