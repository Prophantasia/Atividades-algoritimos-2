public class Boletim {

    public double calcularMedia(NotasAluno notasAluno) {
        return (notasAluno.getNota1() + notasAluno.getNota2() + notasAluno.getNota3()) / 3;
    }

    public String verificarSituacao(double media) {

        if (media >= 6) {
            return "Aprovado";
        } else
            return "Reprovado";
    }
}