package Barbearia.Dominio;

public class Serviço {
    private String barbeiro;
    private String tipoServico;
    private double valor;
    private String formaPagamento;
    private Barbearia barbearia;



    public Serviço(){

    }
    public Serviço(String barbeiro, String tipoServico, double valor, String formaPagamento) {
        this.barbeiro = barbeiro;
        this.tipoServico = tipoServico;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public void imprimir(){
        System.out.println("Barbeiro: " + barbeiro);
        System.out.println("Tipo: " + tipoServico);
        System.out.println("Valor: " + valor);
        System.out.println("Pagamento: " + formaPagamento);
    }
    public String getBarbeiro() {
        return barbeiro;
    }

    public void setBarbeiro(String barbeiro) {
        this.barbeiro = barbeiro;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Barbearia getBarbearia() {
        return barbearia;
    }

    public void setBarbearia(Barbearia barbearia) {
        this.barbearia = barbearia;
    }
}
