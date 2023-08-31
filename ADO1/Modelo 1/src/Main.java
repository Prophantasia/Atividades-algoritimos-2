import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {

        // Entrada
        double nota1 = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Digite sua primeira nota: ", "Modelo 1", -1));
        double nota2 = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Digite a sua segunda nota: ", "Modelo 1", -1));
        double nota3 = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Digite a sua terceira nota: ", "Modelo 1", -1));

        // Processamento
        double media = (nota1 + nota2 + nota3) / 3;
        String situacao = "";

        if (media >= 6) {
            situacao = "Aprovado";
        } else
            situacao = "Reprovado";

        // Saída
        JOptionPane.showMessageDialog(null, String.format("Sua média foi: %.2f\nE você foi: %s", media, situacao));
    }

}
