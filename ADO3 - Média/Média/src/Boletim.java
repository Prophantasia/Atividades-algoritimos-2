public class Boletim {
    public Resultado avaliar(NotasAluno notasAluno) {

        int qtdAprovacoes = 0;
        int qtdReprovacoes = 0;

        for (NotaDisciplina item : notasAluno.getDisciplinas()) {

            String sit = verificarSituacao(item.getMedia(), item.getFaltas());

            if (sit.equals("Aprovado")) {
                qtdAprovacoes++;
            } else
                qtdReprovacoes++;
        }

        Resultado res = new Resultado();
        res.setAluno(notasAluno.getAluno());
        res.setDisciplinas(notasAluno.getDisciplinas());
        res.setQtdAprovacoes(qtdAprovacoes);
        res.setQtdReprovacoes(qtdReprovacoes);

        if (qtdReprovacoes == 0)
            res.setSituacao("Aprovado");
        else
            res.setSituacao("Reprovado");

        return res;
    }

    private String verificarSituacao(double media, int faltas) {

        String sit = "";

        if (media < 6)
            sit = "DP por nota";
        else if (faltas > 4)
            sit = "DP por faltas";
        else
            sit = "Aprovado";

        return sit;
    }
}
