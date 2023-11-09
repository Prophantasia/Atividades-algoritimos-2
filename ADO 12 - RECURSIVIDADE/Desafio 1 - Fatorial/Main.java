
public class Main {
    public static void main(String[] args) {
        
        Ui ui = new Ui();
        Fatorial fat = new Fatorial();

        // Entrada e processamento
        int resposta = fat.calcular(Integer.parseInt(ui.entrada("Digite um valor: ", ui.semIcone)));
        

        // Saída
        ui.saida("O fatorial é: "+resposta, ui.semIcone);

    }
}