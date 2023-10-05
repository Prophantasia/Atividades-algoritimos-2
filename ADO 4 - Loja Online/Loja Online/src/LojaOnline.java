import java.util.Random;

public class LojaOnline {

    public NotaFiscal efetuarCompra(Compra compra) {

        NotaFiscal notaFiscal = new NotaFiscal();

        notaFiscal.setCliente(compra.getCliente());
        notaFiscal.setCodNota(gerarCodNota());
        double totalFinal = calcularTotal(compra);

        if (compra.getFormaPag().equals("pix")) {

            totalFinal -= totalFinal * 0.10;
            notaFiscal.setTotal(totalFinal);
            return notaFiscal;

        } else if (compra.getFormaPag().equals("debito")) {
            
            totalFinal -= totalFinal * 0.05;
            notaFiscal.setTotal(totalFinal);
            return notaFiscal;

        } else
        
        notaFiscal.setTotal(totalFinal);
        return notaFiscal;
    }

    private double calcularTotal(Compra compra) {

        Item[] item = compra.getCarrinho();

        double total = 0;
        double desconto;

        for (int i = 0; i < item.length; i++) {

            total += item[i].getPreco();
        }
        desconto = verificarCupom(compra.getCupom());
        total -= desconto;
        total = calcularParcela(total, compra.getParcelas());

        return total;
    }

    private double verificarCupom(String cupom) {

        if (cupom.equals("QUERO100"))
            return 100;
        else if (cupom.equals("QUERO200"))
            return 200;
        else if (cupom.equals("QUERO500"))
            return 500;
        else
            return 0;
    }

    private double calcularParcela(double total, int parcelas) {

        double parcela = total / parcelas;

        if (parcelas == 0) {
            return total;
        } else

            total = 0;

        for (int i = 0; i < parcelas; i++) {

            double taxa = parcela * 0.03;
            parcela += taxa;
            total += parcela;
        }

        return total;
    }

    private int gerarCodNota() {

        Random random = new Random();
        return random.nextInt(1000);
    }

}
