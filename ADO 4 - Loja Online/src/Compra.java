public class Compra {

    private Cliente cliente;
    private Item[] carrinho;
    private String cupom;
    private String formaPag;
    private int parcelas;

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Item[] getCarrinho() {
        return carrinho;
    }
    public void setCarrinho(Item[] carrinho) {
        this.carrinho = carrinho;
    }
    public String getCupom() {
        return cupom;
    }
    public void setCupom(String cupom) {
        this.cupom = cupom;
    }
    public String getFormaPag() {
        return formaPag;
    }
    public void setFormaPag(String formaPag) {
        this.formaPag = formaPag;
    }
    public int getParcelas() {
        return parcelas;
    }
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
    
}
