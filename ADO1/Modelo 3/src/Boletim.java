public class Boletim {

    // Funções
    public double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String verificarSituacao(double media) {
        if (media >= 6) {
            return "Aprovado";
        } else
            return "Reprovado";
    }
}
