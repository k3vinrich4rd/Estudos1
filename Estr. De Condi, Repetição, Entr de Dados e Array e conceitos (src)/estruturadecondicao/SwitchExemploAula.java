package estruturadecondicao;
// ExemploInadequado feito em aula:
import java.util.Scanner;

public class SwitchExemploAula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a sua op��o: ");
        int opcao = input.nextInt();
        input.close();

        switch (opcao) { // n�o faz m�todos comparativos, n�o aceita boolean e s� aceita somente igual
            case 1:
                System.out.println("Sua op��o foi o n�mero 1");
                break; // Break � uma ordem de fluxo, onde sem para o fluxo
            case 2:
                System.out.println("Sua op��o foi o n�mero 2");
                break; // Break (parar) para n�o passar para as outras valida��es
            default: // como se fosse um else
                System.out.println("Op��o inv�lida");
                /*
                 Diferente do if, pois quando ele bate na primeira op��o e entende o que aquela op��o corresponde
                 ao que foi proposto, ele faz a l�gica e para, n�o tendo a necessidade de ter break
                 */

        }
    }
}
