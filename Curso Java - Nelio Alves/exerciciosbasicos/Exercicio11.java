package exerciciosbasicos;

import java.util.Scanner;

/*
11 - Crie um algoritmo que leia uma frase do usu�rio e escreva na tela exatamente o que o usu�rio digitar.
 */
public class Exercicio11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter one phrase: ");
        String phrase = input.nextLine();

        System.out.println("You typed: " + phrase);
        input.close();

    }
}
