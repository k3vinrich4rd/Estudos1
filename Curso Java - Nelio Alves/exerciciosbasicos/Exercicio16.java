package exerciciosbasicos;

import java.util.Scanner;

/*
16 - Crie um algoritmo que leia um n�mero do usu�rio e informe se e o n�mero � par ou �mpar.
 */
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number and find out if it is even or odd");
        System.out.print("Enter one number: ");
        int number = input.nextInt();


        if (number % 2 == 0) {
            System.out.println("The value " + number + " is even");

        } else {
            System.out.println("the value " + number + " is odd");
        }

        input.close();

    }
}

