package exerciciosbasicos;

import java.util.Scanner;

/*
12 - Crie um algoritmo que solicite o nome, o endere�o e o telefone do usu�rio
 e depois mostra os dados digitados em uma �nica linha.
 */
public class Exercicio12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Formulary");
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your address: ");
        String address = input.nextLine();
        System.out.print("Enter your number: ");
        String number = input.next();

        System.out.println("\n(Typed data) - Name: " + name + "," + " Address: "
                + address + " e" + " Number: " + number);

    }
}
