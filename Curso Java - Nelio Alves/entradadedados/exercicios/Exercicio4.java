package entradadedados.exercicios;

import java.util.Scanner;

/*
Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
decimais.
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int employeeNumber = input.nextInt();
        int hoursWorked = input.nextInt();
        double hourValue = input.nextDouble();

        double salary = hoursWorked * hourValue;

        System.out.println("NUMBER EMPLOYEE = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f ", salary);

        input.close();


    }
}
