package Barbearia.Dominio;

public class Barbeiro {
    private String nome;
    private Serviço[] serviços;
    private Despesa[] despesas;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serviço[] getServiços() {
        return serviços;
    }

    public void setServiços(Serviço[] serviços) {
        this.serviços = serviços;
    }

    public Despesa[] getDespesas() {
        return despesas;
    }

    public void setDespesas(Despesa[] despesas) {
        this.despesas = despesas;
    }
}
