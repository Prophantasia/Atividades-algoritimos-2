public class TrianguloRetangulo {
    private double catetoOposto;
    private double catetoAdjascente;
 

    public double getCatetoOposto() {
        return catetoOposto;
    }

    public void setCatetoOposto(double catetoOposto) {
        this.catetoOposto = catetoOposto;
    }

    public double getCatetoAdjascente() {
        return catetoAdjascente;
    }

    public void setCatetoAdjascente(double catetoAdjascente) {
        this.catetoAdjascente = catetoAdjascente;
    }

    public double area () {
        return (catetoOposto * catetoAdjascente) /2;
    }

    public double perimetro () {
        return catetoAdjascente + catetoOposto + hipotenusa();
    }
    
    public double hipotenusa () {
        return Math.sqrt((catetoAdjascente * catetoAdjascente) + (catetoOposto * catetoOposto));
    }
}
