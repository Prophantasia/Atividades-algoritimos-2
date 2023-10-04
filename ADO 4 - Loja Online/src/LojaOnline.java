import java.util.Random;

public class LojaOnline {

    public NotaFiscal efetuarCompra(Compra compra) {

        NotaFiscal notaFiscal = new NotaFiscal();

        return notaFiscal;
    }

    private double calcularTotal(Compra compra) {

        return 0;
    }

    private double verificarCupom(String cupom) {

        return 0;
    }

    private double calcularParcela(double total, int parcelas) {
        
        double parcela = total / parcelas;
        
        if (parcelas == 0) {
            return 0;
        } else
        
        for(int i = 0; i < parcelas; i++) {
            
            
            double taxa = parcela * 0.03;
            parcela =+ taxa;
        }
        
        return parcela;        
    }

    private int gerarCodNota() {

        Random random = new Random();

        return random.nextInt(1000);
    }


    
}
