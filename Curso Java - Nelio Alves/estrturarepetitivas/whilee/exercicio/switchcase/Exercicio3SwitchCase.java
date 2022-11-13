package estrturarepetitivas.whilee.exercicio.switchcase;

import java.util.Scanner;

public class Exercicio3SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();
        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        while (type != 4) {
            switch (type) {
                case 1:
                    alcohol += 1;
                    break;
                case 2:
                    gasoline += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                default:
                    break;
            }
            type = input.nextInt();

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gasoline: " + gasoline);
        System.out.println("Diesel: " + diesel);
        input.close();
    }



}

/*
Os souts tem que ficar fora da estrutura de repeti��o por conta da sintaxe e modo
de execu��o do while (enquanto) porque quando a condi��o for falsa, n�o vai ser mais executado o escopo
 */

/*
Curiosidade: se deixar o input fora da estrutura condicional encadeada,
mas se o manter ainda no escopo da estrutura repetitiva, ele ainda vai executar a sua fun��o inicial
(Pedir para o usu�rio informar um valor de entrada
 */
