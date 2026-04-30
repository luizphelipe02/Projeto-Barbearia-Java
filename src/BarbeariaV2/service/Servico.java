package BarbeariaV2.service;

import BarbeariaV2.domain.Corte;

public class Servico {
    public void adicionarServico(){
        System.out.println("1- Corte simples");
        System.out.println("2- Barba");
        System.out.println("3- Sombrancelha");
        System.out.println("Qual Tipo de serviço você Deseja adicionar? ");

    }
    public void adicionarCorte(Corte corte){
        System.out.println("O "+corte.nome+ " no valor de "+corte.valor+ " foi adicionado com Sucesso!");
    }
}
