package BarbeariaV2.domain;

public class Pix implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento recebido em Pix!");
    }
}
