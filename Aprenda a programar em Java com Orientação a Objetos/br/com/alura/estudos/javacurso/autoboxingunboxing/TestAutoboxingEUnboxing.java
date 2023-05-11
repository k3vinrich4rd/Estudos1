package br.com.alura.estudos.javacurso.autoboxingunboxing;

import java.util.ArrayList;
import java.util.List;

public class TestAutoboxingEUnboxing {
    public static void main(String[] args) {
/*
Importante ? S� existem listas de refer�ncias (Objetos)
S� existem cole��es de refer�ncias.
Curiosidade -> Para cada primitivo no mundo Java, existe algo que represente
esse tipo primitivo no mundo OO (Classes Wrapers*/

        int[] ages = new int[5];
        String[] names = new String[5];

        int idades = 29; //Integer � Tipo refer�ncia de int
        Integer idadeReferencia = new Integer(idades);   //por debaixo dos panos est� acontecendo uma especie de type cast
        List<Integer> numbers = new ArrayList<>();
        numbers.add(29); //M� pr�tica, pois uma cole��o n�o aceita tipo primitivos
        
    }
}
