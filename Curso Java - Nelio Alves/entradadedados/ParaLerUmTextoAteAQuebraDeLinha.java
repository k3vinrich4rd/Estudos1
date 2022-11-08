package entradadedados;
// Trabalhando com nextLine
import java.util.Scanner;
/*
Para n�o dar uma quebra de linha pendente ao utilizar o nextLine
� necess�rio usar um nextLine antes do nextLine que voc� vai requisitar
 */
public class ParaLerUmTextoAteAQuebraDeLinha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um n�mero: ");
        int numero = input.nextInt();
        System.out.print("Digite uma frase: ");
        input.nextLine(); // N�o vai deixar uma linha de quebra pendente
        String frase = input.nextLine();
        System.out.print("Digite mais uma frase: ");
        String frase2 = input.nextLine();
        System.out.print("Digite outra frase: ");
        String frase3 = input.nextLine();
        System.out.println();
        input.close();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(numero);
        System.out.println(frase);
        System.out.println(frase2);
        System.out.println(frase3);



    }
}
