package poo.test.conta;

import poo.test.conta.Conta;

public class TestBanco4 {
    public static void main(String[] args) {

        Conta minhaConta;
        minhaConta = new Conta();
        Conta minhaConta2;
        minhaConta2 = new Conta();

        minhaConta.deposita(1000.0);
        minhaConta.transfere(minhaConta2, 500.0);

        System.out.println("Saldo da conta: " + minhaConta2.getBalance());



    }
}
