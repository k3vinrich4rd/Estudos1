package br.com.alura.estudos.javacurso.io.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriterLendoUmArquivoEEscrevendo {
    public static void main(String[] args) throws IOException {

        //Utilizando file Writer
        FileWriter fileWriter = new FileWriter("lorem2.txt");
        //Com fileWrite � poss�vel escrever uma sequ�ncia de Strings
        fileWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " + "\n");
        fileWriter.write(System.lineSeparator()); //Forma mais elegante de se fazer um \n
        fileWriter.write(System.lineSeparator());  //Forma mais elegante de se fazer um \n
        fileWriter.write(System.lineSeparator());  //Forma mais elegante de se fazer um \n
        fileWriter.write("Voc� vai conseguir Kevin");

        fileWriter.close();
    }
}