public class Pedido {
    private double valor;
    private int parcelas;

    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double total() {

        if (parcelas == 0 || parcelas == 1) 
            return valor;
        else

        return juros();
    }

    private double juros() {
        for (int i = 0; i < parcelas; i++) {
            valor += valor * 0.01;
        }
        return valor;
    }
}
