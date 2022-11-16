package poo.membrosestaticos.segundaversao;

import poo.membrosestaticos.segundaversao.util.Calculator;

import java.util.Scanner;

public class SegundaVersao {


    public static void main(String[] args) { //Fun��o main (Por padr�o � est�tico)
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double c = calculator.circumference(radius);

        double v = calculator.volume(radius);

        System.out.printf("Circumference: %.2f\n" , c);
        System.out.printf("Volume: %.2f\n" , v);
        System.out.printf("PI value: %.2f\n" , calculator.PI);


        input.close();
    }

    /*
        N�o podemos chamar um m�todo que n�o est�tico dentro de um m�todo est�tico,
        ent�o na mesma classe n�o se pode chamar dentro de um m�todo est�tico
        outros m�todos que n�o sejam est�ticos
     */

}
