package exerciciobasico;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o seu valor hora: ");
        double valorHora = input.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhadas no m�s: ");
        double horasTrabalhadasNoMes = input.nextDouble();
        input.close();

        double salario = horasTrabalhadasNoMes * valorHora;
        System.out.printf("O valor do seu sal�rio � de: R$ %.0f por m�s", salario);
    }
}
