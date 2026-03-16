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
        while (op != 0) {
            barbearia.menuInicial();
            op = scanner.nextInt();
            scanner.nextLine();

            if (op == 1){
                barbearia.adicionarServiço(scanner);

            } else if (op == 2) {
                break;

            }else if (op == 3 ){
                barbearia.mostrarServicos();
            }
        }



    }
}
