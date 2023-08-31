public class Pagamento {
    public double calcularTotal(Compra compra) {
        return compra.getTotal() + compra.getTotal() * buscarTaxa(compra.getParcelas());
    }

    public double calcularParcelas(double totalFinal, int parcelas) {
        
        if (parcelas == 0) {
            return 0;
        } else
        
        return totalFinal / parcelas;
    }

    private double buscarTaxa(int parcelas) {
        if (parcelas == 0) {
            return 0;
        } else if (parcelas >= 1 && parcelas <= 3) {
            return 0.03;
        } else if (parcelas >3 && parcelas <= 11) {
            return 0.05;
        } else
            return 0.1;
    }
}
