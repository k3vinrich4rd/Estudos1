package estruturacondicional.exercicios;

import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
ordem crescente ou decrescente
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("ARE MULTIPLES");
        } else {
            System.out.println("ARE NOT MULTIPLES");
        }
        input.close();
    }
}
