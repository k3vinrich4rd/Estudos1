package estrturarepetitivas.fori.exercicios;

import java.util.Scanner;

/*
Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
 */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int second = i * i;
            int third = i * i * i;

            System.out.printf("%d %d %d\n", i, second, third);
        }
        input.close();
    }
}
