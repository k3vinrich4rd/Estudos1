package breakecontinue;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um n�mero: ");
        int numero = input.nextInt();
        System.out.print("Digite o valor m�ximo: ");
        int valorMaximo = input.nextInt();

        for (int i = numero; i <= valorMaximo; i++) {
            System.out.println(i);
            if (i % 7 == 0) {
                break;


            }
            System.out.println("O valor de i � : " + i);


        }
    }
}
