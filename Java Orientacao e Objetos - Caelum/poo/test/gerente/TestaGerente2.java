package poo.test.gerente;

import poo.Gerente;

public class TestaGerente2 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(5000.0);
        System.out.println(gerente.getBonificacao());

    }
}
