import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {

        Boletim boletim = new Boletim();
        
        // Entrada
        double nota1 = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Digite sua primeira nota: ", "Modelo 3", -1));
        double nota2 = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Digite a sua segunda nota: ", "Modelo 3", -1));
        double nota3 = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Digite a sua terceira nota: ", "Modelo 3", -1));

        // Saída
        JOptionPane.showMessageDialog(null,
                String.format("Sua média foi: %.2f\nE você foi: %s", boletim.calcularMedia(nota1, nota2, nota3),
                        boletim.verificarSituacao(boletim.calcularMedia(nota1, nota2, nota3))),
                "Modelo 3", -1);
    }
}