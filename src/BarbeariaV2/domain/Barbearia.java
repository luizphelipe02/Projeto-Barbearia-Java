package BarbeariaV2.domain;

public abstract class Barbearia {
    protected String nome;

    public Barbearia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
