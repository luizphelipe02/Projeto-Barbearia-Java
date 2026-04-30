package BarbeariaV2.domain;

public abstract class Despesa {
    public String tipo;
    public double valor;

    public Despesa(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
