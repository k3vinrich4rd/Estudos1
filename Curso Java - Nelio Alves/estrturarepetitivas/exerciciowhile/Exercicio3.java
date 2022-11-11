package estrturarepetitivas.exerciciowhile;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int type = input.nextInt();

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        while (type != 4) {
            if (type == 1) {
                alcohol += 1;
            } else if (type == 2) {
                gasoline += 1;
            } else if (type == 3) {
                diesel += 1;
            }
            type = input.nextInt();
        }
        System.out.println("THANK YOU VERY MUCH");
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