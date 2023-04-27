package br.com.alura.estudos.javacurso.wrapper;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapperAndClasseMaeNumber {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue()); //unboxing

        Double dRef = Double.valueOf(3.2); //autoboxing
        System.out.println(dRef.doubleValue()); //unboxing

        Boolean bRef = false; //autoboxing
        System.out.println(bRef.booleanValue() + "\n"); //unboxing


        /*Number � classe m�e de todos os tipos num�ricos primitivos e Wrapper
         * classe gen�rica e abstrata*/
        //Formas ultrapassadas
        Number refNumber = Integer.valueOf(3);
        Number refNumber2 = new Double(34);

        //Fazendo uma lista com number, onde � poss�vel acessar qualquer tipo de n�mero:

        List<Number> numbers = new ArrayList<>();

        numbers.add(33);
        numbers.add(34.5);
        numbers.add(3);
        numbers.add(55.0f);
        numbers.add(1100L);

        //Percorrendo:
        System.out.println("forEach");
        for (Number number: numbers) {
            System.out.println(number);
        }
        System.out.println();


        System.out.println("fori");
        for (Integer i = 0; i<numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }
}