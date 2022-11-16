package poo.membrosestaticos.primeiraversao;

import java.util.Scanner;

public class PrimeiraVersao {
    public static final double PI = 3.14159; //Constante

    public static void main(String[] args) { //Fun��o main (Por padr�o � est�tico)
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference: %.2f\n" , c);
        System.out.printf("Volume: %.2f\n" , v);
        System.out.printf("PI value: %.2f\n" , PI);


        input.close();
    }

    /*
        N�o podemos chamar um m�todo que n�o est�tico dentro de um m�todo est�tico,
        ent�o na mesma classe n�o se pode chamar dentro de um m�todo est�tico
        outros m�todos que n�o sejam est�ticos
     */
    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * Math.pow(radius, 3) / 3.0;
    }
}
