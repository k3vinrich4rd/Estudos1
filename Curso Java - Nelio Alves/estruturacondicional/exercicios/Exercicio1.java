package estruturacondicional.exercicios;

import java.util.Scanner;
/*
Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negativeNumber = input.nextInt();

        if (negativeNumber < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("NO NEGATIVE");
        }
        input.close();

    }
}
