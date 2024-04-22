package poo.test.pessoa;

import poo.exercises.pessoa.Pessoa;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Kevin Richard";
        pessoa.idade = 18;
        pessoa.fazAniversario();

        System.out.println("Nome da pessoa: " + pessoa.nome + "\n" + "Idade da pessoa: " + pessoa.idade);
    }
}
