package br.com.alura.estudos.javacurso.io.inputstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeituraComWhile {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com arquivo
        FileInputStream fileInputStream = new FileInputStream("lorem.txt"); //obt�m os byes de entrada relacionado ao arquivo
        //Transforma os bytes em caracteres
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); //Leitura da entrada desse fluxo de dados
        //Junta v�rios caracteres que est�o presentes em uma linha
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); //Armazenamento e leitura desses dados
        String linha = bufferedReader.readLine(); //Lendo linha por linha


        while (linha != null) {
            System.out.println(linha); //Impress�o do log
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();

        /*Por debaixo dos panos o FileInputStream et� sendo administrado por InputStreamReader
        E o inputStreamReader pelo BufferReader, e quando efetuamos a leitura, o BufferedReader
        pede para o InputStreamReader a linha de caracteres e o InputStreamReader pede ao FileInputStream
        os bits e bytes, e o FileInputStream l� os dados no seu argumento. */
    }
}