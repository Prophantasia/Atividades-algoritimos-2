import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        Pedido p = new Pedido();
    
        System.out.println("Digite o valor: ");
        p.setValor(entrada.nextInt());
    
        System.out.println("Digite as parcelas: ");
        p.setParcelas(entrada.nextInt());
    

        System.out.printf("Valor final: %.2f", p.total());
    }
}
