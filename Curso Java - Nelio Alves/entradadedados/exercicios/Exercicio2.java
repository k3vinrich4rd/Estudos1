package entradadedados.exercicios;

import java.util.Scanner;
/*Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro
casas decimais

F�rmula da �rea: area = pi . raio2
Considere o valor de pi = 3.14159
*/
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radiusOfACircle = input.nextDouble();
        double pi = 3.14159;
        double area = radiusOfACircle * radiusOfACircle * pi;

        System.out.printf("A �rea do circulo � igual a: %.4f", area);
        input.close();
    }
}
