public class Main {
    public static void main(String[] args) throws Exception {

        // Ui
        Ui ui = new Ui();
        while (ui.rodar) {

            NotasAluno notasAluno = new NotasAluno();
            Boletim boletim = new Boletim();
            Aluno aluno = new Aluno();

            // Menu
            int opcao = Integer.parseInt(ui.entrada(ui.menu, ui.titulo, ui.semIcone));

            // Calcular Boletim
            if (opcao == 1) {

                // Entradas
                aluno.setNome(ui.entrada("Digite o nome do Aluno:", ui.titulo, ui.semIcone));
                aluno.setCurso(ui.entrada("Digite o nome do Curso:", ui.titulo, ui.semIcone));
                aluno.setChamada(
                        Integer.parseInt(
                                ui.entrada("Digite o numero da chamada do Aluno:", ui.titulo, ui.semIcone)));
                aluno.setTurma(ui.entrada("Digite a turma do Aluno:", ui.titulo, ui.semIcone));
                aluno.setQtdDisciplina(Integer
                        .parseInt(ui.entrada("Digite a quantidade de disciplinas do Aluno:", ui.titulo,
                                ui.semIcone)));
                NotaDisciplina[] disciplinas = new NotaDisciplina[aluno.getQtdDisciplina()];

                for (int i = 0; i < aluno.getQtdDisciplina(); i++) {

                    NotaDisciplina nota = new NotaDisciplina();
                    nota.setDisciplina(ui.entrada("Digite o nome da Disciplina:", ui.titulo, ui.semIcone));
                    nota.setMedia(Double.parseDouble(ui.entrada("Digite a Média:", ui.titulo, ui.semIcone)));
                    nota.setFaltas(
                            Integer.parseInt(
                                    ui.entrada("Digite as faltas da Disciplina:", ui.titulo, ui.semIcone)));

                    disciplinas[i] = nota;
                }

                notasAluno.setAluno(aluno);
                notasAluno.setDisciplinas(disciplinas);

                // Processamento
                Resultado resultado = boletim.avaliar(notasAluno);

                // Saída
                ui.saida("                         Boletim do Aluno\n\nNome: " + resultado.getAluno().getNome()
                        + "\nCurso: "
                        + resultado.getAluno().getCurso() + "\nChamada: " + resultado.getAluno().getChamada()
                        + "\nTurma: " + resultado.getAluno().getTurma() + "\n", ui.titulo, ui.semIcone);

                for (NotaDisciplina item : disciplinas) {

                    String disciplina = item.getDisciplina();
                    Double media = item.getMedia();
                    int faltas = item.getFaltas();

                    ui.saida("                         Boletim do Aluno\n\nDisciplina: " + disciplina + "\nMédia: "
                            + media + "\nFaltas: "
                            + faltas, ui.titulo, ui.semIcone);
                }

                ui.saida("                         Boletim do Aluno\n\nO Aluno foi: " + resultado.getSituacao()
                        + "\nQtnd. de Aprovações: "
                        + resultado.getQtdAprovacoes() + "\nQtnd. de Reprovações: " + resultado.getQtdReprovacoes(),
                        ui.titulo, ui.semIcone);
            }

            // Sair
            if (opcao == 2)
                ui.rodar = false;
            else
                ui.saida("Você digitou uma opção inválida!", ui.titulo, ui.erroIcone);
        }
    }
}
