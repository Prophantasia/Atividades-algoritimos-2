

public class TrianguloRetangulo {

    // Atributos
    private double catetoOposto;
    private double catetoAdjacente;

    private double area;
    private double perimetro;
    private double hipotenusa;

    // Construtor
    public TrianguloRetangulo(double catetoOposto, double catetoAdjacente) {
        this.catetoOposto = catetoOposto;
        this.catetoAdjacente = catetoAdjacente;

        this.area();
        this.perimetro();
        this.hipotenusa();
    }

    // Getters and Setters
    public double getCatetoOposto() {
        return catetoOposto;
    }
    public void setCatetoOposto(double catetoOposto) {
        this.catetoOposto = catetoOposto;
    }
    public double getCatetoAdjacente() {
        return catetoAdjacente;
    }
    public void setCatetoAdjacente(double catetoAdjacente) {
        this.catetoAdjacente = catetoAdjacente;
    }

    // Getters da variável calculada pela função
    public double getArea() {
        return area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public double getHipotenusa() {
        return hipotenusa;
    }


    // Funções privadas
    private void area() {
        this.area = (this.catetoAdjacente * this.catetoOposto) / 2;
    }

    private void perimetro() {
        hipotenusa();
        this.perimetro = this.catetoAdjacente + this.catetoOposto + this.hipotenusa;
    }

    private void hipotenusa() {
        this.hipotenusa = Math.sqrt((this.catetoAdjacente * this.catetoAdjacente) + (this.catetoOposto * this.catetoOposto));
    }
}