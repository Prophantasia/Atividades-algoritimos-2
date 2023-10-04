public class NotaFiscal {

    private Cliente cliente;
    private Item[] item;
    private int codNota;
    private double total;
    private double valorParcela;
    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Item[] getItem() {
        return item;
    }
    public void setItem(Item[] item) {
        this.item = item;
    }
    public int getCodNota() {
        return codNota;
    }
    public void setCodNota(int codNota) {
        this.codNota = codNota;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getValorParcela() {
        return valorParcela;
    }
    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    
    
}
