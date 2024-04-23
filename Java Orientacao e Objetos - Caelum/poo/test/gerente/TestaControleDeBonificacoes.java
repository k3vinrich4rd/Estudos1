package poo.test.gerente;

import poo.ControleDeBonificacoes;
import poo.Funcionario;
import poo.Gerente;

public class TestaControleDeBonificacoes {
    public static void main(String[] args) {

        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000.0);
        controle.registra(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(5000.0);
        controle.registra(funcionario2);

        System.out.println(controle.getTotalDeBonificacoes());

    }

}
