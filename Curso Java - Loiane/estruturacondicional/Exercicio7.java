package estruturacondicional;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um n�mero: ");
        double numero1 = input.nextDouble();
        System.out.print("Informe um segundo n�mero: ");
        double numero2 = input.nextDouble();
        System.out.print("Informe um terceiro n�mero: ");
        double numero3 = input.nextDouble();
        input.close();

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("Dos n�meros informados o n�mero " + numero1 + " � o menor deles");
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("Dos n�meros informados o n�mero " + numero2 + " � o menor deles");
        } else if (numero3 < numero1 && numero3 < numero2) {
            System.out.println("Dos n�meros informados o n�mero " + numero3 + " � o menor deles");
        }
    }
}
