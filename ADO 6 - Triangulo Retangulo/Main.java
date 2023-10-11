import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);

        // Entradas
        System.out.println("Digite o cateto Oposto: ");
        double catetoOposto = entrada.nextDouble();
        System.out.println("Digite o cateto Adjacente: ");
        double catetoAdjacente = entrada.nextDouble();

        // Chamando a classe Triangulo Retangulo com suas variáveis e funções
        TrianguloRetangulo trianguloRet = new TrianguloRetangulo(catetoOposto, catetoAdjacente);

        
        // Saída
        System.out.printf("Resultado da Área: %.2f\nResultado do Perímetro: %.2f\nResultado da Hipotenusa: %.2f", trianguloRet.getArea(), trianguloRet.getPerimetro(), trianguloRet.getHipotenusa());

    }
}
