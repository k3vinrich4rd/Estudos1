package br.com.alura.estudos.javacurso.io.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriterEmBufferedWriterLendoEEscrevendoEmUmArquivoFormaMaisEnxuta {
    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("lorem4.txt"));
        //Utilizando file Writer
        //Com fileWrite � poss�vel escrever uma sequ�ncia de Strings
        bufferedWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " + "\n");
        bufferedWriter.newLine();//Forma mais elegante de se fazer um \n
        bufferedWriter.write("Voc� vai conseguir Kevin");

        bufferedWriter.close();
    }
}