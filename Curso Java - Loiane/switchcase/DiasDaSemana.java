package switchcase;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite [1] - Domingo ");
        System.out.println("Digite [2] - Segunda Feira");
        System.out.println("Digite [3] - Ter�a Feira");
        System.out.println("Digite [4] - Quarta Feira ");
        System.out.println("Digite [5] - Quinta Feira ");
        System.out.println("Digite [6] - Sexta Feira ");
        System.out.println("Digite [7] - S�bado ");
        System.out.println("Digite [8] - Para sair do programa\n");

        System.out.print("Informe um n�mero para efetuar uma a��o: ");
        int diasDaSemana = input.nextInt();

        input.close();

        switch (diasDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda Feira");
                break;
            case 3:
                System.out.println("Ter�a Feira");
                break;
            case 4:
                System.out.println("Quarta Feira");
                break;
            case 5:
                System.out.println("Quinta Feira");
                break;
            case 6:
                System.out.println("Sexta Feira");
                break;
            case 7:
                System.out.println("S�bado");
                break;
            case 8:
                System.out.println("Ok, saindo ...");
                break;
            default:
                System.out.println("N�mero inv�lido, digite somente uma das op��es acima");

        }


    }
}
