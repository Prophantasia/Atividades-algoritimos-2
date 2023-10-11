import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        // Entrada
        System.out.println("Digite a base: ");
        double base = entrada.nextDouble();
        
        System.out.println("\nDigite a altura: ");
        double altura = entrada.nextDouble();
    
        // Chamando a classe Retangulo com suas variáveis e funções
        Retangulo ret = new Retangulo(altura, base);

        // Saída
        System.out.printf("Resultado da Área: %.2f\nResultado do Perímetro: %.2f\n", ret.getArea(), ret.getPerimetro());
    }
}