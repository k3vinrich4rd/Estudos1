package br.com.alura.estudos.javacurso.lacosrepeticao;

import java.util.Scanner;

public class TabuadaCompostaTest {
    public static void main(String[] args) {

        int primeiroNumero;
        int segundoNumero;
        int soma;
        int multiplicador;
        int subtracao;
        int divisao;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite '1' para somar dois n�meros ");
        System.out.println("Digite '2' para multiplicar dois n�meros");
        System.out.println("Digite '3' para subtrair dois n�meros");
        System.out.println("Digite '4' para dividir dois n�meros");

        System.out.print("\nNumero escolhido: ");
        int resposta = input.nextInt();

        while (resposta > 4 || resposta < 0) {
            System.out.println("N�mero inv�lido");
            System.out.println("Digite '1' para somar dois n�meros ");
            System.out.println("Digite '2' para multiplicar dois n�meros");
            System.out.println("Digite '3' para subtrair dois n�meros");
            System.out.println("Digite '4' para dividir dois n�meros");

            System.out.print("Numero escolhido: ");
            resposta = input.nextInt();

        }

        switch (resposta) {
            case 1:
                System.out.print("\nDigite o primeiro n�mero: ");
                primeiroNumero = input.nextInt();
                System.out.print("Digite o segundo n�mero: ");
                segundoNumero = input.nextInt();
                soma = primeiroNumero + segundoNumero;
                System.out.println("Resultado da soma: " + soma);
                break;
            case 2:
                System.out.print("\nDigite o primeiro n�mero: ");
                primeiroNumero = input.nextInt();
                System.out.print("Digite o segundo n�mero: ");
                segundoNumero = input.nextInt();
                multiplicador = primeiroNumero * segundoNumero;
                System.out.println("Resultado da multiplica��o: " + multiplicador);
                break;
            case 3:
                System.out.print("\nDigite o primeiro n�mero: ");
                primeiroNumero = input.nextInt();
                System.out.print("Digite o segundo n�mero: ");
                segundoNumero = input.nextInt();

                if (primeiroNumero < segundoNumero) {
                    System.out.println("Imposs�vel fazer a subtra��o");
                    break;
                }
                subtracao = primeiroNumero - segundoNumero;
                System.out.println("Resultado da subtra��o: " + subtracao);
                break;
            case 4:
                System.out.print("\nDigite o primeiro n�mero: ");
                primeiroNumero = input.nextInt();
                System.out.print("Digite o segundo n�mero: ");
                segundoNumero = input.nextInt();

                if (primeiroNumero < segundoNumero) {
                    System.out.println("Imposs�vel fazer a divis�o");
                    break;
                }
                divisao = primeiroNumero / segundoNumero;
                System.out.println("Resultado da divis�o: " + divisao);
                break;
        }
        input.close();

    }
}
