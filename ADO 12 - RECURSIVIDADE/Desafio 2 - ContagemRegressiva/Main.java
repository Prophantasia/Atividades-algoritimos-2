
public class Main {
    public static void main(String[] args) {
        
        Ui ui = new Ui();
        ContagemRegressiva contReg = new ContagemRegressiva();

        // Entrada, processamento e saída
        contReg.contar(Integer.parseInt(ui.entrada("Digite um valor: ", ui.semIcone)));
        

    }
}