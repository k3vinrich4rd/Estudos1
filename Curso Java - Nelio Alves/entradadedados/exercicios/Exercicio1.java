package entradadedados.exercicios;

import java.util.Scanner;
//Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
//mensagem explicativa
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        int soma = firstNumber + secondNumber;

        System.out.println("SOMA = " + soma);

        input.close();

    }
}
