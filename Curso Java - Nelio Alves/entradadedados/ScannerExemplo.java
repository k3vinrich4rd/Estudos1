package entradadedados;
// Entrada de dados:
import java.util.Scanner;
// Estudos sobre String
public class ScannerExemplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String primeiroNome = input.nextLine(); // caracteres sem espa�o
        System.out.print("Digite um segundo nome: "); // Se usar input.next(); junto com o input.nextLine(); o programa quebra
        String segundoNome = input.nextLine(); // caracteres com espa�o
        input.close();

        System.out.println("O primeiro nome informado foi: " + primeiroNome);
        System.out.println("O segundo nome informado foi: " + segundoNome);



    }
}
