package estruturacondicional;

import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Digite o primeiro n�mero: ");
        double numero1 = input.nextDouble();
        System.out.print("Digite o segundo n�mero: ");
        double numero2 = input.nextDouble();

        if (numero1 > numero2){
            System.out.println("O primeiro n�mero informado que foi o " + numero1 + ", � maior que o segundo n�mero que foi o " + numero2 );
        }else {
                System.out.println("O segundo n�mero informado que foi o " + numero2 + ", � maior que o primeiro n�mero que foi o " + numero1);
        }

    }
}
