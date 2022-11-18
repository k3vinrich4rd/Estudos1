package estruturacondicional.exercicios;

import java.util.Scanner;

/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startTime = input.nextInt();
        int finalHour = input.nextInt();
        int duration;

        if (startTime < finalHour) {
            duration = finalHour - startTime;
        } else {
            duration = 24 - startTime + finalHour;
        }
        System.out.println("THE GAME DURATION " + duration + " HOUR(S)");

        input.close();
    }
}
