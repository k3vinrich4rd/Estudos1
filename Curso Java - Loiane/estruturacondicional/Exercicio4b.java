package estruturacondicional;

import java.util.Scanner;

public class Exercicio4b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe uma letra e saiba se � vogal ou consoante: ");
        String letra = input.next();
        input.close();

        if (letra.length() >= 1  && !letra.equalsIgnoreCase("a")) {
            System.out.println("resposta inv�lida informe somente uma letra, digite novamente !");

        } else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("A letra que voc� informou � uma vogal");
                    break;
                default:
                    System.out.println("A letra que voc� informou � uma consoante");
            }
        }
    }
}
