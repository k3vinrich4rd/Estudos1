package entradadedados;

import java.util.Scanner;

public class UtilizandoScannerString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.next();
        System.out.println("Voc� digitou: " + x);

        input.close();
    }
}
