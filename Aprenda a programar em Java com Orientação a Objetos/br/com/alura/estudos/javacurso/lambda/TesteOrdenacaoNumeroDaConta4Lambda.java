package br.com.alura.estudos.javacurso.lambda;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.Client;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;
import br.com.alura.estudos.javacurso.poo.bytebank.template.SavingsAccount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenacaoNumeroDaConta4Lambda {
    public static void main(String[] args) {

        Client cliente = new Client("Kevin Richard", "333.333.333-33");
        Client cliente2 = new Client("Abigail Richard", "333.333.333-33");

        Account cc1 = new CurrentAccount(22, 33);
        cc1.depositInAccount(333.0);
        cc1.setHolder(cliente);
        Account cc2 = new SavingsAccount(22, 44);
        cc2.depositInAccount(444.0);
        cc2.setHolder(cliente2);
        Account cc3 = new CurrentAccount(22, 11);
        cc3.depositInAccount(111.0);
        cc3.setHolder(cliente);
        Account cc4 = new SavingsAccount(22, 22);
        cc4.depositInAccount(222.0);
        cc4.setHolder(cliente);

        List<Account> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Sem o m�todo de numeroDaContaComparator");
        for (Account list : lista) {
            System.out.println(list);
        }
        System.out.println();


        //Lambda (Forma enxuta)
        lista.sort(Comparator.comparingInt(Account::getNumber));

        /* Explica��o, temos duas contas sendo comparadas e ordenadas
        atrav�s do crit�rio de n�mero da conta "getNumero" */

        System.out.println("Com o m�todo de numeroDaContaComparator ");
        lista.forEach(System.out::println);
    }
}