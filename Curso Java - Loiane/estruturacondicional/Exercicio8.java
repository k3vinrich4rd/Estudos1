package estruturacondicional;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o pre�o do 1� produto: ");
        double produto1 = input.nextDouble();
        System.out.print("Informe o pre�o do 2� produto: ");
        double produto2 = input.nextDouble();
        System.out.print("Informe o pre�o do 3� produto: ");
        double produto3 = input.nextDouble();
        input.close();

        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println("O 1� produto � o mais barato, valor: " + produto1 );
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println("O 2� produto � o mais barato, valor: " + produto2 );
        } else if (produto3 < produto1 && produto3 < produto2) {
            System.out.println("O 3� produto � o mais barato, valor: " + produto3 );
        }

    }
}
