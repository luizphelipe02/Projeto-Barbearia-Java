package Barbearia.Dominio;

public class Despesa {
    private Barbeiro barbeiro;
    private String descDespesa;
    private double valor;
    private String formaGasto;
    private Barbearia barbearia;

    public Despesa(){

    }
    public Despesa(String descDespesa, double valor){
        this.descDespesa = descDespesa;
        this.valor = valor;

    }

    public Despesa(Barbeiro barbeiro, String descDespesa, double valor, String formaGasto, Barbearia barbearia) {
        this.barbeiro = barbeiro;
        this.descDespesa = descDespesa;
        this.valor = valor;
        this.formaGasto = formaGasto;
        this.barbearia = barbearia;
    }
    public void imprimir(){
        System.out.println("Descrição da despesa: "+descDespesa);
        System.out.println("Valor da despesa: "+valor);
        System.out.println("-----------------------");
    }
    public Barbeiro getBarbeiro() {
        return barbeiro;
    }

    public void setBarbeiro(Barbeiro barbeiro) {
        this.barbeiro = barbeiro;
    }

    public String getDescDespesa() {
        return descDespesa;
    }

    public void setDescDespesa(String descDespesa) {
        this.descDespesa = descDespesa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaGasto() {
        return formaGasto;
    }

    public void setFormaGasto(String formaGasto) {
        this.formaGasto = formaGasto;
    }

    public Barbearia getBarbearia() {
        return barbearia;
    }

    public void setBarbearia(Barbearia barbearia) {
        this.barbearia = barbearia;
    }
}
