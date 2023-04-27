package br.com.alura.estudos.javacurso.util.arraylist;

import java.util.ArrayList;

public class ArrayListDeEstados {
    public static void main(String[] args) {
        ArrayList<String> estadosDoBrasil = new ArrayList<>(26);

        estadosDoBrasil.add("Acre");
        estadosDoBrasil.add("Alagoas");
        estadosDoBrasil.add("Amap�");
        estadosDoBrasil.add("Amazonas");
        estadosDoBrasil.add("Bahia");
        estadosDoBrasil.add("Cear�");
        estadosDoBrasil.add("Distrito Federal");
        estadosDoBrasil.add("Esp�rito Santo");
        estadosDoBrasil.add("Goi�s");
        estadosDoBrasil.add("Maranh�o");
        estadosDoBrasil.add("Mato Grosso");
        estadosDoBrasil.add("Mato Grosso do Sul");
        estadosDoBrasil.add("Minas Gerais");
        estadosDoBrasil.add("Par�");
        estadosDoBrasil.add("Para�ba");
        estadosDoBrasil.add("Paran�");
        estadosDoBrasil.add("Pernambuco");
        estadosDoBrasil.add("Piau�");
        estadosDoBrasil.add("Rio de Janeiro");
        estadosDoBrasil.add("Rio Grande do Norte");
        estadosDoBrasil.add("Rio Grande do Sul");
        estadosDoBrasil.add("Rond�nia");
        estadosDoBrasil.add("Roraima");
        estadosDoBrasil.add("Santa Catarina");
        estadosDoBrasil.add("S�o Paulo");
        estadosDoBrasil.add("Sergipe");
        estadosDoBrasil.add("Tocantins");

        System.out.println("Fori (Estados)\n");
        for (int i = 0; i < estadosDoBrasil.size(); i++) {
            System.out.println(estadosDoBrasil.get(i));
        }
        System.out.println("---------------------------");

        System.out.println("forEach(Estados)\n");
        for (String estado : estadosDoBrasil) {
            System.out.println(estado);
        }

        ArrayList<String> capitaisBrasileirasDosEstados = new ArrayList<>();

        capitaisBrasileirasDosEstados.add("Rio Branco");
        capitaisBrasileirasDosEstados.add("Macei�");
        capitaisBrasileirasDosEstados.add("Macap�");
        capitaisBrasileirasDosEstados.add("Manaus");
        capitaisBrasileirasDosEstados.add("Salvador");
        capitaisBrasileirasDosEstados.add("Fortaleza");
        capitaisBrasileirasDosEstados.add("Bras�lia");
        capitaisBrasileirasDosEstados.add("Vit�ria");
        capitaisBrasileirasDosEstados.add("Goi�nia");
        capitaisBrasileirasDosEstados.add("S�o Lu�s");
        capitaisBrasileirasDosEstados.add("Cuiab�");
        capitaisBrasileirasDosEstados.add("Campo Grande");
        capitaisBrasileirasDosEstados.add("Belo Horizonte");
        capitaisBrasileirasDosEstados.add("Bel�m");
        capitaisBrasileirasDosEstados.add("Jo�o Pessoa");
        capitaisBrasileirasDosEstados.add("Curitiba");
        capitaisBrasileirasDosEstados.add("Recife");
        capitaisBrasileirasDosEstados.add("Teresina");
        capitaisBrasileirasDosEstados.add("Rio de Janeiro");
        capitaisBrasileirasDosEstados.add("Natal");
        capitaisBrasileirasDosEstados.add("Porto Alegre");
        capitaisBrasileirasDosEstados.add("Boa Vista");
        capitaisBrasileirasDosEstados.add("Florian�polis");
        capitaisBrasileirasDosEstados.add("S�o Paulo");
        capitaisBrasileirasDosEstados.add("Aracaju");
        capitaisBrasileirasDosEstados.add("Palmas");


        System.out.println("\nFor (Capitais)");
        for (int i = 0; i < capitaisBrasileirasDosEstados.size(); i++) {
            System.out.println(capitaisBrasileirasDosEstados.get(i));
        }
        System.out.println("---------------------------\n");

        System.out.println("forEach (Capitais)\n");
        for (String capital : capitaisBrasileirasDosEstados) {
            System.out.println(capital);
        }

    }
}

