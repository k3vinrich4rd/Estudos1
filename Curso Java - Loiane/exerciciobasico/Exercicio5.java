package exerciciobasico;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Informe um n�mero em metros e saiba sua convers�o em cent�metros: ");
        double metros = input.nextInt();
        input.close();

        double centimetros = metros * 100;
        System.out.println("O resultado da convers�o do n�mero � " + centimetros + " cm");

    }
}
