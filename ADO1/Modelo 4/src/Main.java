import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {

        // Classes
        Boletim boletim = new Boletim();
        NotasAluno notas = new NotasAluno();
        Ui ui = new Ui();

        // Menu
        while (ui.rodar) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, ui.menu, "Modelo 4", -1));
            if (opcao == 1) {
                notas.setNota1(
                        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 1", "Modelo 4", -1)));
                notas.setNota2(
                        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 2", "Modelo 4", -1)));
                notas.setNota3(
                        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 3", "Modelo 4", -1)));
            } else if (opcao == 2) {
                JOptionPane.showMessageDialog(null,
                        String.format("Nota1: %.2f\nNota2: %.2f\nNota3: %.2f\n\nMedia: %.2f\nVocê foi: %s",
                                notas.getNota1(),
                                notas.getNota2(), notas.getNota3(), boletim.calcularMedia(notas),
                                boletim.verificarSituacao(boletim.calcularMedia(notas))),
                        "Modelo 4", -1);

            } else if (opcao == 3) {
                ui.rodar = false;
            } else
                JOptionPane.showMessageDialog(null, "Você digitou um valor inválido", "Modelo 4", 2);
        }
    }
}