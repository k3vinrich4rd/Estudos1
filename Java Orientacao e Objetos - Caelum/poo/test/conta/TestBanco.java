package poo.test.conta;

import poo.Cliente;
import poo.test.conta.Conta;

public class TestBanco {
    public static void main(String[] args) {

        Conta minhaConta;
        Cliente cliente = new Cliente();
        minhaConta = new Conta();

        //Alterando os valores da conta
        minhaConta.setTitular(cliente);
        cliente.setNome("Kevin Richard");
        minhaConta.deposita(1000.0);

        //Saca 200 reais
        minhaConta.saca(200);

        //deposita 500 reais
        minhaConta.deposita(500);
        System.out.println("Saldo atual: " + minhaConta.getBalance());
    }
}
