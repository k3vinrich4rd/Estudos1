package estruturacondicional.exercicios.treino;

import java.util.Scanner;
//Proposta do c�digo: Efetuar a formul� de bhaskara
//Formula de Bhaskara
//Delta n�o pode ser negativo
//A n�o pode ser zero
public class Treino2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = b * b - 4.0 * a * c;

        if (a == 0 || delta < 0.0) {
            System.out.println("Impossible to calculate");
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
            //Colocando a preced�ncia porque a divis�o e multiplica��o, tem a mesma preced�ncia
        }


    }
}
