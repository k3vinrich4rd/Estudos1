package br.com.alura.estudos.javacurso.io.inputstream.scanner;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

//Utilizando um Scanner para ler dados de entrada
public class TesteScannerSeparandoValores {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        //Nesse contexto, n�o � poss�vel utilizar somente o nome do arquivo passando como String
        //� necess�rio fazer a cria��o de um novo file
        Scanner input = new Scanner(new File("contas.csv"));
        while (input.hasNextLine()) {//Verifica se o que esta sendo lido tem uma pr�xima linha e devolve um true
            String line = input.nextLine();
            System.out.println(line);

            Scanner input1 = new Scanner(line);
            input1.useLocale(Locale.US); // Para definir a virgulo como ponto "." pois � como est� no arquivo
            //Que est� sendo lido
            input1.useDelimiter(",");

            String typeAccount = input1.next();
            int agency = input1.nextInt();
            int number = input1.nextInt();
            String holder = input1.next();
            double balance = input1.nextDouble();

            System.out.println(typeAccount + agency + number + holder + balance);

            input1.close();
        }


        input.close();

    }
}