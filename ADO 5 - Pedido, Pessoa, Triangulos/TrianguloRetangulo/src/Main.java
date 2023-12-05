import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        TrianguloRetangulo tret = new TrianguloRetangulo();

        System.out.println("Digite o cateto adjascente: ");
        tret.setCatetoAdjascente(entrada.nextInt());
    
        System.out.println("Digite o cateto oposto: ");
        tret.setCatetoOposto(entrada.nextInt());
        

        System.out.printf("Área: %.2f\nPerímetro: %.2f\nHipotenusa: %.2f\n",tret.area(), tret.perimetro(), tret.hipotenusa());
    }
}
