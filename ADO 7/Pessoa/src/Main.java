import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.println("Nome completo: ");
        String nome = entrada.nextLine();

        p.setNomeCompleto(nome);

        System.out.println("Ano de nascimento: ");
        int anoNasc = entrada.nextInt();
        
        p.setAnoNasc(anoNasc);

        System.out.println("Idade: "+p.idade()+"\nPrimeiro nome: "+p.primeiroNome()+"\nUltimo nome: "+p.ultimoNome());
    }
}
