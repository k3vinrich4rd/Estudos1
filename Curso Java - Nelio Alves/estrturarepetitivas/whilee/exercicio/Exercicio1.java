package estrturarepetitivas.whilee.exercicio;

import java.util.Scanner;
/*
Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password = input.nextInt();

        while (password != 2002) {
            System.out.println("Invalid password");
            password = input.nextInt();
        }
        System.out.println("Access permitted");
        input.close();
    }
}
