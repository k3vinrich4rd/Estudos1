package exerciciobasico;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a um n�mero para saber a �rea do quadrado: ");
        double lado = input.nextDouble();
        input.close();

        double calculoDaArea = Math.pow(lado,2);
        double dobrodaArea = calculoDaArea * 2;
        System.out.println("O resultado da �rea do quadrado � " + calculoDaArea);
        System.out.println("E o dobro desse resultado �: " + dobrodaArea);

    }
}
