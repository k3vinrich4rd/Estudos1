package poo.test.conta;

import poo.exercises.conta.Conta;
import poo.exercises.conta.Data;

public class TestaConta4 {
    public static void main(String[] args) {

        Data data = new Data();
        data.setDia(20);
        data.setMes(3);
        data.setAno(2024);


        Conta c1 = new Conta();
        c1.setTitular("Kevin Richard");
        c1.depositar(100);

        c1.setDataDeAbertura(data);
        System.out.println(c1.recuperarDadosParaImpressao());


    }
}
