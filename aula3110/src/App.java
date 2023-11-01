import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número");
        int resp = entrada.nextInt();
        int i = 1;


        /*
         Numero Decrescente
         numDecrescente(resp); 
        */


        /*
        Numero Crescente
        numCrescente(resp, i); 
        */
        

        /* 
        Soma --
        int resultado = soma(resp);
        System.out.println("O resultado é: "+ resultado);
         */
       
    }

    public static int numDecrecente(int a) {

        if (a != 0) {

            System.out.println(a);
            a--;
            return numDecrecente(a);
        }

        else
            return 0;
    }

    public static int numCrescente(int a,int i) {

        
        if (a == 0) {
            return 1;
        }
        
        else {
            System.out.println(i);
            return numCrescente(a-1, i + 1);
        }
    }

    public static int soma(int a) {
        if (a == 1) {

            return 1;
        
        } else
            return a + soma(a - 1);
    }
}