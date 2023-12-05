import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        Retangulo ret = new Retangulo();

        System.out.println("Digite a base: ");
        ret.setBase(entrada.nextInt());

        System.out.println("Digite a altura: ");
        ret.setAltura(entrada.nextInt());
        
        System.out.println("Área: "+ret.area()+"\nPerímetro: "+ret.perimetro());
    }
}
