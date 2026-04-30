package BarbeariaV2.domain;

public class Cartao implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento recebiddo no Cartão!");
    }
}
