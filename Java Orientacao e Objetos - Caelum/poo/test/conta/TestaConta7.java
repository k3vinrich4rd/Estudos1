package poo.test.conta;

import poo.exercises.conta.Conta;
import poo.exercises.conta.Data;

public class TestaConta7 {
    public static void main(String[] args) {


        Data data = new Data();
        Conta conta1 = new Conta("Carlos Eduardo");


        conta1.setNumero(12345678);
        conta1.setAgencia("agência teste");
        conta1.depositar(1000.0);
        conta1.sacar(100.0);
        conta1.depositar(200.0);

        conta1.setDataDeAbertura(data);
        System.out.println(conta1.recuperarDadosParaImpressao());

        System.out.println("Identificador: "  + conta1.getIdentificador());
    }
}
