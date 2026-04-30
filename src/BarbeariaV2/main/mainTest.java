package BarbeariaV2.main;

import BarbeariaV2.UI.MenuInicial;
import BarbeariaV2.domain.Corte;
import BarbeariaV2.service.Servico;

import java.util.Scanner;

public class mainTest {
    public static void main(String[] args) {
        MenuInicial menuInicial = new MenuInicial("Lp Barbearia");
        Scanner scanner = new Scanner(System.in);


        int op = -1;
        while (op != 4){
            menuInicial.MenuIncial();
            op = scanner.nextInt();
            scanner.nextLine();
            if (op == 1){
                Servico servico = new Servico();
                int op2 = 0;
                servico.adicionarServico();
                op2 = scanner.nextInt();
                if (op2 == 1){
                    Corte corte = new Corte();
                    servico.adicionarCorte(corte);
                }




            }
        }


    }
}
