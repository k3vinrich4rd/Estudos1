package estrturarepetitivas.fori.exercicios;
/*
Leia um valor inteiro N. este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
Mostre quantos destes valores X est�o no intervalo [10,20] e quantos est�o fora do intervalo, mostrando
essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out." para fora do intervalo).
 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        input.close();

    }
}
