package estruturadecondicao;

import java.util.Scanner;

/*
If (Se) Defini��o
A estrutura de controle if (se),
 � utilizada para executar alguns comandos apenas se a sua condi��o for true (verdadeira).
 O else (sen�o) pode ou n�o acompanhar o if, mas o else n�o pode ser usado sozinho,
 � utilizado para executar alguns comandos caso a condi��o do if for false (falso)
 */
public class If { // Utilizando a estrutura If (Se) com um conectivo l�gico (! = nega��o)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade = 25;

        boolean isAutorizadoComprarBebidaAlcolica = idade >= 18;

        System.out.println("Voc� pode comprar bebida alc�lica");

        if (!isAutorizadoComprarBebidaAlcolica) { // ! = nega��o)
            System.out.println("Voc� n�o pode comprar bebida alcolica");
        }
    }
}

