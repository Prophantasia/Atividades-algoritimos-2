public class Retangulo {

    // Atributos
    private double altura;
    private double base;

    private double area;
    private double perimetro;

    // Getters and Setters
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    // Caso o usuário set algum outro valor, na hora do get o valor vai ser recalculculado
    public double getArea() {
        this.area();
        return area;
    }
    public double getPerimetro() {
        this.perimetro();
        return perimetro;
    }

    // Construtor
    public Retangulo(double a, double b) {
        this.altura = a;
        this.base = b;

        this.area();
        this.perimetro();
    }
    

    private void area() {
        this.area = this.base * this.altura;
    } 

    private void perimetro() {
        this.perimetro = (this.base + this.altura) * 2;
    }

    

    
    
}
