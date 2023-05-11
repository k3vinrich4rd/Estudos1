package br.com.alura.estudos.javacurso.io.inputstream.scanner;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

//Utilizando um Scanner para ler dados de entrada
public class TesteScannerSeparandoValoresStringFormatELocale2 {
    public static void main(String[] args) throws Exception {

        //Nesse contexto, n�o � poss�vel utilizar somente o nome do arquivo passando como String
        //� necess�rio fazer a cria��o de um novo file
        Scanner firstInput = new Scanner(new File("contas.csv"));

        while (firstInput.hasNextLine()) {//Verifica se o que esta sendo lido tem uma pr�xima linha e devolve um true
            String line = firstInput.nextLine();
            // System.out.println(line);

            Scanner secondInput = new Scanner(line);

            secondInput.useLocale(new Locale("en", "US"));
            secondInput.useDelimiter(",");

            String typeAccount = secondInput.next();
            int agency = secondInput.nextInt();
            int number = secondInput.nextInt();
            String holder = secondInput.next();
            double balance = secondInput.nextDouble();

            String stringFormat = String.format(new Locale("pt", "BR"), "%s - %04d-%08d %s: %.2f", typeAccount, agency, number, holder, balance);
            System.out.println(stringFormat);

            secondInput.close();
        }


        firstInput.close();

    }
}