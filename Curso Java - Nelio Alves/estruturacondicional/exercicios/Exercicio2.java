package estruturacondicional.exercicios;

import java.util.Scanner;
/*
Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
 */
public class Exercicio2 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 2 == 0){ // Se o resto da divis�o for igual a 0 � par
            System.out.println("PAIR");
        }else {
            System.out.println("ODD");
        }
    }
}
