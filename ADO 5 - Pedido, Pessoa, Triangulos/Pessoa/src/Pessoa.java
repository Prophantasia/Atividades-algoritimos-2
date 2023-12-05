public class Pessoa {
    private String nomeCompleto;
    private int anoNasc;


    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public int getAnoNasc() {
        return anoNasc;
    }
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int idade () {
        return 2023 - anoNasc;
    }
    public String primeiroNome() {
        return nomeCompleto.split(" ")[0];
    } 

    public String ultimoNome() {

        String partes[];
        partes = nomeCompleto.split(" ");
        int tamanho = partes.length;
        
        return nomeCompleto.split(" ")[tamanho -1];
    }
}
