package br.com.alura.estudos.javacurso.util.array;

import br.com.alura.estudos.javacurso.poo.bytebank.template.Account;
import br.com.alura.estudos.javacurso.poo.bytebank.template.CurrentAccount;
import br.com.alura.estudos.javacurso.poo.bytebank.template.SavingsAccount;

public class ArrayDeRerencias {
    public static void main(String[] args) {
        Account[] accounts = new Account[2];

        CurrentAccount currentAccount = new CurrentAccount(222, 222);
        accounts[0] = currentAccount;

        SavingsAccount savingsAccount = new SavingsAccount(333, 333);
        accounts[1] = savingsAccount;

        //esse trecho do c�digo da erro, porque o compilador n�o olha
        // na instancia��o do objeto, mas sim no array, e o tipo do array � Conta
        // ContaPoupan�a ref = contas[1];

        //Solu��o: fazer um cast. (Transforma��o) para conta poupan�a, pois � uma subclasse menos gen�rica
        //Exemplo:
        CurrentAccount ref = (CurrentAccount) accounts[0];
        System.out.println(currentAccount.getNumber());
        System.out.println(ref.getAgency());


    }

}
