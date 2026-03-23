package Barbearia.Dominio;

import java.util.Scanner;

public class Barbearia {
    private String nome;
    private Serviço[] serviços;
    private Despesa[] despesas;
    private int quantidadeServicos;
    private int quantidadeDespesas;



    public Barbearia(String nome) {
        this();
        this.nome = nome;
    }
    public Barbearia(){
        serviços = new Serviço[100];
        quantidadeServicos = 0;
        despesas = new Despesa[100];
        quantidadeDespesas = 0;

    }

    public Barbearia(String nome, Serviço[] serviços, Despesa[] despesas) {
        this.nome = nome;
        this.serviços = serviços;
        this.despesas = despesas;
    }

    public void menuInicial(){
        System.out.println("Ola, seja bem vindo ao Sistema da "+ this.nome);
        System.out.println("OPÇÕES ABAIXO !");
        System.out.println("1 - Adicionar Serviço");
        System.out.println("2 - Adicionar Despesa");
        System.out.println("3 - Mostrar Serviços");
        System.out.println("4 - Mostrar Despesas");
        System.out.println("5 - Sair");
        System.out.print("Qual opção deseja escolher? ");

    }
    public void adicionarServiço(Scanner scanner){
        System.out.println("Qual barbeiro fara o serviço? ");
        String barbeiro = scanner.nextLine();

        System.out.println("Qual tipo de serviço? ");
        String tpServico = scanner.nextLine();

        System.out.println("Valor do serviço? ");
        int valorServico = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual forma de pagamento? ");
        String tpPagamento = scanner.nextLine();

        Serviço serviço = new Serviço(barbeiro, tpServico, valorServico, tpPagamento);
        serviços[quantidadeServicos] = serviço;
        quantidadeServicos++;

    }

    public void mostrarServicos(){
        for(int i = 0; i < quantidadeServicos; i++){
            serviços[i].imprimir();
        }



    }
    public void mostrarDespesa(){
        for(int i = 0; i < quantidadeDespesas; i++){
            despesas[i].imprimir();
        }
    }
    public void adicionarDespesa(Scanner scanner){
        System.out.println("Adicionando Despesas...");
        System.out.println("Qual tipo de despesa: ");
        String tpDespesa = scanner.nextLine();

        System.out.println("Qual valor da despesa?");
        double vlDespesa = scanner.nextDouble();

        Despesa despesa = new Despesa(tpDespesa, vlDespesa);
        despesas[quantidadeDespesas] = despesa;
        quantidadeDespesas ++;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
