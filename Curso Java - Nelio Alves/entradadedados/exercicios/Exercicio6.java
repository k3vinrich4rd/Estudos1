package entradadedados.exercicios;

import java.util.Scanner;

/*
Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B.
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double pi = 3.14159;

        double rightTriangleArea = A * C / 2;
        double radiusCircleArea = pi * C * C;
        double trapezeArea = (A + B) * C / 2;
        double squareArea = B * B;
        double rectangleArea = A * B;

        System.out.printf("TRIANGLE: %.3f\n", rightTriangleArea);
        System.out.printf("CIRCLE: %.3f\n", radiusCircleArea);
        System.out.printf("TRAPEZE: %.3f\n", trapezeArea);
        System.out.printf("SQUARE: %.3f\n", squareArea);
        System.out.printf("RECTANGLE: %.3f", rectangleArea);

        input.close();


    }
}
