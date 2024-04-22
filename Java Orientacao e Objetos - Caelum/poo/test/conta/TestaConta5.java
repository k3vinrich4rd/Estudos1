package poo.test.conta;

import poo.exercises.conta.Conta;
import poo.exercises.conta.Data;

public class TestaConta5 {
    public static void main(String[] args) {

        Data data = new Data();
        Conta conta = new Conta();

        conta.setTitular("Kevin Richard");
        conta.setNumero(12345678);
        conta.setAgencia("agência teste");
        conta.depositar(1000.0);
        conta.sacar(100.0);
        conta.depositar(200.0);


        data.setDia(20);
        data.setMes(3);
        data.setAno(2024);

        conta.setDataDeAbertura(data);
        System.out.println(conta.recuperarDadosParaImpressao());


    }
}
