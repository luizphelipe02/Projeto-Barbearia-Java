package Barbearia.main;

import Barbearia.Dominio.Barbearia;
import Barbearia.Dominio.Barbeiro;
import Barbearia.Dominio.Despesa;
import Barbearia.Dominio.Serviço;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Barbearia barbearia = new Barbearia("Lp Barbearia");
        Barbeiro barbeiro = new Barbeiro();
        Despesa despesa = new Despesa();
        Despesa[] despesas = {};
        Serviço serviço = new Serviço();
        Serviço[] serviços = {};

        int op =-1;
        while (op != 4) {
            barbearia.menuInicial();
            op = scanner.nextInt();
            scanner.nextLine();

            if (op == 1){
                barbearia.adicionarServiço(scanner);
            } else if (op == 2) {
                barbearia.adicionarDespesa(scanner);
            }else if (op == 3 ){
                barbearia.mostrarServicos();
                while (true) {
                    System.out.println("Deseja voltar ao menu? S/N");
                    String resposta = scanner.nextLine();
                    if (resposta.equalsIgnoreCase("S")) {
                        break;
                    } else if (resposta.equalsIgnoreCase("N")) {
                        op = 4;
                        break;

                    } else {
                        System.out.println("Resposta invalida");
                    }
                }
            }else if (op == 4 ){
                barbearia.mostrarDespesa();
                while (true) {
                    System.out.println("Deseja voltar ao menu? S/N");
                    String resposta = scanner.nextLine();
                    if (resposta.equalsIgnoreCase("S")) {
                        break;
                    } else if (resposta.equalsIgnoreCase("N")) {
                        op = 4;
                        break;

                    } else {
                        System.out.println("Resposta invalida");
                    }
                }
            }else if (op == 5 ){
                break;
            }
        }



    }
}
