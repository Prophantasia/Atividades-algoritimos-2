import javax.swing.JOptionPane;

public class Main {
        public static void main(String[] args) throws Exception {

         // Entrada
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua primeira nota: ", "Modelo 2", -1));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua segunda nota: ", "Modelo 2", -1));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua terceira nota: ","Modelo 2", -1));

        // Saída
        JOptionPane.showMessageDialog(null,
                 String.format("Sua média foi: %.2f\nE você foi: %s", calcularMedia(nota1, nota2, nota3),
                 verificarSituacao(calcularMedia(nota1, nota2, nota3))),
                 "Modelo 2", -1);
        }

        // Funções
        public static double calcularMedia(double nota1, double nota2, double nota3) {
                return (nota1 + nota2 + nota3) / 3;
        }

        public static String verificarSituacao(double media) {
                if (media >= 6) {
                        return "Aprovado";
                } else
                        return "Reprovado";
        }
}