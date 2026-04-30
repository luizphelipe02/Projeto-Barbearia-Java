package BarbeariaV2.UI;

import BarbeariaV2.domain.Barbearia;

public class MenuInicial extends Barbearia {
    public MenuInicial(String nome) {
        super(nome);
    }

    public void MenuIncial(){
        System.out.println("Ola, seja bem vindo ao Sistema da "+ this.nome);
        System.out.println("OPÇÕES ABAIXO !");
        System.out.println("1 - Adicionar Serviço");
        System.out.println("2 - Adicionar Despesa");
        System.out.println("3 - Mostrar Serviços");
        System.out.println("4 - Mostrar Despesas");
        System.out.println("5 - Sair");
        System.out.print("Qual opção deseja escolher? ");
    }
}
