package br.com.alura.estudos.javacurso.comparator.testordenacao;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.Client;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;
import br.com.alura.estudos.javacurso.poo.bytebank.template.SavingsAccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TesteOrdenacaoNaturalPeloSaldo {
    public static void main(String[] args) {

        Account cc1 = new CurrentAccount(22, 33);
        Client clienteCC1 = new Client();
        clienteCC1.setName("Nico");
        cc1.setHolder(clienteCC1);
        cc1.depositInAccount(333.0);

        Account cc2 = new SavingsAccount(22, 44);
        Client clienteCC2 = new Client();
        clienteCC2.setName("Guilherme");
        cc2.setHolder(clienteCC2);
        cc2.depositInAccount(444.0);

        Account cc3 = new CurrentAccount(22, 11);
        Client clienteCC3 = new Client();
        clienteCC3.setName("Paulo");
        cc3.setHolder(clienteCC3);
        cc3.depositInAccount(111.0);

        Account cc4 = new SavingsAccount(22, 22);
        Client clienteCC4 = new Client();
        clienteCC4.setName("Ana");
        cc4.setHolder(clienteCC4);
        cc4.depositInAccount(222.0);

        List<Account> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);


        System.out.println("Sem o m�todo de numeroDaContaComparator");
        for (Account list1 : lista) {
            System.out.println(list1);
        }
        System.out.println();


        //Definindo a ordem natural da lista pelo crit�rio de saldo
        Collections.sort(lista);

         /* Importante ? Para utilizar o m�todo compare podemos criar um objeto
         e uma vari�vel de refer�ncia, mas como usamos a vari�vel para passar
         apenas dentro do argumento do (sort), podemos fazer de uma maneira mais enxuta:*/
        // lista.sort(new TitularDaContaComparator());

        //Maneira menos enxuta
        // TitularDaContaComparator titularDaContaComparator = new TitularDaContaComparator();
        //lista.sort(titularDaContaComparator);

        System.out.println("Com o m�todo de numeroDaContaComparator ");
        for (Account list2 : lista) {
            System.out.println(list2);
        }

    }
}