package entradadedados.exercicios;

import java.util.Scanner;

/*
Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int partCodeOne = input.nextInt();
        int numberOfPiecesOne = input.nextInt();
        double unitValueOfPartsOne = input.nextDouble();

        int partCodeSecond = input.nextInt();
        int numberOfPiecesSecond = input.nextInt();
        double unitValueOfPartsSecond = input.nextDouble();

        double amountToPlay = (numberOfPiecesOne * unitValueOfPartsOne) +
                (numberOfPiecesSecond * unitValueOfPartsSecond);

        System.out.printf("Amount To Play: R$ %.2f ", amountToPlay);

        input.close();
    }
}
